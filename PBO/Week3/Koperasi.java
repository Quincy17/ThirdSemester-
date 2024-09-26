public class Koperasi{
    private String nama,NIK;
    private float limit_peminjaman, jumlah,saldo;
    
    Koperasi(String nama, String NIK, float limit_peminjaman){
        this.nama= nama;
        this.NIK = NIK;
        this.limit_peminjaman = limit_peminjaman;
        this.saldo = saldo;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNIK(String NIK){
        this.NIK = NIK;
    }
    public void setLimit(float limit_peminjaman){
        this.limit_peminjaman = limit_peminjaman;
    }
    public String getNama(){
        return nama;
    }
    public String getNIK(){
        return NIK;
    }
    public float getPinjam(){
        return saldo;
    }
    public float getLimit(){
        return limit_peminjaman;
    }
    public void angsur(float uang){
        if(saldo/10 >uang){
            System.out.println("Maaf,angsuran harus 10% dari jumlah pinjaman");
        }else{
            saldo -=uang;
        }
    }
    public void pinjam(float uang){
        saldo +=uang;
    }
}