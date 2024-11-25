package week12;

public class TestPassObject {
    public static void main(String[] args) {
        CircleWithPrivateDataFields myObj = new CircleWithPrivateDataFields(1);

        int n=5;
        printAreas(myObj,n);

        System.out.println("\n"+"Radius: "+myObj.getRadius());
        System.out.println("n is "+n);

    }

    public static void printAreas(CircleWithPrivateDataFields myObj, int n) {
        System.out.println("Radius \t\tArea");
        while(n>=1){
            System.out.println(myObj.getRadius()+"\t\t"+myObj.getArea());
            myObj.setRadius(myObj.getRadius()+1);
            n--;
        }
    }

}
