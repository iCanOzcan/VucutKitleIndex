import java.util.Scanner;

public class VucutKitleIndex {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        double kilo,boy,bmi;
        System.out.print("Boyunuzu metre cinsinden girin:");
        boy=in.nextDouble();
        System.out.print("Kilonuzu girin:");
        kilo=in.nextDouble();
        bmi=kilo/(boy*boy);
        System.out.println("Vucut kitle index degeriniz:"+ bmi);
    }

}
