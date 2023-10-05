import java.util.Scanner;
public class PemilihanPercobaanv219{
    public static void main(String[] args) {
    Scanner input19 = new Scanner(System.in);

    System.out.print("Nilai uas   : ");
    float uas = input19.nextFloat();
    System.out.print("Nilai uts   : ");
    float uts = input19.nextFloat();
    System.out.print("Nilai kuis  : ");
    float kuis = input19.nextFloat();
    System.out.print("Nilai tugas : ");
    float tugas = input19.nextFloat();
    float total = (uas*0.4F)+(uts*0.3F)+(kuis*0.1F)+(tugas*0.2F);
    String massage = total < 65 ? "Remedi" : "Tidak remidi";
    System.out.println("Nilai Akhir = " + total +" Sehingga " + massage);

    String nilaiHuruf;
    double nilaiSetara;
    String kualifikasi;

    if (total>80 && total<=100){
    nilaiHuruf   = "A";
    nilaiSetara  = 4;
    kualifikasi  = "Sangat Baik";
    }

    else if ( total >73 && total <=80){
    nilaiHuruf   = "B+";
    nilaiSetara  = 3.5;
    kualifikasi  = "Lebih Dari Baik";
    }

    else if ( total >65 && total <=73){
    nilaiHuruf   = "B";
    nilaiSetara  = 3;
    kualifikasi  = "Baik";
    }

    else if ( total >60 && total <=65){
    nilaiHuruf   = "C+";
    nilaiSetara  = 2.5;
    kualifikasi  = "Lebih Dari Cukup";
    }

    else if ( total >50 && total <=60){
    nilaiHuruf   = "C";
    nilaiSetara  = 2;
    kualifikasi  = "Cukup";
    }

    else if ( total >39 && total <=50){
    nilaiHuruf   = "D";
    nilaiSetara  = 1;
    kualifikasi  = "Kurang";
    }
    else if ( total <=39){
    nilaiHuruf   = "E";
    nilaiSetara  = 0;
    kualifikasi  = "Gagal";
    }
    else {
    nilaiHuruf   = "";
    nilaiSetara  = 0.0;
    kualifikasi  = "error";
    }
    System.out.println("Nilai Huruf = " + nilaiHuruf );
    System.out.println("Nilai Setara = " + nilaiSetara );
    System.out.println("Kualifikasi = " + kualifikasi );
    }
}
