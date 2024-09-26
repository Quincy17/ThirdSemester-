import java.util.Scanner;
public class TestKoperasi{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Koperasi farrel= new Koperasi("Farrel", "3573", 3000000);

        System.out.println("Nama Anggota     : " +farrel.getNama() );
        System.out.println("Limit Peminjaman : " +farrel.getLimit() );

        System.out.print("\nMasukkan jumlah uang yang akan dipinjam: ");
        float jumlahPinjam = input.nextFloat();
        farrel.pinjam(jumlahPinjam);
        System.out.println("Jumlah Pinjaman saat ini : " + farrel.getPinjam());

        System.out.print("\nMasukkan jumlah uang untuk angsuran: ");
        float jumlahAngsur = input.nextFloat();
        farrel.angsur(jumlahAngsur);
        System.out.println("Jumlah Pinjaman saat ini : " + farrel.getPinjam());

        System.out.print("\nMasukkan jumlah uang yang akan dipinjam lagi: ");
        jumlahPinjam = input.nextFloat();
        farrel.pinjam(jumlahPinjam);
        System.out.println("Jumlah Pinjaman saat ini : " + farrel.getPinjam());

        System.out.print("\nMasukkan jumlah uang untuk angsuran lagi: ");
        jumlahAngsur = input.nextFloat();
        farrel.angsur(jumlahAngsur);
        System.out.println("Jumlah Pinjaman saat ini : " + farrel.getPinjam());
    }
}