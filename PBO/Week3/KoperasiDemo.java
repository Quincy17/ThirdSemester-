public class KoperasiDemo{
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Caesar", "Malang");
        System.out.println("Simpanan "+anggota1.getNama()+" : Rp " + anggota1.getSimpanan());
        
        anggota1.setNama("Farrel");
        anggota1.setAlamat("Malang");
        anggota1.setor(100000);
        System.out.println("Simpanan "+anggota1.getNama()+" : Rp " + anggota1.getSimpanan());

        anggota1.pinjam(50000);
        System.out.println("Simpanan "+anggota1.getNama()+" : Rp " + anggota1.getSimpanan());
    }
} 