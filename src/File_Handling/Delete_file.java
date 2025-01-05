package File_Handling;

import java.io.File;
import java.util.Scanner;

public class Delete_file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name you want to delete : ");
        String delFile = sc.next();

        File fd = new File("d://" + delFile + ".txt");
        if(fd.delete()){
            System.out.println("File delete successfully");
        }
        else {
            System.out.println("Failed to delete the file. File may not exist or is in use.");
        }
    }
}
