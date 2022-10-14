package TUGAS.tugas2;
import java.util.Scanner;;
/**
 * 
 * Maulana hafizul Haq - 21343054
 */
public class Tugas2B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan Angka = ");
        int angka = in.nextInt();

        switch(angka){
            case 1:
            System.out.println("SATU");
            break;
            case 2:
            System.out.println("DUA");
            break;
            case 3:
            System.out.println("TIGA");
            break;
            case 4:
            System.out.println("EMPAT");
            break;
            case 5:
            System.out.println("LIMA");
            break;
            case 6:
            System.out.println("ENAM");
            break;
            case 7:
            System.out.println("TUJUH");
            break;
            case 8:
            System.out.println("DELAPAN");
            break;
            case 9:
            System.out.println("SEMBILAN");
            break;
            case 10:
            System.out.println("SEPULUH");
            break;
            default :
            System.out.println("Sorry,hanya bisa 1 - 10");



        }
    }
    
}
