import java.util.Scanner;
public class PemilihanPercobaan319 {
 public static void main(String[] args) {
    Scanner input19 = new Scanner(System.in);
    double angka1, angka2, hasil;
    char operator;
    System.out.print("Masukkan angka pertama: ");
    angka1 = input19.nextDouble();
    System.out.print("Masukkan angka kedua: ");
    angka2 = input19.nextDouble();
    System.out.print("Masukkan operatir (+ - * / ): ");
    operator = input19.next().charAt(0);

    switch (operator){
        case '+':
            hasil   = angka1 + angka2;
            System.out.println(angka1 + " + " + angka2 + " = " + hasil);
            
        case '-':
            hasil   = angka1 - angka2;
            System.out.println(angka1 + " - " + angka2 + " = " + hasil);
            break;
        case '*':
            hasil   = angka1 * angka2;
            System.out.println(angka1 + " * " + angka2 + " = " + hasil);
            break;
        case '/':
            hasil   = angka1 / angka2;
            System.out.println(angka1 + " / " + angka2 + " = " + hasil);
            break;
    }
}   
}
