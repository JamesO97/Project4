package project;

import java.util.Arrays;
import sort.MergeSorter;
import sort.SelectionSorter;
import sort.Sorter;
import util.ArrayUtil;
import util.Printer;
import util.StopWatch;

public class App {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        SelectionSorter selectionSorter = new SelectionSorter();
        MergeSorter mergeSorter = new MergeSorter();

 System.out.println("Size of Array\t\tTime Spent \t\tSort Type");
 System.out.println("----------------------------------------------------------");

 for(int i = 1; i < 6; i++){

 int size =(int)Math.pow(10, i);
 int[] a = ArrayUtil.randomIntArray((int)size,100);
 int[] b =Arrays.copyOf(a, a.length);

    analyzeSort(stopWatch, selectionSorter, a);
    analyzeSort(stopWatch, mergeSorter, b);
    }//end for
 }
  public static void analyzeSort(StopWatch stopWatch, Sorter sorter, int[] a){
        stopWatch.start();
        sorter.sort(a);
        stopWatch.stop();

 output((Printer)sorter, stopWatch, a.length);
 }

 public static void output(Printer printer, StopWatch stopWatch, int size){
        printer.outputToConsole(stopWatch, size);
        stopWatch.reset();
 }

}
