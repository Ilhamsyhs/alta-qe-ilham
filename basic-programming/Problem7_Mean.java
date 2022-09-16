public class Problem7_Mean {
    private static float Mean(float[] number){
        int i;
        float sum = 0;
        for (i=0; i<number.length; i++){
            sum += number[i];
        }
        float avg = sum / number.length;
        return avg;
    }

    public static void main(String[] args) {
        float[] value = {3, 7, 2, 1};
        System.out.println(Mean(value)); //2.5
    }

}
