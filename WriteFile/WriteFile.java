package WriteFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        String FilePath = "src/new_file.txt";
        String FileContent = "This is newly created file and i am writing here first content";

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(FilePath))){
            writer.write(FileContent);
            writer.newLine();
            writer.write("Any new content added like this...");
            System.out.println("File write success");
        }
        catch (IOException e){
            e.printStackTrace();
            System.out.println("Something wrong..");
        }
    }
}
