public class ArrayMatrix {

    public static void main(String[] args) {

        int[] angka = {1,2,3,4,5,6,7,8};

        for(int i=0;i<angka.length;i++){
            System.out.println(angka[i]);
        }

        System.out.println("Cetak Array 2D");
        System.out.println("----------------");
        int [][] angka2D= {{1,2,3},
                           {4,5,6},
                           {7,8,9}};

        for (int baris=0;baris<3;baris++){
            for (int kolom=0;kolom<3;kolom++){
                System.out.println(angka2D[baris][kolom]+ " ");
            }
            System.out.println(" ");
        }

    }
}
