public class Problem2_KonversiNilai {
    public static void main(String[] args) {
        int studentScore = -1;
        System.out.println("Skor student : " +studentScore);
        if (studentScore > 79 && studentScore <= 100){
            System.out.println("Nilai : A");
        } else if (studentScore > 64 && studentScore < 80) {
            System.out.println("Nilai : B+");
        } else if (studentScore > 49 && studentScore < 65) {
            System.out.println("Nilai : B");
        } else if (studentScore > 34 && studentScore < 50) {
            System.out.println("Nilai : C");
        } else if (studentScore >= 0 && studentScore < 35) {
            System.out.println("Nilai : D");
        }else {
            System.out.println("Invalid");
        }
    }
}
