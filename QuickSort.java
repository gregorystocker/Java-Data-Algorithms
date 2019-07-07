import java.util.ArrayList;
import java.util.Random;

//Has an average time of O(n log n)
//Has a big O time of (n^2)
//Almost a constant amount of memory
//Very popular sorting algorith,
/*
*Uses a divide and conquor recursion strategy to break a list down into a left and right partition. The idea is that the
* numbers less than the pivot are sent to the left and the numbers greater are sent to the right. This is a fast algorithm,
* and with a randomly generated pivot. The runtime converges to n log n for a big enough data set. Another benifit is you can do it
* only using the original array so the space allocation is minimal unlike merge sort. This is called an inplace algorithm. This and merge are my favorite sorting
* algorithms so far.
*/

public class QuickSort {



    private int counter; // this is just for tracking runtime
    private ArrayList<Integer> list;
    QuickSort(ArrayList<Integer> plist){
        list = plist;
        //passes in the initial start and end values for the entire array.
        sort(0, plist.size() -1);

        System.out.println("list: " + list);
        System.out.println("key operation count: " + counter);
    }


    //create constructor for QuickSort
    private void sort (int start, int end){
        int part;

        if(start < end){
            //partition gets values < pivot on left and > pivot on right.
           part = partition(start, end);

           //sort the left list
           sort(start, part);
           //sort the right list
           sort(part + 1, end);
        }

       counter++;
    }//end sort

    private int generateRandom(int start, int end){
        Random rand = new Random();
        return rand.nextInt(end - start) + start;
    }//end generate random

    private Integer partition(int start, int end) {
        //get random pivotIndex
        int pivotIdx = generateRandom(start, end);
        Integer pivot =  list.get(pivotIdx);
        Integer init = start;
        Integer length = end;


        while(true){

        while (list.get(length) > pivot && length > init) {
            length--;
        }
        while ( list.get(init) < pivot && init < end) {
            init++;
        }
        if (init < length){
            swapValues(init, length);
        } else {
            return length;
        }

    }


    }//ends partition

    private void swapValues(int a, int b) {
        int temp;
        temp = list.get(b);
        list.set(b, list.get(a));
        list.set(a, temp);
    }//ends swapValues

}//ends QuickSort




