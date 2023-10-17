import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountNINForACountry {

    public Map<String, Integer> countNINPerCountry() throws CsvValidationException, IOException {

        CSVReaderExample csvReaderExample = new CSVReaderExample();
        List<User> users = csvReaderExample.readUsersFromCSV();
        Map<String, Integer> countryCounts  = new HashMap();
        countryCounts.put("Wales", 0);
        countryCounts.put("England", 0);
        countryCounts.put("Scotland", 0);
        countryCounts.put("Northern Ireland", 0);
        countryCounts.put("Non UK", 0);

        for (User user : users) {
            String country = user.getCountryOfBirth();

            if (countryCounts.containsKey(country)) {
                int count = countryCounts.get(country);
                countryCounts.put(country, count + 1);
            } else {
                // If the country is not recognized, count it as "Non UK"
                int count = countryCounts.get("Non UK");
                countryCounts.put("Non UK", count + 1);
            }


        }
        return countryCounts;
    }
    public CountNINForACountry() throws CsvValidationException, IOException {
    }


}
