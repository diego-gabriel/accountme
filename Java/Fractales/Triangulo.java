import java.util.Scanner;


public class Triangulo
{
    public static void main(String[] args){
        Scanner lee = new Scanner(System.in);
        
        int num, pos;
        num = lee.nextInt();
        pos = lee.nextInt();
        int d = 0;
        for (int i = 0; i < pos; i++){
            d = num % 10;
            num = num / 10;
        }
        
        System.out.println(d);
    }
}
