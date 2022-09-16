public class Problem6_DrawXYZ {

    private static void DrawXYZ(int n) {
        int i,j,k = 0;

        for (i = 1; i <= n; i++) {
            for (j=1; j<=n; j++){
                k++;
                if (k % 3 == 0 ) {
                    System.out.print(" X ");
                } else if (k % 2 == 0 ) {
                    System.out.print(" Z ");
                } else {
                    System.out.print(" Y ");
                }
                //System.out.print(k+ " ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        DrawXYZ(3);
    }
}
