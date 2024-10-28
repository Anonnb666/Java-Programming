package week8;

public class Task1 {
    public static void main(String[] args) {
        int[] values = new int[5];
        values[0] = 1;
        for (int i = 0; i < 5; i++) {
            if(i!=0)
            values[i] = i + values[i-1];
        }
        values[0]=values[1]+values[4];
    }
}
