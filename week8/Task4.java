package week8;

public class Task4 {
    public static void main(String[] args) {
        double [] mylist=new double[10];
        for (int i = 0; i < mylist.length; i++) {
            mylist[i]=Math.random()*10;
        }
        for (int i = 0; i < mylist.length; i++) {
            System.out.print(mylist[i]+" ");
        }
    }
}
