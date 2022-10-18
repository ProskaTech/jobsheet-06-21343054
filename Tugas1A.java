import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 * 
 * Maulana hafizul Haq - 21343054
 */

public class Tugas1A {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String a,b,c;
        float Nilai1,Nilai2,Nilai3,Grade;


        try{
            System.out.print("Masukan Nilai 1 : ");
            a = dataIn.readLine();
            Nilai1 = Float.parseFloat(a);

            System.out.print("Masukan Nilai 2 : ");
            b = dataIn.readLine();
            Nilai2 = Float.parseFloat(b);
            
            System.out.print("Masukan Nilai 3 : ");
            c = dataIn.readLine();
            Nilai3 = Float.parseFloat(c);

            Grade = Nilai1 + Nilai2 + Nilai3;
            Grade= Grade /3;
            System.out.println("Grade = "+Grade);
            
            if (Grade > 60){
                System.out.println(":-)");
            }
            else{
                System.out.println(":-(");
            }
    
        }
        catch(IOException e){
            System.out.println("Gagal Maszeh");

        }

        
    }
}