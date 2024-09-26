package percobaan2;
class Mobil {
    private String merk;
    private int biaya;

    public Mobil(String merk, int biaya) {
        this.merk = merk;
        this.biaya = biaya;
    }

    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }

    public String getMerk() {
        return merk;
    }
}

class Sopir {
    private String nama;
    private int biaya;

    public Sopir(String nama, int biaya) {
        this.nama = nama;
        this.biaya = biaya;
    }

    public int hitungBiayaSopir(int hari) {
        return biaya * hari;
    }

    public String getNama() {
        return nama;
    }
}

class Pelanggan {
    private String nama;

    public Pelanggan(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

class PaketRental {
    private Mobil mobil;
    private Sopir sopir;
    private Pelanggan pelanggan;
    private int hari;

    public PaketRental(Mobil mobil, Sopir sopir, Pelanggan pelanggan, int hari) {
        this.mobil = mobil;
        this.sopir = sopir;
        this.pelanggan = pelanggan;
        this.hari = hari;
    }

    public int hitungBiayaTotal() {
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
    }

    public void tampilInfo() {
        System.out.println("Nama Pelanggan: " + pelanggan.getNama());
        System.out.println("Mobil: " + mobil.getMerk());
        System.out.println("Sopir: " + sopir.getNama());
        System.out.println("Lama sewa: " + hari + " hari");
        System.out.println("Total Biaya: " + hitungBiayaTotal());
    }
}

public class TugasJobsheet4 {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Palisade", 450000);
        Sopir sopir = new Sopir("Farrel", 100000);
        Pelanggan pelanggan = new Pelanggan("Caesarian");

        PaketRental paketRental = new PaketRental(mobil, sopir, pelanggan, 7);
        paketRental.tampilInfo();
    }
}
