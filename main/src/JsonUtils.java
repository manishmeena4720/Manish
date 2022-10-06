/*
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

*/
/*
packagejavaTpoint.javacodes;
// we use classes of nio package to read bytes data of the JSON file
        importjava.nio.file.Files;
        importjava.nio.file.Paths;
        importjava.util.Scanner;*//*

// create ReadFileAsString class to convert json file into string
public class JsonUtils {
    // main() method start
    public static void main(String[] args) throws Exception {   //handle exception
        // declare fileName, location, and file variable that will store the user entered file name, location, and file data as a string, respectively
        String fileName, file, location;
        // create scanner class object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the file which you want to convert or access as string: ");
        // take input from user and initialize filName variable
        fileName = sc.nextLine();
        System.out.print("Enter the laction of the "+fileName+" file: ");
        // take input from user and initialize location variable
        location = sc.nextLine();
        // close scanner class obj
        sc.close();
        // call convertFileIntoString() method that will return the file data as string. We store the returned data into file variable
        file = convertFileIntoString(location+"\\"+fileName);
        // print the result, i.e., JSON data in form of string
        System.out.println(file);
    }
    // create convertFileIntoString() method to convert JSON file into string
    public String convertFileIntoString(String file)throws Exception
    {
        // declare a variable in which we store the JSON data as a string and return it to the main() method
        String result;
        // initialize result variable
        // we use the get() method of Paths to get the file data
        // we use readAllBytes() method of Files to read byted data from the files
        result = new String(Files.readAllBytes(Paths.get(file)));
        // return result to the main() method
        return result;
    }
}
*/
