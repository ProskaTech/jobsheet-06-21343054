
import javax.swing.JOptionPane;
/**
 * 
 * Maulana hafizul Haq - 21343054
 */
public class Tugas1B {

    public static void main(String[] args) {
        String Nilai1,Nilai2,Nilai3;
        Float a,b,c,Grade;

        Nilai1 = JOptionPane.showInputDialog("Nilai 1");
        a = Float.parseFloat(Nilai1);
        Nilai2 = JOptionPane.showInputDialog("Nilai 2");
        b = Float.parseFloat(Nilai2);
        Nilai3 = JOptionPane.showInputDialog("Nilai 3");
        c = Float.parseFloat(Nilai3);

        Grade = a + b + c ;
        Grade = Grade / 3;

        if (Grade > 60){
             JOptionPane.showMessageDialog(null, Grade+ (":-)") );
        }
        else{
            JOptionPane.showMessageDialog(null, Grade+ (":-(") );
        }

        System.out.println("Rata - Rata : "+Grade);
    }
}
    
    

