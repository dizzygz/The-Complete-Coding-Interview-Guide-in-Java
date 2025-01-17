package coding.challenge;
 
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Box b1 = new Box(10, 5, 2);           
        //Box b2 = new Box(10, 7, 1);
       // Box b3 = new Box(10, 3, 1);
        //Box b4 = new Box(14, 10, 3);
       // Box b5 = new Box(5, 7, 1);
       // Box b6 = new Box(7, 5, 1);
        //Box b7 = new Box(2, 8, 1);
        
        MyBox b1 = new MyBox(10, 5, 2);
        MyBox b2 = new MyBox(10, 7, 1);
        MyBox b3 = new MyBox(10, 3, 1);
        MyBox b4 = new MyBox(14, 10, 3);
        MyBox b5 = new MyBox(5, 7, 1);
        MyBox b6 = new MyBox(7, 5, 1);
        MyBox b7 = new MyBox(2, 8, 1);

        List<MyBox> boxes = Arrays.asList(b1, b2, b3, b4, b5, b6, b7);
        
        int highest1 = MyTower.build(boxes);
       // int highest2 = Tower.buildViaMemoization(boxes);

        System.out.println("\nThe highest tower of colored boxes has a high of (plain recursion): " + highest1);
       // System.out.println("\nThe highest tower of colored boxes has a high of (Memoization): " + highest2);
    }

}
