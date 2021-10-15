import java.util.Scanner;

public class PersegiPanjang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan lebar persegi panjang: ");
        int lebar = scanner.nextInt();
        System.out.println("Masukkan tinggi persegi panjang: ");
        int tinggi = scanner.nextInt();
        
        
        for (int i = 0; i < tinggi; i++) {
            String text = ""; 
            for (int j = 0;j < lebar; j++) {
                text += "0 ";
            }
            System.out.println(text);
        }
    }
}