package javacalculator;

import java.util.Scanner;

public class addition {

    public static int sum(int n1,int n2){
        int ans=n1+n2;
        return ans;
    }

    public static int test(int n1,int n2){
        int ans=n1+n2;
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st value: ");
        int n1=sc.nextInt();
        System.out.print("Enter 2nd value: ");
        int n2=sc.nextInt();
        sc.close();
        int ans=sum(n1,n2);
        System.out.println(ans);
        int testres=test(1,2);
        if(testres!=3){
            System.out.println("error");
        }
        else{
            System.out.println("working fine");
        }
    }
}
