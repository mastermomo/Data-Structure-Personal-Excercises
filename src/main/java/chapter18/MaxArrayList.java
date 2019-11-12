package chapter18;

import java.util.ArrayList;

/**
 * @author Mohammad Khan
 */
public class MaxArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(new Integer(8));
        list.add(new Integer(9));
        list.add(new Integer(4));
        list.add(new Integer(5));
        
        System.out.println("Max: " + MaxArrayList.<Integer>max(list));
    }
    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
            E currentMin;
        int currentMinIndex;
        
        for(int i = 0; i < list.size() - 1; i++) {
            currentMin = list.get(i);
            currentMinIndex = i;
            
            for(int j = i + 1; j < list.size(); j++) {
                if(currentMin.compareTo(list.get(j)) > 0) {
                    currentMin = list.get(j);
                    currentMinIndex = j;
                }
            }
            if(list.get(currentMinIndex) != list.get(i)) {
                list.set(currentMinIndex, list.get(i));
                list.set(i, currentMin);   
            } 
        }
        return list.get(list.size() -1);
    }
}
