import java.util.Scanner;
public class gameFps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Jarak: ");
        int jarak = input.nextInt();
        if(jarak <=5){
            System.out.println("Jarak kurang dari 5 meter maka menggunakan melee weapon");
        }
        else if(jarak > 5) {
            System.out.println("Jarak lebih dari 5 meter maka menggunakan range weapon");
        }
    }
}
