import java.util.*;
class Positive{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of digits: ");
        int n=sc.nextInt();
        System.out.print("Enter the size of the array: ");
        int s=sc.nextInt();
        int c[]=new int[s];
        for(int i=0;i<n;i++){
            c[i]=sc.nextInt();
        }
        System.out.print("The positive elements are: \n");
        for(int i=0;i<n;i++){
            if(c[i]>0){
                System.out.println(c[i]);
            }
        }
    }
}