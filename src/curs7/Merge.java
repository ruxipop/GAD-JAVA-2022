package curs7;
import java.util.*;
public class Merge {
    public  static java.util.List<Integer> mergeSorted(List<Integer>l1,List<Integer>l2){
        l1.addAll(l2);
        Collections.sort(l1);
        return l1;
    }



    public static void main(String[] args) {
        List<Integer> l=new java.util.ArrayList<Integer>(Arrays.asList(5,4,3,2,1));
        List<Integer> l1=new java.util.ArrayList<Integer>(Arrays.asList(4,3,2,9,1));
        System.out.println(mergeSorted(l1,l));
    }
}
