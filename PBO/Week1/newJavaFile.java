import java.util.Scanner;
public class newJavaFile{
    public static void main(String[] args) {
        Sepeda spd1= new Sepeda();
        Sepeda spd2= new Sepeda();
        SepedaGunung spd3= new SepedaGunung();
        
        spd1.setMerek("Polygone");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.cetakStatus();
        
        spd2.setMerek("Wiim Cycle");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.cetakStatus();
        
        spd3.setMerek("Klinee");
        spd3.tambahKecepatan(5);
        spd3.gantiGear(7);
        spd3.setTipeSuspensi("Gas Suspension");
        spd3.cetakStatus();
    }
}
class Sepeda{
        private String merek;
        private int kecepatan = 0;
        private int gear=1;
        
        public void setMerek(String newValue){
            merek=newValue;
        }
        public void gantiGear(int newValue){
            gear=newValue;
        }
        public void tambahKecepatan(int increment){
            kecepatan=kecepatan+increment;
        }
        public void rem(int decrement){
            kecepatan= kecepatan-decrement;
        }
        public void cetakStatus(){
            System.out.println("Merek: " + merek);
            System.out.println("Kecepatan: " +kecepatan);
            System.out.println("Gear: "+ gear);
        }
    }

class SepedaGunung extends Sepeda{
    private String tipeSuspensi;
    public void setTipeSuspensi(String newValue){
        tipeSuspensi = newValue;
    }
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Tipe Suspensi: " + tipeSuspensi);
    }
}