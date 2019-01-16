
import java.util.Scanner;

public class Sort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goldCoin = scanner.nextInt();

        int a = goldCoin/2;
        int b = goldCoin/3;
        int c = goldCoin/4;

        int num = a+b+c;

        if(num>goldCoin){
            System.out.println(num);
        }else{
            System.out.println(goldCoin);
        }
    }
}
