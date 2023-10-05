import java.util.Scanner;
public class PemilihanPercobaan119{
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);
        System.out.print("masukkan Angka: ");
        int angka = input19.nextInt();
        String result = (angka % 2 == 0)? "Angka " + angka + " Bilangan Genap" : "Angka " + angka + " Bilangan Ganjil";
        System.out.println(result);
        
    }
}