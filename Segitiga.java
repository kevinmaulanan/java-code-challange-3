import java.util.Scanner;

public class Segitiga {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan tinggi segitiga: ");
        int tinggi = scanner.nextInt();
        for (int i = tinggi, k = 0; i >= 0 && k <= tinggi; i--, k++) {
            String text = "";
            for (int j = 0; j < i; j++) {
                countinue;
            }
            for (int j = 0; j < k; j++) {
                text += "*";
            }
            for (int j = 1; j < k; j++) {
                text += "*";
            }
            System.out.println(text);
        }
    }
}