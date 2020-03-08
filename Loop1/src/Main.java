import java.util.Scanner;

public class Main {
    public static int sum(int Num1,int Num2){
        int result = 0;
        for (int i=Num1;i<=Num2;i++)
        result+=i;
        return  result;
    }
    public static void multiplyto12(int num){
        for (int i=1;i<=12;i++)
            System.out.printf("%d * %d = %d\n",num,i,num*i);
    }
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        /*int num1= number.nextInt();
        int num2= number.nextInt();
        System.out.println("The sum of "+num1+" to "+num2+" is "+sum(num1,num2)+".");*/
        int num=number.nextInt();
        multiplyto12(num);
    }
}
