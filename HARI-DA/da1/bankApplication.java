import java.util.Scanner;

public class bankApplication {

    public static void main(){
            Scanner sc = new Scanner(System.in);
            float a;
            float b;
            System.out.println("Enter balance :");
            a=sc.nextFloat();
            System.out.println("Enter rate on interest");
            b=sc.nextFloat();
            bank x = new bank(a,b);
            
            //add input according to convenience

    }



}

class bank {
    float balance;
    float rateOfInterest;

    public bank(float balance, float rateOfIntrest) {
        this.balance = balance;
        this.rateOfInterest = rateOfIntrest;
    }


    public void calculateCompound(int p,int t,int n) {
        double number = p * Math.pow(1 + (this.rateOfInterest / n), n * t);
        double interest = number - p;
        System.out.println("Compound interest after " + t + " years: " + interest);
        System.out.println("Money after " + t + " years: " + number);
    }

    public void calculateSimpleIntrese(int p,int t,int r){
        System.out.println("The simple interest is");
        System.out.println(p*t*r);
    }
}
