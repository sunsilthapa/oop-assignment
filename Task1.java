import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//    1. Write a program to take student details as input and display the result.
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter you name:");
        String name=scanner.nextLine();
        System.out.println("Your name is"+name);

        System.out.println("Enter you address:");
        String address=scanner.nextLine();
        System.out.println("Your address is"+address);

        System.out.println("Enter you age:");
        int age=scanner.nextInt();
        System.out.println("Your age is"+age);

        System.out.println("Enter your phone no:");
        int phone_no=scanner.nextInt();
        System.out.println("Your phone no is"+phone_no);
    }
}
//2. Write a program to calculate sum of four numbers taking user input.
class Sum{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the first no:");
        float num1=scanner.nextInt();
        System.out.println("Enter the second no:");
        float num2=scanner.nextInt();

        System.out.println("Enter the third no:");
        float num3=scanner.nextInt();

        System.out.println("Enter the fourth no:");
        float num4=scanner.nextInt();

        double sum=num1+num2+num3+num4;
        System.out.println("The sum of four no is"+sum);
    }
}
//3. Write a program to take input of the total marks of four subjects of a student and calculate
//the total percentage secured. Then display the percentage and final result of the student;
//a. If equal to or more than 70 -> First Class
//b. If more than 59 -> Upper second Class
//c. If more than 49 -> Second class
//d. If more than 39 -> Third class and if below than 40 the result is fail.
class Result{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        float social, science,math,oop,t_marks, t_percent;
        System.out.println("Enter the mark of social");
        social=scanner.nextFloat();
        System.out.println("Enter the mark of science");
        science=scanner.nextFloat();
        System.out.println("Enter the mark of math");
        math=scanner.nextFloat();
        System.out.println("Enter the mark of oop");
        oop=scanner.nextFloat();

        t_marks=social+science+math+oop;
        t_percent=t_marks/4;
        System.out.println("your total marks is "+t_marks);
        System.out.println("your total percent is "+t_percent);

        if(t_percent>=70 && t_percent<=100){
            System.out.println("First class");
        }
        else if(t_percent>=59 && t_percent<=70){
            System.out.println("Upper second class");
        }
        else if(t_percent>=49 && t_percent<=59){
            System.out.println("second class");
        }
        else if(t_percent>=39 && t_percent<=49){
            System.out.println("third class");
        }
        else {
            System.out.println("Fail");
        }

    }
}
//4. Write a program to take two integer inputs from user and print sum and product of them
class Product{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first no:");
        float num1=scanner.nextInt();
        System.out.println("Enter the second no:");
        float num2=scanner.nextInt();

        float sum=num1+num2;
        float product=num1*num2;

        System.out.println("the sum of two no is"+sum);
        System.out.println("the product of two no is"+product);
    }
}
//5. Take two integer inputs from user. First calculate the sum of two then product of two.
//Finally, print the sum and product of both obtained results.
class Sss{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first no:");
        float num1=scanner.nextInt();
        System.out.println("Enter the second no:");
        float num2=scanner.nextInt();

        float sum=num1+num2;
        float product=num1*num2;

        System.out.println("the sum of two no is"+sum);
        System.out.println("the product of two no is"+product);

        float obtained_num1=sum;
        float obtained_num2=product;

        float sum1=obtained_num1+obtained_num2;
        float product1=obtained_num1*obtained_num2;

        System.out.println("the sum of ontained no is:"+sum1);
        System.out.println("the product of ontained nos is:"+product1);
    }
}

//6. Ask user to give two double input for length and breadth of a rectangle and print area type
//casted to int.
class Area{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double length=scanner.nextInt();
        double breadth=scanner.nextInt();


        double area=length*breadth;

        Double a=new Double(area);
        int area_rect=a.intValue();

        System.out.println("the area of rectangle is:"+area_rect);
    }
}
//7. Take name, roll number and field of interest from user and print in the format below :Hey,
//my name is xyz and my roll number is xyz. My field of interest are xyz.
class Details{
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your name:");
        String name=scanner.nextLine();
        System.out.println("Enter your roll no:");
        int roll_no=scanner.nextInt();
        System.out.println("Enter your field of interest:");
        String interest=scanner.nextLine();

        System.out.println("Hey,my name is "+name);
        System.out.println("My roll no is"+roll_no);
        System.out.println("MY field of interest is "+interest);
    }
}
//8. Take side of a square from user and print area and perimeter of it. Also, calculate SI, Area
//of triangle and Volume of Cube and Cuboid. Take the attributes as user input.
class Peri_area{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a side of square;");
        float l=scanner.nextFloat();
        float area=l*l;
        float perimeter=4l;

        System.out.println("the area of square is"+area);
        System.out.println("the perimeter of square is"+perimeter);
    }
}
class SI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal amt");
        double principal =scanner.nextDouble();
        System.out.println("Enter the rate");
        double rate =scanner.nextDouble();
        System.out.println("Enter the time");
        double time =scanner.nextDouble();

        double interest=(principal*time*rate)/100;
        System.out.println("the simple interest is "+interest);
    }
}
class Tri_area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the height of triangle");
        double h=scanner.nextDouble();
        System.out.println("Enter the base of triangle");
        double b=scanner.nextDouble();

        double area=(h*b)/2;
        System.out.println("Area of tringle is"+area);
    }
}
class Vlo_cube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of cube");
        double l=scanner.nextDouble();
        double volume=l*l*l;
        System.out.println("The volume of cube is"+volume);

    }
}
class Cuboid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of cuboid");
        double l=scanner.nextDouble();
        System.out.println("Enter the breadth of cuboid");
        double b=scanner.nextDouble();
        System.out.println("Enter the height of cuboid");
        double h=scanner.nextDouble();
        double volume=l*b*h;
        System.out.println("the voulume of cuboiod is "+volume);
    }
}
//9. Write a program to find square of a number.
//E.g.- INPUT : 2 OUTPUT : 4
//INPUT : 5 OUTPUT : 25

class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the no to find square");
        double a=scanner.nextDouble();

//        double square=a*a;
        double square=Math.pow(a,2);
        System.out.println("The square of given no is "+square);

    }
}

//10. Take two different string input and print them in same line. E.g.-
//INPUT : Codes
//Dope
//OUTPUT : CodesDope
class Ten{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String a=scanner.nextLine();

        System.out.println("Enter the second string: ");
        String b=scanner.nextLine();

        System.out.println(a+b);

    }
}
//11. Take 3 inputs from user and check :
//all are equal
//any of two are equal
//( use && || with ternary operator )
class Equal_checker{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the first no: ");
        int a=scanner.nextInt();
        System.out.println("Enter the second no: ");
        int b=scanner.nextInt();
        System.out.println("Enter the third no: ");
        int c=scanner.nextInt();

        String result;

        result=(a==b && a==c)?"all are equal":(a==c || a==b)?"Two no are equal":"None of them are equal";
        System.out.println(result);
    }
}
/*12. Write a program to enter the values of two variables 'a' and 'b' from keyboard and then
check if both the conditions 'a < 50' and 'a < b' are true.*/
class Check{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the first no");
        double f_num=scanner.nextDouble();
        System.out.println("Enter the second no");
        double s_num=scanner.nextDouble();

        String result;
        result=(f_num<50 && f_num<s_num)?"the condition is true": "the condition is not true.";
        System.out.println(result);
    }
}

/*13. If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
write a program to calculate his total marks and percentage marks.*/
class Remarks{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the marks of first sub");
        double f=scanner.nextDouble();
        System.out.println("Enter the marks of second sub");
        double s=scanner.nextDouble();
        System.out.println("Enter the marks of third sub");
        double t=scanner.nextDouble();

        double t_marks=f+s+t;
        double percent=(f+s+t)/3;
        System.out.println("your total marks is"+t_marks);
        System.out.println("your total percent is"+percent);

    }
}