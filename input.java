import java .util.*;
public class input {
    public static void main(String[] args) {
        System.out.println("enter the number to check");
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        if(x%3==0 && x%5==0){
            System.out.print("fizzbuzz");
        }
        else if(x%3==0){
            System.out.println("fizz");
        }
        else if(x%5==0){
             System.out.println("buzz");
        }
    }
}