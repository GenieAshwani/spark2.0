package Project;

import java.util.HashMap;
import java.util.Map;

public class PanService {
    private static Map<String,Pan> panMap=new HashMap<>();

    static {
        panMap.put("EDWABCS123N4",new Pan("EDWABCS123N4",
                "1232332234","HDFC BANK",
                "Stock,ELSS,FD"));
        panMap.put("EDWABCS123N6",new Pan("EDWABCS123N6",
                "1232332236","SBI BANK",
                "Stock,FD"));
    }

    public Pan getPanByAadhaarNumber(String aadhaarNumber)
    {
        for(Pan pan:panMap.values())
        {
            if(pan.getAadhaarNumber().equals(aadhaarNumber))
            {
                return pan;
            }
        }
        return null;
    }
}
