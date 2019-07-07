import java.util.ArrayList;
import java.util.Random;

public class Main {


    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList();
        list.add(7);
        list.add(3);
        list.add(18);
        list.add(6);
        list.add(9);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(13);
        list.add(0);


        Main mainObj = new Main();


        QuickSort sortingObj = new QuickSort(list);
        BubbleSort bubs = new BubbleSort(list);


    }//ends public static void main(String[] args){}

}//ends Main