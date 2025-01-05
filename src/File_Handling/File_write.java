package File_Handling;

import java.io.FileWriter;
import java.util.Scanner;

public class File_write {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a file name : ");
        String fileName = input.next();

        try (FileWriter fw = new FileWriter("d:// " + fileName + ".txt")){
            Scanner sc = new Scanner(System.in);

            System.out.print("Write your name : ");
            String name = sc.nextLine();

            System.out.print("Write your address : ");
            String address = sc.nextLine();

            System.out.print("What do you do now : ");
            String doing = sc.nextLine();

            fw.write("Name : "+ name + "\n"+ "Address : "+ address + "\n"+ "Occupation : "+ doing);
            System.out.println("File written successfully!!");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        input.close();
    }

}
