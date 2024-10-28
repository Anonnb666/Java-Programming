package week8;

public class Task18 {
    public static void main(String[] args) {
        int[] mylist1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] mylist2 = reverse(mylist1);
        for (int i = 0; i < mylist2.length; i++) {
            System.out.print(mylist2[i] + " ");
        }
    }

    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            result[i] = list[list.length - 1 - i];
        }
        return result;
    }
}
