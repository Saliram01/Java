package File_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read_file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name you want to read : ");
        String readFilename = sc.next();

        try (FileReader fr = new FileReader("d://" + readFilename + ".txt")){
            int read = 0;
            do{
                read = fr.read();
                System.out.print((char)read);
            } while(read != -1);
        }
        catch (FileNotFoundException e){
            System.out.printf("%s file not found ", readFilename);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
