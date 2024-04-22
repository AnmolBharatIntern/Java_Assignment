import java.util.Scanner;
public class quest7_5 {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number:");
            int n=sc.nextInt();
            int r=0;
            int a;
            for(int i=1;n>0;i++){
                a=n%10;
                r=r*10+a;
                n=n/10;
            }
            System.out.println("Reverse of number is:" + r);
        }
           
}