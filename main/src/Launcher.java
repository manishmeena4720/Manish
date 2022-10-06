import jdk.jfr.DataAmount;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
/*import lombok.Data;
import lombok.extern.slf4j.Slf4j;
@Slf4j*/

public class Launcher {

    public static void main(String[] args) throws Exception{
        System.out.println("abc");
        String file = convertFileIntoString("resources/DueBillsSetup.json");
        //System.out.println(file);
        for (int i = 0; i < file.length(); i++) {
            if (file.charAt(i) == 'f' && file.substring(i,i+9).equals("fieldName")) {
                //System.out.println(i);
                i=i+10;
                int start =0;
                int end =0;
                while(file.charAt(i)!='"') {
                    i++;
                }
                start = i;
                i++;
                while(file.charAt(i)!='"') {
                    i++;
                }
                end = i;
                i++;
                file = file.substring(0,i+1) + "\n\"displayName\": \""+modifiedString(file.substring(start+1,end))+"\","+file.substring(i+1);

            }
        }
        System.out.println(file);

    }

    public static String convertFileIntoString(String file)throws Exception
    {
        String result = new String(Files.readAllBytes(Paths.get(file)));
        return result;
    }
    public static String modifiedString(String sub) {
        for (int i = 0; i < sub.length(); i++) {
            if (Character.isUpperCase(sub.charAt(i))) {
                sub = sub.substring(0,i) + " " + sub.substring(i);
                i++;
            }
        }
        sub = sub.substring(0,1).toUpperCase() + sub.substring(1);

        return sub;
    }


}
