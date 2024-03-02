import java.util.*;
class Reverse2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of digits: ");
        int n=sc.nextInt();
        int c[]=new int[20];
        for(int i=0;i<n;i++){
            c[i]=sc.nextInt();
        }
        System.out.print("Reverse order of array elements are: ");
        for(int i=n;i>=0;i--){
            System.out.println(c[i]);
        }
    }
}