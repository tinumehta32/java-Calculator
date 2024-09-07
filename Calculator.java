import java.util.Scanner;

public class Calculator {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose your operation");
        System.out.println("1:For Addition");
        System.out.println("2: for Substraction");
        System.out.println("3:For Multiplication");
        System.out.println("4:For Division");

       int choose = sc.nextInt();

       System.out.println("enter two numbers:");
       int x=sc.nextInt();
       int y=sc.nextInt();

       if(choose==1){
        System.out.println("Answer is:"+add(x, y));
       }
       else if (choose==2) {
        System.out.println("Answer is:"+sub(x, y));
       }
       else if(choose==3){
        System.out.println("Answer is:"+mul(x, y));
       }
       else if(choose==4){
        System.out.println("Answer is:"+div(x, y));
       }
       else{
        System.out.println("You are out of range");
       }

    }
    public static int add(int x,int y){
             int n=x+y;
             return n;
    }
    public static int sub(int x,int y){
       int n=x-y;
        return n;

    }
    public static int mul(int x,int y){
       int n=x*y;
       return n;
    }
    public static int div(int x,int y){
        int n=x/y;
        return n;
    }

}
