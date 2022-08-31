import java.util.Scanner;

public class Main {
    static void isPrime(int a,int b){
        if (a==b){
            System.out.println(a+" bir asal sayıdır");
            return;
        }else if (a % b == 0) {
                System.out.println(a + " bir asal sayı değildir.");
                return;
        }
            isPrime(a, b + 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz:");
        int a= input.nextInt();
        isPrime(a,2);

    }
}
