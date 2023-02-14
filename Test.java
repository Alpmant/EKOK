import java.io.Console;
import java.util.Scanner;





public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i=1,ebob=0;
        System.out.print("1.sayı:");
        int sayi1=input.nextInt();
        System.out.print("2.Sayı:");
        int sayi2=input.nextInt();
        while(i<=sayi1)
        {
            if(sayi1%i==0&&sayi2%i==0)
                ebob=i;
            i++;
        }
        System.out.println("Ebob:"+ebob);
        System.out.println("Ekok:"+(sayi1*sayi2/ebob));










    }

}













