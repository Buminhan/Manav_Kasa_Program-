import java.util.Scanner;
public class Manav_Kasa_Programi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double a=2.14, e=3.67, d= 1.11, m = 0.95, p=5;
        double aa, ee, dd, mm, pp;
        System.out.print("Armut Kaç Kilo ? :");
        aa = inp.nextDouble();
        System.out.print("Elma Kaç Kilo ? :");
        ee = inp.nextDouble();
        System.out.print("Domates Kaç Kilo ? :");
        dd = inp.nextDouble();
        System.out.print("Muz Kaç Kilo ? :");
        mm = inp.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? :");
        pp = inp.nextDouble();
        System.out.println("Toplam Tutar : "+(a*aa+e*ee+d*dd+m*mm+p*pp)+" TL");
    }
}
