package creatingmaplab;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author J-Tron
 */
public class CreatingMapLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RockBand band1 = new RockBand("1", 4, "Five Finger Deathpunch", "Chicago", "11/22/1996");
        RockBand band2 = new RockBand("2", 5, "Breaking Benjamin", "St.Louis", "07/04/2001");
        RockBand band3 = new RockBand("3", 4, "Avenged Sevenfold", "Miami", "03/12/2003");
    
        Map <String, RockBand> bandMap = new <String, RockBand> LinkedHashMap();
    
        bandMap.put("1", band1);
        bandMap.put("2", band2);
        bandMap.put("3", band3);
    
        Set<String> keys = bandMap.keySet();
        
        for(String key : keys){
        RockBand found = bandMap.get(key);
        System.out.println(
                
                 "Band Name:" + found.getBandName() + '\n' +
                 "Home Town:" + found.getHomeTown() + '\n' +
                 "Founded On:" + found.getFoundedOnDate()
                 );
     }
    
    }
}
