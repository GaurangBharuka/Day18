import java.util.*;
class Address{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Name: ");
        String n1=sc.nextLine();
        System.out.print("Door No,Street No: ");
        String n2=sc.nextLine();
        System.out.print("City,pin code: ");
        String n3=sc.nextLine();
        System.out.print("\n" + "Name: " +n1+ "\nDoor No,Street No: " +n2+ "\nCity,pin code: " +n3);
    }
}