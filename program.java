import java.util.*;
class program
{
public static void main(String[]args)
{
String name;
int age;
float salary;
Scanner s1=new Scanner(System.in);
System.out.println("enter the name");
System.out.println("enter the age");
System.out.println("enter the salary");
   name=s1.nextLine();
   age=s1.nextInt();
   salary=s1.nextFloat();
System.out.println("name is"+name);
System.out.println("age is"+age);
System.out.println("salary is"+salary);
}
}