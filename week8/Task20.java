package week8;

public class Task20 {
    public static int arrsearch(int[] list, int i) {
        for (int j = 0; j < list.length; j++) {
            if (list[j] == i)
                return j;

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] mylist = {1, 22, 4, 2, 1, 5, 35};
        int i = arrsearch(mylist, 4);
        System.out.println("The key is found at index:" + i);
    }
}
