/*1. Using switch statement Write a JAVA program to input marks of five subjects Physics,
Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to
following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F*/

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double physic, che, math, bio, comp, p;
        System.out.println("Enter the Physics marks: ");
        physic=scanner.nextDouble();
        System.out.println("Enter the Chemistry marks: ");
        che=scanner.nextDouble();
        System.out.println("Enter the Biology marks: ");
        math=scanner.nextDouble();
        System.out.println("Enter the Mathematics marks: ");
        bio=scanner.nextDouble();
        System.out.println("Enter the Computer marks: ");
        comp=scanner.nextDouble();

        p=(physic+che+math+bio+comp)/5;
        System.out.println("the total percent is "+p);

        switch ((p>=90)? 0:(p>=80&& p<90)? 1:(p>=70&& p<80)?2:(p>=60&& p<70)?3:(p>=40&& p<600)? 4:5){
            case 1:
                System.out.println("Grade A");
                break;
            case 2:
                System.out.println("Grade B");
                break;
            case 3:
                System.out.println("Grade C");
                break;
            case 4:
                System.out.println("Grade D");
                break;
            case 5:
                System.out.println("fail");
                break;
            default:
                System.out.println("not valid");
        }

    }
}
/*
2. JAVA Program to find the maximum between two numbers. Using the switch statement.
*/
class Maximum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first no: ");
        double a= scanner.nextDouble();
        System.out.println("Enter the second no: ");
        double b= scanner.nextDouble();

        switch((a>b)? 1:2){
            case 1:
                System.out.println("max no is "+a);
                break;
            case 2:
                System.out.println("max no is "+b);
                break;
            default:
                System.out.println("invalid no");

        }
    }
}

/*
3. JAVA Program to find the maximum between three numbers. Using the switch statement.
*/
class Max_three{
    public static void main(String[] args) {
        double a, b, c ;
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the first no: ");
        a= scanner. nextDouble();
        System.out.println("Enter the second no: ");
        b= scanner. nextDouble();
        System.out.println("Enter the third no: ");
        c= scanner. nextDouble();

        switch((a>b && a>c)? 0:(b>a && b>c)? 1:2){
            case 0:
                System.out.println("max no is "+ a);
                break;
            case 1:
                System.out.println("max no is "+ b);
                break;
            case 2:
                System.out.println("max no is "+ c);
                break;
            default:
                System.out.println("invalid no");
                break;
        }
    }
}

/*
4. JAVA Program to check whether a number is divisible by 5 and 11 or not. Using the switch
statement.
*/
class Divisible{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the no: ");
        double num= scanner.nextDouble();

        switch ((num%5==0 && num%11==0)? 0:1){
            case 0:
                System.out.println(num+" is not divisible by both 11 and 5");
                break;
            case 1:
                System.out.println(num+" is invalid");
                break;
        }
    }
}
/*
5. JAVA Program to check whether a year is a leap year or not. Using switch statement
*/
class Leap_year{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year=scanner.nextInt();

        switch((year%4==0&& year%100!=0)||(year%400==0)?0:1){
            case 0:
                System.out.println(year+ " \t is leap year");
                break;
            case  1:
                System.out.println(year+ "is not leap year");
                break;
        }

    }
}
/*
6. JAVA Program to check whether a character is an alphabet or not. Using the switch statement.
*/
class Alpha{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the character: ");
        char ch=scanner.next().charAt(0);

        switch((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z')? 0: 1 ){
            case 0:
                System.out.println("the character is alphabet");
                break;
            case 1:
                System.out.println("the character is not  alphabet");
                break;
            default:
                System.out.println("invalid character");
        }
    }
}
/*
7. JAVA Program to take the value from the user as input any alphabet and check whether it is
vowel or consonant. Using the switch statement.
*/
class Alphaa{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the character: ");
        char ch=scanner.next().charAt(0);

        switch((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')? 0:1 ){
            case 0:
                System.out.println("the character is vowel");
                break;
            case 1:
                System.out.println("the character is consonant");
                break;
            default:
                System.out.println("invalid character");
        }
    }
}
/*
8. JAVA Program to take the value from the user as input any character and check whether it is
the alphabet, digit or special character. Using the switch statement.
*/
class Alphaabet1{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the character: ");
        char ch=scanner.next().charAt(0);

        switch((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z')? 0:(ch>='0'&&ch<='9')? 1:2){
            case 0:
                System.out.println("the character is alphabet ");
                break;
            case 1:
                System.out.println("the character is digit");
                break;
            case 2:
                System.out.println("it is special character");
                break;
            default:
                System.out.println("invalid character");
        }
    }
}
/*
9. JAVA Program to check whether a character is an uppercase or lowercase alphabet. Using the
switch statement.
 */
class Upp_low{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the character:  ");
        char ch= scanner.next().charAt(0);

        switch((Character.isUpperCase(ch))? 0: (Character.isLowerCase(ch))? 1:2){
            case 0:
                System.out.println("The  character"+ch+" is upper case ");
                break;
            case 1:
                System.out.println("The  character"+ch+" is lower case ");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
/*
10. JAVA Program to take the value from the user as an input week number and print weekday by
using the switch statement.
 */
 class Week1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int value;
        System.out.println("enter the no from 1 to 7");
        value = scanner.nextInt();
        switch(value){
            case 1 :
                System.out.println("sunday");
                break;
            case 2 :
                System.out.println("monday");
                break;
            case 3 :
                System.out.println("tuesday");
                break;
            case 4 :
                System.out.println("wednesday");
                break;
            case 5 :
                System.out.println("thursday");
                break;
            case 6 :
                System.out.println("friday");
                break;
            case 7 :
                System.out.println("saturday");
                break;
            default:
                System.out.println("you entered the wrong no");
        }
    }
}
/*
11. JAVA Program to take the value from the user as input the month number and print number of
days in that month. Using switch statement
 */
class year2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the month number: ");
        int month = scanner.nextInt();
        System.out.println("Enter a year");
        int year = scanner.nextInt();
        switch (month) {
            case 1:
                System.out.println("January");
                System.out.println("total days is 31");
                break;
            case 2:
                System.out.println("February");
                switch ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 2) {
                    case 1:
                        System.out.println(year + "\t is leap year");
                        System.out.println("total days is 29");
                        break;
                    case 2:
                        System.out.println(year + " is not leap year");
                        System.out.println("total days is 28");
                        break;
                }
                break;
            case 3:
                System.out.println("March");
                System.out.println("total days is 31");
                break;
            case 4:
                System.out.println("April");
                System.out.println("total days is 30");
                break;
            case 5:
                System.out.println("May");
                System.out.println("total days is 31");
                break;
            case 6:
                System.out.println("June");
                System.out.println("total days is 30");
                break;
            case 7:
                System.out.println("July");
                System.out.println("total days is 31");
                break;
            case 8:
                System.out.println("August");
                System.out.println("total days is 31");
                break;
            case 9:
                System.out.println("September");
                System.out.println("total days is 31");
                break;
            case 10:
                System.out.println("October");
                System.out.println("total days is 31");
                break;
            case 11:
                System.out.println("November");
                System.out.println("total days is 30");
                break;
            case 12:
                System.out.println("December");
                System.out.println("total days is 31");
                break;
             default:
                 System.out.println("invalid no");

        }
    }
}


/*
12. JAVA Program to count the total number of notes in a given amount. Using the switch
statement.*/
class Notes{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the amount: ");
        int rupee=scanner.nextInt();

        int rem=rupee%5;
        int num=rupee/5;
        switch (rem){
            case 0:
                System.out.println("the total no of notes is "+ num);
                break;
            default:
                System.out.println("Enter the valid rupee note amount");
        }
    }
}
/*
13. JAVA Program to take the value from the user as input all sides of a triangle and check whether
the triangle is valid or not. Using switch statement
*/
class Triangle2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the f side");
        int a=scanner.nextInt();
        System.out.println("Enter the s side");
        int b=scanner.nextInt();
        System.out.println("Enter the t side");
        int c=scanner.nextInt();

        switch(((a+b)>c || (b+c)>a || (c+a)>b)? 0: 1){
            case 0:
                System.out.println("the triangle is valid ");
                break;
            case 1:
                System.out.println("the triangle is not valid ");
                break;
            default:
                System.out.println("invalid sides");
        }
    }
}

/*
14. JAVA Program to check whether the triangle is an equilateral, isosceles or scalene triangle.
Using switch statement
*/

class Triangle3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the f side");
        int a=scanner.nextInt();
        System.out.println("Enter the s side");
        int b=scanner.nextInt();
        System.out.println("Enter the t side");
        int c=scanner.nextInt();

        switch((a==b&&b==c&&c==a)? 0: (a==b||b==c||c==a)?1:2){
            case 0:
                System.out.println("the triangle equilateral triangle ");
                break;
            case 1:
                System.out.println("the triangle is isosceles ");
                break;
            case 2:
                System.out.println("the triangle is scalene ");
                break;
            default:
                System.out.println("invalid sides");
        }
    }
}
/*
15. JAVA Program to find all the roots of a quadratic equation. Using switch statement
*/
class Quadratic{
    public static void main(String[] args) {
        double secondRoot , firstRoot;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coefficient of x square :");
        double a = sc.nextDouble();

        System.out.println("Enter coefficient of x :");
        double b = sc.nextDouble();

        System.out.println("Enter the value of c :");
        double c = sc.nextDouble();

        double determinant=(b*b)-4*a*c;
        double determinant1=Math.sqrt(determinant);

        switch((determinant1>0)?0:(determinant1==0)?1:2){
            case 0:
                firstRoot=(-b+determinant1)/2*a;
                secondRoot=(-b-determinant1)/2*a;
                System.out.println("first root is "+ firstRoot);
                System.out.println("first root is "+ secondRoot);
                break;
            case 1:
                firstRoot=(-b)/2*a;
                System.out.println("the first and second root is"+ firstRoot);
                break;
            case  2:
                double real = -b / (2 * a);
                double imaginary = Math.sqrt(-determinant) / (2 * a);
                System.out.println("first root: "+real+imaginary);
                System.out.println("second root: "+real+imaginary);
                break;
            default:
                System.out.println("invalid no");
        }
    }
}

/*
16. JAVA Program to calculate profit or loss. Using switch statement.
*/
class Profit1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double profit, loss;
        System.out.println("Enter the cost price: ");
        double cp =scanner.nextDouble();
        System.out.println("Enter the selling price: ");
        double sp =scanner.nextDouble();

        switch((cp>sp)? 0:1){
            case 0:
                loss=cp-sp;
                System.out.println("the loss amount is "+ loss);
                break;
            case 1:
                profit=cp-sp;
                System.out.println("the loss amount is "+ profit);
                break;
            default:
                System.out.println("invalid");
        }
    }
}

/*
17. Using switch statement JAVA Program to take the value from the user as input marks of five
subjects Physics, Chemistry, Biology, Mathematics, and Computer. Calculate percentage and
grade according to the following: Percentage >= 90% : Grade A, Percentage >= 80% : Grade B,
Percentage >= 70% : Grade C, Percentage >= 60% : Grade D, Percentage >= 40% : Grade E,
Percentage < 40% : Grade F, Using switch statement.
*/
class Grade1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double physic, che, math, bio, comp, p;
        System.out.println("Enter the Physics marks: ");
        physic=scanner.nextDouble();
        System.out.println("Enter the Chemistry marks: ");
        che=scanner.nextDouble();
        System.out.println("Enter the Biology marks: ");
        math=scanner.nextDouble();
        System.out.println("Enter the Mathematics marks: ");
        bio=scanner.nextDouble();
        System.out.println("Enter the Computer marks: ");
        comp=scanner.nextDouble();

        p=(physic+che+math+bio+comp)/5;
        System.out.println("the total percent is "+p);

        switch ((p>=90)? 0:(p>=80&& p<90)? 1:(p>=70&& p<80)?2:(p>=60&& p<70)?3:(p>=40&& p<60)? 4:5){
            case 1:
                System.out.println("Grade A");
                break;
            case 2:
                System.out.println("Grade B");
                break;
            case 3:
                System.out.println("Grade C");
                break;
            case 4:
                System.out.println("Grade D");
                break;
            case 5:
                System.out.println("Grade F");
                break;
            default:
                System.out.println("not valid");
        }

    }
}

/*
18. JAVA Program to take the value from the user as input the basic salary of an employee and
calculate its Gross salary according to the following: Basic Salary <= 10000: HRA = 20%, DA =
80%………………………………..Basic Salary <= 20000 : HRA = 25%, DA =
90%………………………………Basic Salary > 20000 : HRA = 30%, DA = 95%.
*/
class Salary2{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double gross_salary, hra, da;
        System.out.println("enter your salary:");
        double salary= scanner.nextDouble();

        switch((salary<=10000)? 1: (salary>10000 && salary<=20000)? 2: 3){
            case 1:
                hra=0.20*salary;
                da=0.8*salary;
                gross_salary=salary+hra+da;
                System.out.println("the gross salary is "+ gross_salary);
                break;
            case 2:
                hra=0.25*salary;
                da=0.9*salary;
                gross_salary=salary+hra+da;
                System.out.println("the gross salary is "+ gross_salary);
                break;
            case 3:
                hra=0.30*salary;
                da=0.95*salary;
                gross_salary=salary+hra+da;
                System.out.println("the gross salary is "+ gross_salary);
                break;
            default:
                System.out.println("invalid no");
        }
    }
}

/*
19. JAVA Program to take the value from the user as input electricity unit charges and calculate
total electricity bill according to the given condition: For the first 50 units Rs.
0.50/unit………….For the next 100 units Rs. 0.75/unit…..For the next 100 units Rs. 1.20/unit
……………For unit above 250 Rs. 1.50/unit………An additional surcharge of 20% is added to
the bill…….Using the switch statement.
*/
class Electrcity{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        double units, amount, sur_charge, total_bill;
        System.out.println("enter the total units consumed: ");
        units=scanner.nextDouble();

        switch((units<=50)? 1:(units<=150)?2:(units<=250)?3:4){
            case 1:
                amount=units*0.50;
                sur_charge=amount*0.2;
                total_bill=amount+sur_charge;
                System.out.println("the total bill amount is :"+ total_bill);
                break;
            case 2:
                amount=25+(units-50)*0.75;
                sur_charge=amount*0.2;
                total_bill=amount+sur_charge;
                System.out.println("the total bill amount is :"+ total_bill);
                break;
            case 3:
                amount=25+75+(units-150)*1.20;
                sur_charge=amount*0.2;
                total_bill=amount+sur_charge;
                System.out.println("the total bill amount is :"+ total_bill);
                break;
            case 4:
                amount=25+75+150+(units-250)*1.50;
                sur_charge=amount*0.2;
                total_bill=amount+sur_charge;
                System.out.println("the total bill amount is :"+ total_bill);
                break;
            default:
                System.out.println("invalid");
        }
    }
}

/*
20. Write a program that determines a student’s grade. The program will read three types of scores
(quiz, mid-term, and final scores) and determine the grade based on the following rules:if the
average score =90% =>grade=A…………………..-if the average score >= 70% and <90% =>
grade=B……………………-if the average score>=50% and <70%`
=>grade=C……………………..-if the average score<50% =>grade=F
*/
class Grade2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double quiz, mid, final_term,p;
        System.out.println("Enter the quiz_term marks: ");
        quiz=scanner.nextDouble();
        System.out.println("Enter the mid_term marks: ");
        mid=scanner.nextDouble();
        System.out.println("Enter the final_term marks: ");
        final_term=scanner.nextDouble();

        p=(quiz+mid+final_term)/3;
        System.out.println("the total percent is "+p);

        switch ((p>=90)? 0:(p>=70&& p<90)? 1:(p>=50&& p<70)?2:3){
            case 0:
                System.out.println("Grade A");
                break;
            case 1:
                System.out.println("Grade B");
                break;
            case 2:
                System.out.println("Grade C");
                break;
            case 3:
                System.out.println("Grade F");
                break;
            default:
                System.out.println("not valid");
        }

    }
}

/*
21. Program to take the hours and minutes as input by the user and the show that whether it is AM
or PM by using the switch statement.
*/
class Am_pm{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        double hours, minutes;
        System.out.println("enter the total hours: ");
        hours=scanner.nextDouble();
        System.out.println("enter the total minutes: ");
        minutes=scanner.nextDouble();

        double min_in_hr=minutes/60;
        double t_hours=min_in_hr+hours;

        switch((t_hours>0 &&t_hours<=11)? 1:(t_hours>=12 &&t_hours<24?2:3)){
            case 1:
                System.out.println("the total hours is "+t_hours);
                System.out.println("so it is AM.");
                break;
            case 2:
                System.out.println("the total hours is "+t_hours);
                System.out.println("so it is PM.");
                break;
            case 3:
                System.out.println("invalid input");
                break;
            default:
                System.out.println("invalid");
        }
    }
}

/*
22. Program to convert a positive number into negative number and negative number into a positive
number using switch statement
*/
class Positive{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("enter the number: ");
        double num=scanner.nextDouble();

        switch((num<0)?1:(num>0)?2:3){
            case 1:
                System.out.println("you enter the negative no ");
                System.out.println("so it positive no is "+(num*-1));
                break;
            case 2:
                System.out.println("you enter the positive no ");
                System.out.println("so its negative no is "+(num*-1));
                break;
            case 3:
                System.out.println("you enter the invalid no or zero ");
                break;
            default:
                System.out.println("invalid input");
        }

    }
}

/*
23. Write a program to swap the values of two numbers if the values of both variables are not the
same using a switch statement.
*/
class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp;
        System.out.println("Enter the first no:");
        double a=scanner.nextDouble();
        System.out.println("Enter the second no:");
        double b=scanner.nextDouble();
        temp=a;
        a=b;
        b=temp;
        switch((a!=b)?1:(a==b)?2:3){
            case 1:
                System.out.println("a="+a);
                System.out.println("b="+b);
                break;
            case 2:
                System.out.println("Don't take two same no");
                break;
            case 3:
                System.out.println("invalid");
                break;
        }


    }
}
/*
24. Program to Convert even number into its upper nearest odd number Switch Statement*/
class Nearest{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the number:");
        int num=scanner.nextInt();

        switch(num%2){
            case 0:
                System.out.println(num+" is an even number");
                System.out.println("And it's upper nearest odd number is "+ (num+1));
                break;
            case 1:
                System.out.println("Don't enter the odd number");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
