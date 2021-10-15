import java.util.Scanner;

public class Kotak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan panjang sisi persegi: ");
        int sisi = scanner.nextInt();
        for (int i = 0; i < sisi; i++) {
            String text = ""; 
            for (int j = 0;j < sisi; j++) {
                text += "0 ";
            }
            System.out.println(text);
        }
    }
}