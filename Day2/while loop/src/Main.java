import java.util.Scanner;

public class Main {
    public static void saving(float i,float j,float k){
        int year=0;
        j=1+(j/100);
        if (i==k) System.out.println("You don't need to deposit money.");
        else{
        while (i<k){
            i=i*j;
            year++;
        } if (year >=2)
        System.out.printf("Need to deposit money for %d years and balance is %.2f",year,i);
          else System.out.printf("Need to deposit money for %d yearand balance is %.2f",year,i);}

    }
    public static void main(String[] args) {
        Scanner save = new Scanner(System.in);
        float deposit = 0,interest =0,withdraw = 0;
        System.out.println("Enter Your deposit");
        deposit = save.nextFloat();
        System.out.println("Enter Your interest");
        interest = save.nextFloat();
        System.out.println("Enter Your withdraw");
        withdraw = save.nextFloat();
        saving(deposit,interest,withdraw);
    }
}
