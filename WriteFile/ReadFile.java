package WriteFile;

import java.io.*;

import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
    String filePath = "src/read_file.txt";

//    try(BufferedReader reader = new BufferedReader( new FileReader(filePath) )){
//        String line;
//        while((line=reader.readLine())!=null){
//            System.out.println(line);
//        }
//
//    } catch (IOException e) {
//        throw new RuntimeException(e);
//    }


        try(Scanner scanner = new Scanner(new File(filePath))){
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);  // Print each line
            }
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
}
