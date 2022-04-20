import java.util.Scanner;





//1. Write a JAVA program to find maximum between two numbers.
public class Task3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the first no: ");
        double a=s.nextDouble();
        System.out.println("Enter the second no: ");
        double b=s.nextDouble();

        if (a>b){
            System.out.println(a+"is greater than"+b);
        }
        else{
            System.out.println(b+"is greater than"+a);
        }
    }
}
//2. Write a JAVA program to find maximum between three numbers.
class B{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the first no: ");
        double a=s.nextDouble();
        System.out.println("Enter the second no: ");
        double b=s.nextDouble();
        System.out.println("Enter the third no: ");
        double c=s.nextDouble();

        if (a>b && a>c){
            System.out.println(a+"is greater than"+b+" and"+c);
        }
        else if (b>a && b>c){
            System.out.println(b+"is greater than"+a+" and"+c);
        }
        else {
            System.out.println(c+"is greater than"+a+" and"+b);
        }
    }

}
//3. Write a JAVA program to check whether a number is negative, positive or zero.
class Cc{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the  no: ");
        double a = s.nextDouble();

        if (a==0){
            System.out.println("the no is zero");
        }
        else if (a>0){
            System.out.println("the no is positive");
        }
        else{
            System.out.println("the no is negative");
        }
    }
}
//4. write a java program whether the input is divisible by 5 , 11 or not.
class Dd{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the first no: ");
        double a=s.nextDouble();

        if (a%5==0){
            System.out.println(a+" is divisible by 5");
        }
        else if (a%11==0){
            System.out.println(a+" is divisible by 11");
        }
        else{
            System.out.println(a+" is not divisible by 5 and 11");
        }
    }
}
/*5. Write a JAVA program to check whether a number is even or odd.
*/
class Even{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the first no: ");
        double a = s.nextDouble();

        if (a%2==0){
            System.out.println(a+"\t is even no.");
        }
        else{
            System.out.println(a+"\t is odd no.");
        }
    }
}
//6. Write a JAVA program to check whether a year is leap year or not.
class Alphabet{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the character: ");
        char c = s.next().charAt(0);

        if ((c>='a' && c<='z')||(c>='A' && c<='Z')){
            System.out.println(c+"the character is  alphabet");
        }
        else{
            System.out.println(c+"the character is not  alphabet.");
        }
    }
}
//7. Write a JAVA program to check whether a character is alphabet or not.
class Leap{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int a = s.nextInt();

        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println(a + "\t is leap year");
        } else {
            System.out.println(a+" is not leap year");
        }
    }
}
//8. Write a JAVA program to input any alphabet and check whether it is vowel or consonant.
class Vowel{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the character: ");
        char ch = s.next().charAt(0);

        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("the character is  vowel");
        }
        else{
            System.out.println("the character is not  consonant.");
        }
    }
}
//9. Write a JAVA program to input any character and check whether it is alphabet, digit or special
//character.
class Alp_dig_sp{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the character: ");
        char c = s.next().charAt(0);

        if ((c>='a' && c<='z')||(c>='A' && c<='Z')){
            System.out.println(c+"the character is  alphabet");
        }
        else if(c>='0' && c<='9'){
            System.out.println("the character is digit");
        }
        else{
            System.out.println("the character is special .");
        }
    }
}

/*10. Write a JAVA program to check whether a character is uppercase or lowercase alphabet.
*/
class Upper{
    public static void main(String[] args) {
        Scanner  scanner=new Scanner(System.in);

        System.out.println("Enter a  character");
        char ch=scanner.next().charAt(0);

        if (ch>='A' && ch<='z'){
            System.out.println(ch+" is UPPERCASE alphabet");
        }
        else if (ch>='a' && ch<='z'){
            System.out.println(ch+" is UPPERCASE alphabet");
        }
        else {
            System.out.println(ch+" is not alphabet");
        }

    }
}
/*11. Write a JAVA program to input week number and print weekday.*/
class Week{
    public static void main(String[] args) {
        Scanner  scanner=new Scanner(System.in);

        System.out.println("Enter a no from 1 to 7");
        int num=scanner.nextInt();

        if (num==1){
            System.out.println("Sunday");
        }
        else if (num==2){
            System.out.println("Monday");
        }
        else if (num==3){
            System.out.println("Tuesday");
        }
        else if (num==4){
            System.out.println("Wednesday");
        }
        else if (num==5){
            System.out.println("Thursday");
        }
        else if (num==6){
            System.out.println("Friday");
        }
        else{
            System.out.println("Saturday");
        }

    }

}
//12. Write a JAVA program to input month number and print number of days in that month.
class Month{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the month number: ");
        int month=scanner.nextInt();

        switch(month){
            case 1 :
                System.out.println("the month is January and there is 31 days");
                break;
            case 2 :
                System.out.println("the month is February and there is 28 days");
                break;
            case 3 :
                System.out.println("the month is March and there is 31 days");
                break;
            case 4 :
                System.out.println("the month is April and there is 30 days");
                break;
            case 5 :
                System.out.println("the month is May and there is 31 days");
                break;
            case 6 :
                System.out.println("the month is June and there is 30 days");
                break;
            case 7 :
                System.out.println("the month is July and there is 31 days");
                break;
            case 8 :
                System.out.println("the month is August and there is 31 days");
                break;
            case 9 :
                System.out.println("the month is September and there is 30 days");
                break;
            case 10 :
                System.out.println("the month is October and there is 31 days");
                break;
            case 11 :
                System.out.println("the month is November and there is 30 days");
                break;
            case 12 :
                System.out.println("the month is December and there is 31 days");
                break;
        }
    }
}
//13. Write a JAVA program to count total number of notes in given amount.
class countnumberofnotes{
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter your amount");
        int amount = myobj.nextInt();
        int note1000,note500, note100, note50, note20, note10, note5, note2, note1;
        note1000 = note500 = note100 = note50 = note20 = note10 = note5 = note2 = note1 = 0;
        if(amount >= 1000)
        {
            note1000 = amount/1000;
            amount -= note1000 * 1000;
        }
        if(amount >= 500)
        {
            note500 = amount/500;
            amount -= note500 * 500;
        }
        if(amount >= 100)
        {
            note100 = amount/100;
            amount -= note100 * 100;
        }
        if(amount >= 50)
        {
            note50 = amount/50;
            amount -= note50 * 50;
        }
        if(amount >= 20)
        {
            note20 = amount/20;
            amount -= note20 * 20;
        }
        if(amount >= 10)
        {
            note10 = amount/10;
            amount -= note10 * 10;
        }
        if(amount >= 5)
        {
            note5 = amount/5;
            amount -= note5 * 5;
        }
        if(amount >= 2)
        {
            note2 = amount /2;
            amount -= note2 * 2;
        }
        if(amount >= 1)
        {
            note1 = amount;
        }

        System.out.println("Total number of notes = \n");
        System.out.println("1000 = "+note1000+"\n");
        System.out.println("500 = "+note500+"\n");
        System.out.println("100 = "+note100+"\n");
        System.out.println("50 = "+note50+"\n");
        System.out.println("20 = "+note20+"\n");
        System.out.println("10 = "+note10+"\n");
        System.out.println("5 = "+note5+"\n");
        System.out.println("2 = "+note2+"\n");
        System.out.println("1 = "+note1+"\n");
    }
}
//14. Write a JAVA program to input angles of a triangle and check whether triangle is valid or not.
class Triangle{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the first angle: ");
        float f=scanner.nextFloat();
        System.out.println("Enter the second angle: ");
        float s=scanner.nextFloat();
        System.out.println("Enter the third angle: ");
        float t=scanner.nextFloat();

        float sum=f+s+t;

        if (sum==180){
            System.out.println("The triangle is valid");
        }
        else {
            System.out.println("The triangle is not valid");
        }
    }
}
//15. Write a JAVA program to input all sides of a triangle and check whether triangle is valid or not.
class Side{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the first side: ");
        float f_side=scanner.nextFloat();
        System.out.println("Enter the second side: ");
        float s_side=scanner.nextFloat();
        System.out.println("Enter the third side : ");
        float t_side=scanner.nextFloat();

        if((f_side+s_side>t_side) &&
                (t_side+s_side>f_side)&&
                (f_side+t_side>s_side)){
            System.out.println("it is a valid triangle.");
        }
        else{
            System.out.println("it is not valid triangle");
        }
    }
}

/*16. Write a JAVA program to check whether the triangle is equilateral, isosceles or scalene triangle.
*/

class Determine_triangle1{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the first side: ");
        float f_side=scanner.nextFloat();
        System.out.println("Enter the second side: ");
        float s_side=scanner.nextFloat();
        System.out.println("Enter the third side : ");
        float t_side=scanner.nextFloat();

        if(f_side==s_side &&f_side==t_side){
            System.out.println("it is a equilateral triangle.");
        }
        else if(f_side==s_side ||f_side==t_side){
            System.out.println("it is a isosceles triangle.");
        }
        else{
            System.out.println("it is a scalene triangle");
        }
    }
}
//17.write a program to find the square roots of quardatic equation
class RootsOfQuadratic {
    public static void main(String args[]) {
        double secondRoot , firstRoot;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        double a = sc.nextDouble();

        System.out.println("Enter the value of b :");
        double b = sc.nextDouble();

        System.out.println("Enter the value of c :");
        double c = sc.nextDouble();

        double determinant = (b * b) - (4 * a * c);
        double sqrt = Math.sqrt(determinant);

        if (determinant > 0) {
            firstRoot = (-b + sqrt) / (2 * a);
            secondRoot = (-b - sqrt) / (2 * a);
            System.out.println("Roots are :: " + firstRoot + " and " + secondRoot);
        } else if (determinant == 0) {
            System.out.println("Root is :: " + (-b + sqrt) / (2 * a));
        }
        else {

            // roots are complex number and distinct
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
    }
}


//18. Write a JAVA program to calculate profit or loss.
class Profit_loss{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the cost price");
        double cp=scanner.nextDouble();
        System.out.println("Enter the selling price");
        double sp=scanner.nextDouble();

        if (cp>sp){
            double loss=cp-sp;
            System.out.println("The loss amount is\t"+loss);
        }
        else{
            double profit=sp-cp;
            System.out.println("The profit amount is\t"+profit);
        }
    }
}
/*19. Write a JAVA program to input marks of five subjects Physics, Chemistry, Biology,
Mathematics and Computer. Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F*/
class Marks{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the marks of Physics sub ");
        double f=scanner.nextDouble();
        System.out.println("Enter the marks of Chemistry sub ");
        double s=scanner.nextDouble();
        System.out.println("Enter the marks of math sub ");
        double t=scanner.nextDouble();
        System.out.println("Enter the marks of social sub ");
        double four=scanner.nextDouble();
        System.out.println("Enter the marks of Biology sub ");
        double five=scanner.nextDouble();

        double t_marks=f+s+t+four+five;
        double percent=(t_marks)/5;

        System.out.println("you total marks is "+ t_marks);
        System.out.println("you total percent is "+ percent);

        if (percent>=90){
            System.out.println("Grade A");
        }
        else if (percent>=80 && percent<=90){
            System.out.println("Grade B");
        }
        else if(percent>=70 && percent<=80){
            System.out.println("Grade C");
        }
        else if (percent>=60 && percent<=70){
            System.out.println("Grade D");
        }
        else if (percent>=50 && percent<=60){
            System.out.println("Grade E");
        }
        else if (percent>=40 && percent<=50){
            System.out.println("Grade F");
        }
        else{
            System.out.println("fail");
        }
    }
}
/*20. Write a JAVA program to input basic salary of an employee and calculate its Gross salary
according to following:
Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary > 20000 : HRA = 30%, DA = 95%*/
class Salary{
    public static void main(String[] args) {
        double b_salary, hra, da, gross;
        Scanner scanner= new Scanner(System.in);

        System.out.println("enter the basic salary");
        b_salary=scanner.nextDouble();

        if (b_salary <= 10000 ){
            hra=b_salary*0.2;
            da=b_salary*0.8;
        }
        else if (b_salary <= 20000 ){
            hra=b_salary*0.25;
            da=b_salary*0.90;
        }
        else {
            hra=b_salary*0.3;
            da=b_salary*0.95;
        }
        gross=b_salary+hra+da;
        System.out.println("Gross salary is "+gross);

    }
}
/*21. Write a JAVA program to input electricity unit charges and calculate total electricity bill
according to the given condition:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill*/
class Electricity{
    public static void main(String[] args) {
        double units, bill_amount;
        Scanner scanner= new Scanner(System.in);

        System.out.println("enter the total units consumed");
        units=scanner.nextDouble();

        if (units<=50){
            bill_amount=units*0.5;
        }
        if (units>50 && units<=100){
            bill_amount=units*0.75;
        }
        if (units>100 && units<=250){
            bill_amount=units*1.20;
        }
        else {
            bill_amount=units*1.50;
        }
        System.out.println("The total bill amount is "+ bill_amount);
    }
}
