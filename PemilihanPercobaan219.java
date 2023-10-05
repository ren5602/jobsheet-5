import java.util.Scanner;
public class PemilihanPercobaan219 {
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

    if (total>80 && total<=100){
    String nilaiHuruf   = "A";
    double nilaiSetara  = 4;
    String kualifikasi  = "Sangat Baik";
    System.out.println("Nilai Huruf = " + nilaiHuruf );
    System.out.println("Nilai Setara = " + nilaiSetara );
    System.out.println("Kualifikasi = " + kualifikasi );
    }

    else if ( total >73 && total <=80){
    String nilaiHuruf   = "B+";
    double nilaiSetara  = 3.5;
    String kualifikasi  = "Lebih Dari Baik";
    System.out.println("Nilai Huruf = " + nilaiHuruf );
    System.out.println("Nilai Setara = " + nilaiSetara );
    System.out.println("Kualifikasi = " + kualifikasi );
    }

    else if ( total >65 && total <=73){
    String nilaiHuruf   = "B";
    double nilaiSetara  = 3;
    String kualifikasi  = "Baik";
    System.out.println("Nilai Huruf = " + nilaiHuruf );
    System.out.println("Nilai Setara = " + nilaiSetara );
    System.out.println("Kualifikasi = " + kualifikasi );
    }

    else if ( total >60 && total <=65){
    String nilaiHuruf   = "C+";
    double nilaiSetara  = 2.5;
    String kualifikasi  = "Lebih Dari Cukup";
    System.out.println("Nilai Huruf = " + nilaiHuruf );
    System.out.println("Nilai Setara = " + nilaiSetara );
    System.out.println("Kualifikasi = " + kualifikasi );
    }

    else if ( total >50 && total <=60){
    String nilaiHuruf   = "C";
    double nilaiSetara  = 2;
    String kualifikasi  = "Cukup";
    System.out.println("Nilai Huruf = " + nilaiHuruf );
    System.out.println("Nilai Setara = " + nilaiSetara );
    System.out.println("Kualifikasi = " + kualifikasi );
    }

    else if ( total >39 && total <=50){
    String nilaiHuruf   = "D";
    double nilaiSetara  = 1;
    String kualifikasi  = "Kurang";
    System.out.println("Nilai Huruf = " + nilaiHuruf );
    System.out.println("Nilai Setara = " + nilaiSetara );
    System.out.println("Kualifikasi = " + kualifikasi );
    }
    else if ( total <=39){
    String nilaiHuruf   = "E";
    double nilaiSetara  = 0;
    String kualifikasi  = "Gagal";
    System.out.println("Nilai Huruf = " + nilaiHuruf );
    System.out.println("Nilai Setara = " + nilaiSetara );
    System.out.println("Kualifikasi = " + kualifikasi );
    }
}
}