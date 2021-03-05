//question 2
import java.util.Scanner;

public class duplicateInArray {



    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n;
        int[] s =new int[10];
        System.out.println("Enter number of elements in the array (max 10)");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            s[i]= sc.nextInt();
        }

        System.out.println("Duplicate elements in the array are ");
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(s[i] == s[j])
                    System.out.println(s[j]);
            }
        }
    }


}



