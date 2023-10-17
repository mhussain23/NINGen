import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReaderExample {
   /* public static void main(String[] args) throws CsvValidationException, IOException {
      //  String csvFile = "userdata.csv"; // Replace with your CSV file path
        List<User> users = readUsersFromCSV();

        NIGenerator niGenerator = new NIGenerator();

        int cout =0;
        // Print the populated user objects
        for (User user : users) {
            System.out.println(user.getFirstName() + " | " + user.getLastName() + " | " + user.getDateOfBirth()
                    + " | " + user.getCountryOfBirth());
            System.out.println(niGenerator.generateNI(user));
            cout++;
            if (cout==74)
                break;
        }
    }
*/
    public List<User> readUsersFromCSV() throws IOException, CsvValidationException {
        String csvFile = "userdata.csv"; // Replace with your CSV file path
        List<User> users = new ArrayList<>();

        try (CSVReader csvReader = new CSVReaderBuilder(new FileReader(csvFile)).withSkipLines(1).build()) {
            String[] line;
            while ((line = csvReader.readNext()) != null) {
                    String fname = line[0];
                    String lname = line[1];
                    String dob = line[4];
                    String cob = line[5];
                    User user = new User(fname, lname, dob, cob);
                    users.add(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return users;
    }
}
