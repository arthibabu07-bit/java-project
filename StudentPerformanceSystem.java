import java.util.Scanner;
public class StudentPerformanceSystem {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String name;
String regNo;
int tamil, english, dm, javaTheory, javaLab, idt;
int total;
double percentage;
char grade;
System.out.println("----- Student Academic Performance Management System-----");
// Student details
System.out.print("Enter Student Name: ");
name = sc.nextLine();
System.out.print("Enter Register Number: ");
regNo = sc.nextLine();
// Marks entry
System.out.print("Enter Tamil Marks: ");
tamil = sc.nextInt();
System.out.print("Enter English Marks: ");
english = sc.nextInt();
System.out.print("Enter Discrete Mathematics Marks: ");
dm=sc.nextInt();
System.out.print("Enter Java Theory Marks: ");
javaTheory = sc.nextInt();
System.out.print("Enter Java Programming Lab Marks: ");
javaLab = sc.nextInt();
System.out.print("Enter Innovation & Design Thinking Marks: ");
idt = sc.nextInt();
// Total calculation
total = tamil + english + dm + javaTheory + javaLab + idt;
// Percentage
percentage = total / 6.0;
// Grade calculation
if (percentage >= 90)
grade = 'A';
else if (percentage >= 75)
grade = 'B';
else if (percentage >= 60)
grade = 'C';
else if (percentage >= 50)
grade = 'D';
else
grade = 'F';
// Display result
System.out.println("\n------ STUDENT RESULT------");
System.out.println("Name: " + name);
System.out.println("Register Number: " + regNo);
System.out.println("\nSubject Marks:");
System.out.println("Tamil: " + tamil);
System.out.println("English: " + english);
System.out.println("Discrete Mathematics: " + dm);
System.out.println("Java Theory: " + javaTheory);
System.out.println("Java Programming Lab: " + javaLab);
System.out.println("Innovation & Design Thinking: " + idt);
System.out.println("\nTotal Marks: " + total);
System.out.println("Percentage: " + percentage + "%");
System.out.println("Grade: " + grade);
System.out.println("\nThank You!");
}
}