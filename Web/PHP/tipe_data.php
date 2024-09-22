<?php 
$a = 10;
$b = 5;
$c = $a+5;
$d = $b+(10*5);  
$e = $d-$c;

echo "Variabel a: {$a} <br>"; 
echo "Variabel b: {$b} <br>";
echo "Variabel c: {$c} <br>";
echo "Variabel d: {$d} <br>";
echo "Variabel e: {$e} <br>";

var_dump($e);
echo "<br>";
echo "<br>";
$nilaiMatematika = 5.1;
$nilaiIPA = 6.7;
$nilaiBahasaIndonesia = 9.3;

$rataRata = ($nilaiMatematika +$nilaiIPA + $nilaiBahasaIndonesia) /3;

echo("Nilai Matematika : {$nilaiMatematika} <br>");
echo("Nilai IPA : {$nilaiIPA} <br>");
echo("Nilai Bahasa Indonesia : {$nilaiBahasaIndonesia} <br>");
echo("Rata - Rata : {$rataRata} <br> ");

var_dump($rataRata);

$apakahSiswaLulus = true;
$apakahSiswaSudahUjian = false;
echo "<br>";
echo "<br>";
var_dump($apakahSiswaLulus);
echo "<br>";
var_dump($apakahSiswaSudahUjian);
echo "<br>";
echo "<br>";
$namaDepan = "Farrel";
$namaBelakang= "Caesarian";

$namaLengkap = "{$namaDepan} {$namaBelakang}";
$namaLengkap2 = $namaDepan . ' ' .$namaBelakang;

echo "Nama depan : {$namaDepan} <br>";
echo 'Nama Belakang : ' . $namaBelakang .'<br>';

echo $namaLengkap;
echo "<br>";
echo "<br>";
$listMahasiswa = ["Fatih Robby","Rifqi Rizqullah","Nabeel Nizam"];
echo $listMahasiswa[0];