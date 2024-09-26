class Motor{
    private int kecepatan =0;
    private boolean kontakOn = false;
    public void nyalakanMesin(){
        kontakOn=true;
    }
    public void matikanMesin(){
        kontakOn=false;
        kecepatan=0;
    }
    public void tambahKecepatan(){
        if(kontakOn==true){
            if(kecepatan>=100){
                System.out.println("Kecepatan sudah maksimal");
            }else{
                kecepatan+=5;
            }
        }else{
            System.out.println("Mesin Mati");
        }
    }
    public void kurangiKecepatan(){
        if(kontakOn==true){
            kecepatan-=5;
        }
        else{
            System.out.println("Mesin Mati");
        }
    }
    public void printStatus(){
        if(kontakOn==true){
            System.out.println("Kontak On");
        }else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan "+ kecepatan+"\n");
    }
}

public class MotorDemo{
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.printStatus();
        motor.tambahKecepatan();

        motor.nyalakanMesin();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.matikanMesin();
        motor.printStatus();
    }
}