package curs7;

public class HeapSort {
    public static <E> java.util.List<E> hSort(java.util.Collection<E> c){
        java.util.Queue<E> queue= new java.util.PriorityQueue<>(c);
        java.util.List<E> result=new java.util.ArrayList<E>();
        while ((!queue.isEmpty())){
            result.add(queue.remove());
        }
        return result;
    }
    public static void main(String[] args) {
        java.util.List<Integer> l=new java.util.ArrayList<Integer>(java.util.Arrays.asList(1,5,7,8,3,4));
        l=hSort(l);
        System.out.println(l);
    }
}
