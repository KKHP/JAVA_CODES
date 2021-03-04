

import java.util.Scanner;
import java.util.*;

public class calculateOveride {

    public static void main(String[] args) {
	// write your code here
        sos s =  new sos();
        s.calculate(1,0,-16);


    }
}

class number {
    int number;
    public void calculate(int a,int b,int c){

        System.out.println("Sum of all digits: " + (a+b+c));
    }
}

class quadratic extends number{
    Scanner sc = new Scanner(System.in);
    //ax^2+bx+c
    int a;
    int b;
    int c;


    @Override
    public void calculate(int a,int b,int c) {
        super.calculate(a,b,c);
        double disc=Math.pow(b,2)-4*a*c;
        System.out.println("The root of the equation is");
        if(disc==0){
            double x =-b/(2*a);
            System.out.println(+x +" and " + x );
        }
        if(disc<0){
            double x=Math.pow(-1*disc,0.5);
            double y=-b/(2*a);
            System.out.println(y+"+"+"("+x +"i/"+(2*a) +")");
            System.out.println(y+"-"+"("+x +"i/"+(2*a) +")");
        }
        if(disc>0){
            double x=Math.pow(disc,0.5);
            double y=-b/(2*a);
            double z1=(-b+x)/(2*a);
            double z2=(-b-x)/(2*a);
            System.out.println("+"+z1);
            System.out.println("-"+z1);
        }

    }
}

class sos extends quadratic{

    @Override
    public void calculate(int a,int b,int c) {
        super.calculate(a,b,c);
        double y =Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2);
        System.out.println("Sum of square of numbers = " + y);

    }
}

//    Sum of all digits: -15
//        The root of the equation is
//        +4.0
//        -4.0
//        Sum of square of numbers = 257.0
