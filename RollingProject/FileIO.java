import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileIO {
    private String fileName;

	//default constructor
    public FileIO(){
        fileName = "";
    }
    public FileIO(String newFileName) {
        fileName = newFileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String readFile() throws IOException {
        String contents = "";
        if(fileName.trim().length() > 0) {
            try {
                FileReader inputFile = new FileReader(fileName);
                Scanner scanner = new Scanner(inputFile);
                while (scanner.hasNextLine()) {
                    contents += scanner.nextLine() + "\n";
                }
                inputFile.close();
            } catch (FileNotFoundException e) {
                System.out.println(fileName + "File not found");
            } catch (IOException e) {
                System.out.printf("IO Exception - check the permission or storage allocation! " + e);
            } catch (Exception e) {
                System.out.println("Exception is caught in Exception class! " + e);
            }
        }else
            System.out.println("Please enter a file name");
        return contents;
    }


    public void writeFile(String content){
        try {
            if (fileName.trim().length() > 0) {
                PrintWriter outputFile = new PrintWriter(fileName);
                outputFile.println(content);
                outputFile.close();
            } else
                System.out.println("Please enter a FileName");
        }catch (IOException e){
            System.out.println("An error was occured while trying to write the data to the " + fileName + "file");
        }
    }
}


