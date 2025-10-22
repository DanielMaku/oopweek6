package ie.atu.week4new;

import java.util.ArrayList;
import java.util.Scanner;

public class studentApp
{
    public static void main( String[] args )
    {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<student> studentsList = new ArrayList<>();

        System.out.println("Enter number of students:");
        int Totals = sc.nextInt();
        sc.nextLine();
        // makes it count up to the amount of students put in
        while(count < Totals)
        {

            // asking for details
            System.out.println("Enter name: ");
            String name = sc.next();

            System.out.println("Enter email: ");

            String email = sc.next();
            boolean containsEmail = false;

            for(student student : studentsList){
                if(student.getEmail().equals(email)){
                    containsEmail = true;
                    break;
                }
            }

            if(containsEmail){
                System.out.println("There is already a student with that email");
            }
            else{
                System.out.println("Enter student ID");
                String studentId = sc.next();

                student student1 = new student();

                student1.setName(name);
                student1.setEmail(email);
                student1.setStudentID(studentId);
                studentsList.add(student1);
                count++;
            }
        }

        for(student student : studentsList) {
            System.out.println(student);
        }

    }
}