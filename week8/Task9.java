package week8;

public class Task9 {
    public static void main(String[] args) {
        int[] mylist = new int[5];
        for(int i = 0; i < mylist.length; i++) {
            mylist[i]=(int)(Math.random()*mylist.length);
        }

        System.out.println("Array before shifting: ");
        for(int i = 0; i < mylist.length; i++) {
            System.out.print(mylist[i]+" ");
        }
    }
}
