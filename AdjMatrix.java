import java.util.Scanner;

public class AdjMatrix {

    public AdjMatrix() {

    }

    public static void main(String[] args) {

        int[][] daftar_jarak = new int[3][4];

        System.out.println("Input Data Jarak ");
        System.out.println("-------------------");
        for (int baris=0;baris<3;baris++) {
            for (int kolom=0;kolom<4;kolom++) {
                try {
                    Scanner inputJarak = new Scanner(System.in);
                    System.out.print("Input Baris ke " + baris + " Kolom ke " + kolom + " = ");
                    int jarak = inputJarak.nextInt();
                    daftar_jarak[baris][kolom] = jarak;
                    System.out.println(" ");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("\nData jarak yang diinput ");
        System.out.println("------------------------------");
        for (int baris=0;baris<3;baris++) {
            for (int kolom=0;kolom<4;kolom++) {
                System.out.print(daftar_jarak[baris][kolom] + " ");
            }
            System.out.println(" ");
        }
    }
}
