import java.util.Scanner;
public class Kabisat {
    public static void main(String[] args) {
        int tahun;
        Scanner rika = new Scanner(System.in);
        System.out.print("Masukkan tahun : ");
        tahun = rika.nextInt();
        if (tahun % 400 == 0) {
            System.out.print(tahun + " Merupakan Tahun Kabisat\n");
        } else if (tahun % 100 == 0) {
            System.out.print(tahun + " Bukan Tahun Kabisat\n");
        } else if (tahun % 4 == 0) {
            System.out.print(tahun + " Merupakan Tahun Kabisat\n");
        } else {
            System.out.print(tahun + " Bukan Tahun Kabisat\n");
        }
    }
}
