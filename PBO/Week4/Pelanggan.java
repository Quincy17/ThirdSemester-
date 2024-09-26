

public class Pelanggan{
    private String nama;
    private int hari;
    private Mobil mobil;
    private Sopir sopir;

    public void setNama(String nama){
        this.nama = nama;
    }
    public void setHari(int hari){
        this.hari = hari;
    }
    public void setMobil(Mobil mobil){
        this.mobil = mobil;
    }
    public void setSopir(Sopir sopir){
        this.sopir = sopir;
    }
    public String getNama(){
        return nama;
    }
    public int getHari(){
        return hari;
    }
    public Mobil getMobil(){
        return mobil;
    }
    public Sopir getSopir(){
        return sopir;
    }
    public int hitungBiayaTotal() {
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
    }
    
}