package javacalculator;
import javacalculator.addition;
import javacalculator.sub;
import java.util.*;

public class classmain {
    public static void main(String[] args){
        addition obj1=new addition();
        sub obj2=new sub();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st value: ");
        int n1=sc.nextInt();
        System.out.print("Enter 2nd value: ");
        int n2=sc.nextInt();
        sc.close();
        int anssum=obj1.sum(n1,n2);
        System.out.println(anssum);
        int anssub=obj2.subt(n1,n2);
        System.out.println(anssub);

        
        int testres=obj1.test(6,3);
        if(testres!=9){
            System.out.println("error in sum function");
        }
        else{
            System.out.println("working fine");
        }
        int testres2=obj2.test(6,3);
        if(testres2!=3){
            System.out.println("error in sub function");
        }
        else{
            System.out.println("working fine");
        }
    } 
}
