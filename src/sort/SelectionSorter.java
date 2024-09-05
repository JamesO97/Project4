package sort;

import util.ArrayUtil;
import util.Printer;
import util.StopWatch;

public class SelectionSorter implements Sorter, Printer{
    
    public SelectionSorter() {
    }
    
    @Override
    public void sort(int[] a){
       for (int i = 0; i < a.length - 1; i++){
           int minPos = minimumPosition(a, i);
           ArrayUtil.swap(a, minPos, i);
       }
   }
   
   private int minimumPosition(int[] a, int from){
       int minPos = from;
       for (int i = from + 1; i < a.length; i++){
           if(a[i] < a[minPos]){
               minPos = i;
           }
       }
       return minPos;
   }
    @Override
    public void outputToConsole(StopWatch stopwatch, int size){
      System.out.printf("%13d", size);
      System.out.printf("%11d %1s", stopwatch.getElapsedTime(), "milliseconds");
      System.out.printf("\t\t%-22s\n","Selection Sort");
  }

}
