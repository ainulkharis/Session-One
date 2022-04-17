public class SimpleSouting {

    public static void main(String[] args) {

        int[]angka = {5,6,1,0,2};
        for(int i=0;i<angka.length;i++){
            for(int j=i+1;j<angka.length;j++){
                if (angka[i]>angka[j]){
                    int angkakecil = angka[j];
                    angka[j]=angka[i];
                    angka[i]=angkakecil;
                }
            }

            for(int u=0;u<angka.length;u++){
                System.out.println(angka[u]);
            }
        }
    }
}
