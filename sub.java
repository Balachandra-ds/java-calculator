import java.util.Scanner;

public class sub {

    public int subt(int n1,int n2){
        int ans=n1-n2;
        return ans;
    }

    public int test(int n1,int n2){
        int ans=n1-n2;
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sub ab = new sub();
        System.out.print("enter 1st value: ");
        int n1=sc.nextInt();
        System.out.print("Enter 2nd value: ");
        int n2=sc.nextInt();
        sc.close();
        int ans=ab.subt(n1,n2);
        System.out.println(ans);
        int testres=ab.test(6,3);
        if(testres!=3){
            System.out.println("error");
        }
        else{
            System.out.println("working fine");
        }
    }
}
