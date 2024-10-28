package week8;

public class Task14 {
    public static void main(String[] args) {
        int[] sourceArray = {2, 3, 1, 5, 10};
        int[] targetArray = new int[sourceArray.length];
        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
        System.out.println("Target array after copying: ");
        for (int value : targetArray) {
            System.out.print(value + " ");
        }
    }
}
