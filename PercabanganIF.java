import java.util.Scanner;
/**
 * 
 * Maulana hafizul Haq - 21343054
 */

 public class PercabanganIF {
    public static void main(String[]args) {
        double total_pembelian, diskon =0;

        Scanner dataMasuk = new Scanner( System.in);
        System.out.print("masukan total pembelian: RP ");
        total_pembelian = dataMasuk.nextDouble();

        if (total_pembelian >= 50000)
            diskon = 0.1 * total_pembelian;

            System.out.println("Besarnya Diskon : Rp "+ diskon);

    }
 }