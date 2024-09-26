class Pegawai{
    private String nip,nama;
    
    public Pegawai(String nip, String nama){
        this.nip =nip;
        this.nama = nama;
    }

    public void setNip(String nip){
        this.nip = nip;
    }
    public void setNama(String nama){
        this.nama= nama;
    }
    public String getNip(){
        return nip;
    }
    public String getNama(){
        return nama;
    }
    public String info() { 
        String info = "";
        info += "Nip: " + this.nip + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}
class KeretaApi{
    private String kelas, nama;
    private Pegawai masinis, asisten;

    public KeretaApi(String nama, String kelas, Pegawai masinis, Pegawai asisten){
        this.kelas=kelas;
        this.nama = nama;
        this.masinis = masinis;
        this.asisten = asisten;
    }
    public KeretaApi(String nama, String kelas, Pegawai masinis){
        this.kelas=kelas;
        this.nama = nama;
        this.masinis = masinis;
    }

    public void setKelas(String kelas) {  
        this.kelas = kelas;
    }
    public void setNama(String nama) {  
        this.nama = nama;
    }
    public void setMasinis(Pegawai masinis) {  
        this.masinis = masinis;
    }
    public void setAsisten(Pegawai asisten) { 
        this.asisten = asisten;
    }
    public String getKelas(){
        return kelas;
    }
    public String getNama(){
        return nama;
    }
    public Pegawai getMasinis(){
        return masinis;
    }
    public Pegawai getAsisten(){
        return asisten;
    }
    public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masinis.info() + "\n";
        info += "Asisten: " + this.asisten.info() + "\n";
        return info;
    }
}
public class MainPercobaan3{
        public static void main(String[] args) {
            Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");
            Pegawai asisten = new Pegawai("4567", "Patrick Star");
            KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis, asisten);
            System.out.println(keretaApi.info());
}
}