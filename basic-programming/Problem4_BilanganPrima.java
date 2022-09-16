public class Problem4_BilanganPrima {

//    private static boolean primeNumber(int number) {
//        boolean k = true;
//        int i;
//        if (number == 0 || number = 1) {
//            k = false;
//
//        } else {
//            for (i = 2; i <= number; i++) {
//                if (number % i == 0 && i != number) {
//                    k = false;
//                }
//            }
//            return k;
//        }
//    }


    private static boolean primeNumber(int number){
        boolean k = true;
        int i;
        if (number == 0 || number == 1){
            k = false;
        }
        for (i = 2; i <= number; i++){
             if (number % i == 0 && i != number){
                k = false;
            }
        }
        return k;
    }
    public static void main(String[] args) {

        System.out.println(primeNumber(11));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));
    }
}
