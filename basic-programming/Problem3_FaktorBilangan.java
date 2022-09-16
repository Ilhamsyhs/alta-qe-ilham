public class Problem3_FaktorBilangan {
    public static void main(String[] args) {
        int bilangan = 20;
        System.out.println("Masukkan Angka : " + bilangan);
        System.out.println("Faktor dari " + bilangan + " adalah : ");
        for (int i=1; i<=bilangan; i++){
            if (bilangan % i == 0) {
                System.out.println(i + "");
            }
        }
    }
}
