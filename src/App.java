import java.util.InputMismatchException;
import java.util.Scanner;
class kubus{
    int sisi;
    kubus(int sisi){this.sisi=sisi;}
    public long volume(){
        return sisi*sisi*sisi;
    }
    public void tampilkanVolume(){
        System.out.println("Panjang sisi kubus : " +sisi+ "cm\nVolume Kubus : " +volume()+ " cm^3");
    }
}

public class App{
    public static void main (String[] args) throws Exception { 
        System.out.println("=================================");
        System.out.println("\tCarissa Chandra");
        System.out.println("\t03081210012");
        System.out.println("\t21SI1");
        System.out.println("=================================\n");
        Scanner input = new Scanner (System.in);

        int sisi = 0;
        try {
            System.out.print("Input besar sisi pada kubus (cm) : ");
            sisi = input.nextInt();
            kubus kbs = new kubus(sisi);
            kbs.tampilkanVolume();
        } catch(InputMismatchException e){
            System.out.println("sisi harus berupa bilangan bulat. Silahkan input kembali besar sisi!");
        }

        if(sisi <= 5 || sisi >= 100){
            System.out.println("Besar sisi telah melampaui batas");
        }
    }
    

}