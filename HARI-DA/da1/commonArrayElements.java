//question 1
import java.util.Scanner;

class commonArrayElements {



    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n=0,m=0;
        String[] a = new String[10];
        String[] b = new String[10];
        System.out.println("Enter number of elements in array 1");
        n=sc.nextInt();
        System.out.println("Enter number of elements in array 2");
        m=sc.nextInt();
        System.out.println("Enter "+ n +" elements for 1st array");
        for(int i=0;i<n;i++){
            a[i]=sc.next();
        }
        System.out.println("Enter "+ n +" elements for 2nd array");
        for(int i=0;i<n;i++){
            b[i]= sc.next();

        }

        FindCommonElementsInArray(a,b,n);
        sc.close();


    }

    public static void FindCommonElementsInArray(String[] a,String[] b,int n){
        System.out.println("Common elements are");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i].equals(b[j])) {
                    System.out.println(b[j]);

                }

            }
        }


    }


}


// output 
// Enter number of elements in array 1
// 2
// Enter number of elements in array 2
// 2
// Enter 2 elements for 1st array
// a
// b
// Enter 2 elements for 2nd array
// a
// c
// Common elements are
// a