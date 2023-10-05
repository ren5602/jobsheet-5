import java.util.Scanner;
public class usernamePassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Username: ");
        String username = input.next();
        System.out.print("Masukkan Password: ");
        String password = input.next();
        String login = (username.equals("aziz") && password.equals("1234"))?"Log in Berhasil": "Log in Gagal";
        System.out.println(login);

    }
}
