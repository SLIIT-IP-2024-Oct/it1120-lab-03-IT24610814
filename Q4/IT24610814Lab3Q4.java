import java.util.Scanner;
public class IT24610814Lab3Q4 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.print("Enter a five-digit number:");
        int num = input.nextInt();
        int x1;
        int x2;
        int x3;
        int x4;
        int x5;

        if (10000<=num && num<=99999){
            x1=num/10000;
            num=num%10000;

            x2=num/1000;
            num=num%1000;

            x3=num/100;
            num=num%100;

            x4=num/10;
            num=num%10;

            x5=num/1;
            num=num%1;

            System.out.print(x1+" "+x2+" "+x3+" "+x4+" "+x5);
        }
    else{
        System.out.println("Please enter five-digit value");
    }

    }
    
}