import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestNIGenerator {

    @Test
    public void testGenNI(){
        NIGenerator niGen = new NIGenerator();
        User user = new User();

        user.setFirstName("Mohammad");
        user.setLastName("Hussain");
        user.setDateOfBirth("10-02-1984");
        user.setCountryOfBirth("India");

        String nin = niGen.generateNI(user);
        System.out.println(nin);

        assertEquals('M',nin.charAt(0));
        assertEquals('H',nin.charAt(1));
        assertEquals('I',nin.charAt(8));
        assertEquals("84",nin.substring(2,4));

        String substrrandom = nin.substring(4,8);
        //System.out.println(substrrandom);
        int checkInt = Integer.parseInt(substrrandom);

        boolean checkRandomNumber = false;
        if (checkInt>=1000 && checkInt<=9999)
            checkRandomNumber=true;
        assertTrue(checkRandomNumber);
        System.out.println(checkRandomNumber);

    }
}
