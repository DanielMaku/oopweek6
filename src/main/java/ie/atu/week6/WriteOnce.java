package ie.atu.week6;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteOnce {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the file name (e.g., students.txt: ");
        String fileName = sc.nextLine().trim();

        System.out.println("enter a name to save : ");
        String name = sc.nextLine().trim();

        try(PrintWriter out = new PrintWriter(new FileWriter(fileName,true)))
        {
            out.println(name);
            System.out.println("Saved to" +fileName);
        }
        catch (IOException ex)
        {
            System.out.println("Error" + ex.getMessage());
        }





    }

}
