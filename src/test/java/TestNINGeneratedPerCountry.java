import com.opencsv.exceptions.CsvValidationException;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class TestNINGeneratedPerCountry {

    @Test
    public void testNINperCountry() throws CsvValidationException, IOException {

        CountNINForACountry countNINForACountry = new CountNINForACountry();
        Map map = countNINForACountry.countNINPerCountry();
        System.out.println(map);

        Integer walesCount =13;
        assertEquals(walesCount,map.get("Wales"));

        Integer englandCount =12;
        assertEquals(englandCount,map.get("England"));

        Integer scotlandCount =13;
        assertEquals(scotlandCount,map.get("Scotland"));

        Integer nICount =15;
        assertEquals(nICount,map.get("Northern Ireland"));

        Integer nonUKCount =21;
        assertEquals(nonUKCount,map.get("Non UK"));

        CSVReaderExample csvReaderExample = new CSVReaderExample();
        List l = csvReaderExample.readUsersFromCSV();
        assertEquals(74,l.size());

    }
}
