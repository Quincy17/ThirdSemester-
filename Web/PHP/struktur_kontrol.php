<?php 
$nilaiNumerik = 92;

if ($nilaiNumerik >= 90 && $nilaiNumerik <=100) {
    echo "Nilai huruf: A";
} elseif ($nilaiNumerik >= 80 && $nilaiNumerik < 90) {
    echo "Nilai huruf: B";
} elseif ($nilaiNumerik >= 70 && $nilaiNumerik < 80) {
    echo "Nilai huruf: C";
} elseif ($nilaiNumerik < 70) {
    echo "Nilai huruf: D";
}
echo "<br>";
echo "<br>";
$jarakSaatIni = 0;
$jarakTarget = 500;
$peningkatanHarian = 30;
$hari = 0;

while ($jarakSaatIni < $jarakTarget) {
    $jarakSaatIni += $peningkatanHarian;
    $hari++;
}

echo "Atlet tersebut memerlukan $hari hari untuk mencapai jarak 500 kilometer.</br>";
echo "<br>";
$jumlahLahan = 10;
$tanamanPerlahan = 5;
$buahPerTanaman = 10;
$jumlahBuah = 0;

for ($i = 1; $i <= $jumlahLahan; $i++) {
    $jumlahBuah += ($tanamanPerlahan * $buahPerTanaman);
}

echo "Jumlah buah yang akan dipanen adalah: $jumlahBuah. <br>";
echo "<br>";
$skorUjian = [85, 92, 78, 96, 88];
$totalSkor = 0;

foreach ($skorUjian as $skor) {
    $totalSkor += $skor;
}

echo "Total skor ujian adalah: $totalSkor. <br>";
echo "<br>";
$nilaiSiswa = [85, 92, 58, 64,90, 55, 88, 79, 70, 96];

foreach ($nilaiSiswa as $nilai) {
    if ($nilai < 60) {
        echo "Nilai: $nilai (Tidak Lulus) <br>";
        continue;
    }
    echo "Nilai: $nilai (Lulus) <br>";
}

echo "<br>";
$nilaiSiswa = [85, 92, 78, 64, 90, 75, 88, 79, 70, 90];
sort($nilaiSiswa);
$nilaiSiswa = array_slice($nilaiSiswa, 2, -2);
$totalNilai = array_sum($nilaiSiswa);
echo "Total Nilai yang akan digunakan untuk menentukan nilai rata-rata: $totalNilai <br>";
echo "<br>";
$hargaProduk = 120000;
$diskon = 20;

if ($hargaProduk > 100000) {
    $diskonNominal = ($hargaProduk * $diskon) / 100;
    $hargaSetelahDiskon = $hargaProduk - $diskonNominal;
    echo "Harga setelah diskon: Rp " . 
    number_format($hargaSetelahDiskon, 0, ',', '.');
} else {
    echo "Harga produk tidak memenuhi syarat untuk mendapat diskon. <br>";
}
echo "<br>";
$poin = 2200;
$totalSkor = $poin;
$hadiahTambahan = ($poin > 500) ? 'YA' : 'TIDAK';

echo "<br> Total skor pemain adalah: $totalSkor\n <br>";
echo "Apakah pemain mendapatkan hadiah tambahan? $hadiahTambahan\n";
