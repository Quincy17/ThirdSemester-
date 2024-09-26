class Persegi {
    private int sisi;
    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public void dataPersegi() {
        System.out.println("Panjang sisi persegi: " + sisi);
    }

    public int luasPersegi() {
        return sisi*sisi;
    }

    public int kelilingPersegi() {
        return 4*sisi;
    }
}

public class TampilPersegi {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(5);

        persegi.dataPersegi();

        System.out.println("Luas persegi: " + persegi.luasPersegi());

        System.out.println("Keliling persegi: " + persegi.kelilingPersegi());
    }
}
