import java.util.Random;

public class NIGenerator  {
    public String generateNI(User uData){

        char firstChar = uData.getFirstName().charAt(0);
        char lastChar = uData.getLastName().charAt(0);
        String twoDigitDOB = uData.getDateOfBirth().substring(8,10);
        char countryCode  = uData.getCountryOfBirth().charAt(0);

        Random random = new Random();
        int fourDigitRandomNumber = random.nextInt(9000) + 1000;

        StringBuilder nin = new StringBuilder();
        nin.append(firstChar).append(lastChar).append(twoDigitDOB).append(fourDigitRandomNumber).append(countryCode);

        return nin.toString();
    }


}
