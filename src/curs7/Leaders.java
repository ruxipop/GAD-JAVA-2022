package curs7;

import java.util.*;

public class Leaders {
    public static List<Integer> findLeaders(java.util.List<Integer> list) {
        List<Integer> leaders = new java.util.ArrayList<>();
        Collections.reverse(list);
        Iterator<Integer> it = list.iterator();
        Integer max = list.get(0);
        Integer current;
        while (it.hasNext()) {
            current = it.next();
            if (current >= max) {
                max=current;
                leaders.add(current);
            }
        }
        return leaders;
    }

    public static void main(String[] args) {
   List<Integer> l=new java.util.ArrayList<Integer>(Arrays.asList(5,4,3,2,1));
   System.out.println(findLeaders(l));
    }
}
