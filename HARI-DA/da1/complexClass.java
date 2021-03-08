class Complex{
    int r;
    int i;
    Complex(){
        r=1;
        i=5;
    }
    Complex(int i, int r){
        this.i = i;
        this.r = r;
    }
    Complex(Complex c){
        i = c.i;
        r = c.r;
    }
    Complex ComplexAdd(Complex c1, Complex c2){
        Complex c3 = new Complex();
        c3.r = c2.r + c1.r;
        c3.i = c2.i + c1.i;
        return c3;
    }
}
public class ComplexNumbers {
    public static void main(String[] args){
        Complex c1 = new Complex();
        Complex c2 = new Complex(5,5);
        Complex c3 = new Complex();
        c3 = c3.ComplexAdd(c1,c2);
        System.out.println(c3.r + " + " + c3.i + "i");
    }
}
