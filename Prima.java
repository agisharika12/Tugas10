import java.util.Scanner;
public class Prima {
    public static void main(String args[])
    {
        Scanner rika = new Scanner(System.in);
        int bilangan, cek=0;

        System.out.println("Menentukan Bilangan Prima atau Bukan");
        System.out.print("Masukan Angka : ");
        bilangan=rika.nextInt();

        for (int i=2; i<=bilangan; i++){
            if (bilangan%i==0){
                cek++;
            }
        }

        if (cek==1){
            System.out.println(bilangan+" adalah bilangan prima");
        }else {
            System.out.println(bilangan+" bukan bilangan prima");
        }
    }
}