import java.util.*;
class Paisa{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter in Rs: ");
        float n=sc.nextFloat();
        float res=n*100;
        System.out.print("You have " +res+ " paise.");
    }
}
