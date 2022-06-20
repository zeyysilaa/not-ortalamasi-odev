import java.util.Scanner;
public class Not {
    public static void main(String[] args) {
        int mat,fiz,kim,turk,tar,muz;
        Scanner girdi = new Scanner(System.in);
        System.out.println("mat notu:");
        mat = girdi.nextInt();
        System.out.println("fiz notu:");
        fiz = girdi.nextInt();
        System.out.println("kim notu:");
        kim = girdi.nextInt();
        System.out.println("turk notu:");
        turk = girdi.nextInt();
        System.out.println("tar notu:");
        tar = girdi.nextInt();
        System.out.println("muz notu:");
        muz = girdi.nextInt();

        double ortalama = (mat+fiz+kim+turk+tar+muz)/6;

        if (ortalama < 60){
            System.out.println("gecemediniz");
        } else if (ortalama == 60) {
            System.out.println("ucu ucuna");
        }else {
            System.out.println("afrnn");
        }

        System.out.println("Ortalamanız : " + ortalama);
    }
}
