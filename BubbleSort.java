import java.util.ArrayList;
public class BubbleSort {

   //constructor
    BubbleSort(ArrayList<Integer> plist){

        //passes into the function with lower case b bubbleSort instead of BubbleSort.
        bubbleSort(plist);

    }

    public ArrayList<Integer> bubbleSort(ArrayList<Integer> list) {
        Integer temp;
        int counter = 0;

        for (int k = 0; k < list.size() - 1; k++) {
            for (int i = 0; i < list.size() - 1; i++) {

                counter++;
                if (list.get(i) > list.get(i + 1)) {

                    //set(index, element)
                    temp = list.get(i + 1);
                    list.set(i + 1, list.get(i));
                    list.set(i, temp);


                }//ends if
            }//ends inner for loop i
        }//ends outer for loop k

        System.out.println("list: " +  list);
        System.out.println("key operation count: " + counter);
        return list;
    }//ends bubbleSort
}
