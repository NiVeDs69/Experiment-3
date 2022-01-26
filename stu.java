import java.util.*;

 class stu
{
    public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name of student: ");
        String str=sc.nextLine();
        
        System.out.print("Enter the class: ");
        int s= sc.nextInt();
        
        System.out.print("Enter roll no of student: ");
        int r = sc.nextInt();
        
        System.out.print("Enter marks in English subject: ");
        int m1 = sc.nextInt();
        
        System.out.print("Enter marks in Maths subject: ");
        int m2 = sc.nextInt();
        
        System.out.print("Enter marks in Chemistry subject: ");
        int m3 = sc.nextInt();
        
        System.out.print("Enter marks in Physics subject: ");
        int m4 = sc.nextInt();
        
        System.out.print("Enter marks in Malayalam subject: ");
        int m5 = sc.nextInt();
        
        int total = m1 + m2 + m3 + m4 + m5;
        double percentage = total/ 500.0 * 100.0;
        String grade;
        if (percentage >= 90)
            grade= "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage  >=70)
            grade = "B+";
        else if (percentage  >= 60)
            grade = "B";
        else if (percentage  >= 50)
            grade = "C";
        else if (percentage  >= 40)
            grade = "D";
        else
            grade = "E";
            
        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage);
        System.out.println("Grade = " + grade);
    }
}
