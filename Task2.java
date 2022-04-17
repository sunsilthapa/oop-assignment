import javax.swing.*;

/*1. Write a program to take student details as input and display the result.*/
public class Task2 {
    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog(null,"Enter your name: ");
        int age=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age: "));
        int grade= Integer.parseInt(JOptionPane.showInputDialog(null,"Enter grade name: "));
        int phone=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter phone no: "));

        JOptionPane.showMessageDialog(null,"Your name is "+name);
        JOptionPane.showMessageDialog(null,"Your age is "+age);
        JOptionPane.showMessageDialog(null, "YOu read in grade"+grade);
        JOptionPane.showMessageDialog(null, "You phone no is"+phone);

    }
}
/*2. Write a program to calculate sum of four numbers taking user input*/
class Two{
    public static void main(String[] args) {
        double a,b,c,d;
        a=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the first no: "));
        b=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the second no: "));
        c=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the third no: "));
        d=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the fourth no: "));

        double sum=a+b+c+d;
        JOptionPane.showMessageDialog(null, "the sum of four no is "+sum);
    }
}
/*3. Write a program to take input of the total marks of four subjects of a student and calculate
the total percentage secured. Then display the percentage and final result of the student;
If equal to or more than 70 -> First Class
If more than 59 -> Upper second Class
If more than 49 -> Second class
If more than 39 -> Third class and if below than 40 the result is fail.*/
class Three{
    public static void main(String[] args) {
        double a,b,c,d;
        a=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the marks of  first : "));
        b=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the marks of second : "));
        c=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the marks of third : "));
        d=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the marks of  fourth : "));

        double t_marks=a+b+c+d;
        double t_percent=(a+b+c+d)/4;

        JOptionPane.showMessageDialog(null, "YOur total marks is: "+t_marks);
        JOptionPane.showMessageDialog(null, "YOur total percent is: "+t_percent);


        String result;

        result=(t_percent>=70 && t_percent<=100) ? "First class":(t_percent>=59 && t_percent<=70) ?"Upper Second class":(t_percent>=49 && t_percent<=59) ? "second class":(t_percent>=39)?"Third class":"Fail";
        JOptionPane.showMessageDialog(null, "Your final result is: "+result);


    }
}

/*4. Write a program to take two integer inputs from user and print sum and product of them.*/
class Four{
    public static void main(String[] args) {
        int a, b;
        a=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first no:"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the second no:"));

        int sum=a+b;
        int product=a*b;

        JOptionPane.showMessageDialog(null,"The sum is"+sum+"\n The product is"+product);
    }
}
/*5. Take two integer inputs from user. First calculate the sum of two then product of two.
Finally, print the sum and product of both obtained results.
*/
class Five{
    public static void main(String[] args) {
        int a, b;
        a=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first no:"));
        b=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the second no:"));

        int sum=a+b;
        int product=a*b;
        JOptionPane.showMessageDialog(null,"The sum is"+sum+"\n The product is"+product);

        int sum1=sum+product;
        int product1=sum*product;
        JOptionPane.showMessageDialog(null,"The sum of obtained no is"+sum+"\n The product of obtained no is"+product);

    }
}
/*6. Ask user to give two double input for length and breadth of a rectangle and print area type
casted to int.
*/
class Six{
    public static void main(String[] args) {
        double length, breadth;
        length=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the length: "));
        breadth=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the breadth: "));

        double area=length*breadth;

        Double a=new Double(area);
        int area_rec=a.intValue();

        JOptionPane.showMessageDialog(null,"Area of rectangle is "+area_rec);


    }
}

/*7. Take name, roll number and field of interest from user and print in the format below :Hey,
my name is xyz and my roll number is xyz. My field of interest are xyz.*/
class Seven{
    public static void main(String[] args) {
        String name, field_of_interest;
        name = JOptionPane.showInputDialog(null, "Enter you name: ");
        int roll =Integer.parseInt(JOptionPane.showInputDialog(null, "Enter you roll no: "));
        field_of_interest = JOptionPane.showInputDialog(null, "Enter you field of interest: ");

        JOptionPane.showMessageDialog(null, "My name is"+name+"\n my roll no is"+roll+"\n MY field of interest is"+field_of_interest);
    }
}

/*8. Take side of a square from user and print area and perimeter of it. Also, calculate SI, Area
of triangle and Volume of Cube and Cuboid. Take the attributes as user input.
*/
class A{
    public static void main(String[] args) {
        double principal=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the principal amount "));
        double time=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the time "));
        double rate=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the rate of interest "));

        double interest=(principal*time*rate)/100;
        JOptionPane.showMessageDialog(null, "The simple interest is"+ interest);

    }
}

class T_area{
    public static void main(String[] args) {
        double height=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the height "));
        double base=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the base of trinagle "));

        double area_triangle=(height*base)/2;
        JOptionPane.showMessageDialog(null, "The are of triangle is"+area_triangle);
    }
}

class C{
    public static void main(String[] args) {
        double length=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the length of cube "));
        double v_cube=Math.pow(length,2);
        JOptionPane.showMessageDialog(null, "The volume of cube is"+ v_cube);
    }
}

class D{
    public static void main(String[] args) {
        double height=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the height "));
        double breadth=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the breadth "));
        double length=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the length "));

        double v_cuboid=length*breadth*height;
        JOptionPane.showMessageDialog(null, "The volume of cuboid is"+v_cuboid);

    }
}

/*. Write a program to find square of a number.
E.g.- INPUT : 2 OUTPUT : 4
INPUT : 5 OUTPUT : 25*/
class Nine{
    public static void main(String[] args) {
        double num=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a number  "));
        double square=num*num;
        JOptionPane.showMessageDialog(null, "The square of a "+num+" is "+square);
    }
}

/*10. Take two different string input and print them in same line. E.g.-
INPUT : Codes
Dope
OUTPUT : CodesDope*/
class Tan{
    public static void main(String[] args) {
        String a, b;
        a=JOptionPane.showInputDialog(null, "The the first string ");
        b=JOptionPane.showInputDialog(null, "The the second string ");

        JOptionPane.showMessageDialog(null, ""+a+b);
    }
}

/*11. Take 3 inputs from user and check :
all are equal
any of two are equal
( use && || with ternary operator )*/
class Eleven{
    public static void main(String[] args) {
        double num1=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a first number  "));
        double num2=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a second number  "));
        double num3=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a third number  "));

        if(num1==num2 && num1==num3){
            JOptionPane.showMessageDialog(null,"all no are equal");
        }
        else if(num1==num2 ||num1==num3){
            JOptionPane.showMessageDialog(null,"only two numbers are equal");
        }
        else{
            JOptionPane.showMessageDialog(null,"none of them are equal");
        }
    }
}

/*12. Write a program to enter the values of two variables 'a' and 'b' from keyboard and then
check if both the conditions 'a < 50' and 'a < b' are true.*/
class Twelve{
    public static void main(String[] args) {
        double a=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the first no: "));
        double b=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the second no: "));

        String result=(a<50 && a<b)? "Yes both the condition is true": "both condition in false";
        JOptionPane.showMessageDialog(null,result);
    }
}
/*13. If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
write a program to calculate his total marks and percentage marks.*/
class Thirteen{
    public static void main(String[] args) {
        double a,b,c;
        a=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the marks of  first : "));
        b=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the marks of second : "));
        c=Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the marks of third : "));

        double t_marks=a+b+c;
        double t_percent=(a+b+c)/3;

        JOptionPane.showMessageDialog(null, "YOur total marks is: "+t_marks);
        JOptionPane.showMessageDialog(null, "YOur total percent is: "+t_percent);
    }
}