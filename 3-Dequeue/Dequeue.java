import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Dequeue {
    public static void main(String[] args) {

        System.out.println(findUniqueNumbersCount(new int[] {4,5,2,1,2},3));
        System.out.println(findUniqueNumbersCount(new int[] {6,10,4,5,2,1,2},7));
        System.out.println(findUniqueNumbersCount(new int[] {6,10,4,5,2,1,2},10));
        System.out.println(findUniqueNumbersCount(new int[] {7,10,2,1,2},-4));
        System.out.println(findUniqueNumbersCount(new int[] {},3));
        System.out.println(findUniqueNumbersCount(null,7));


    }


    static String findUniqueNumbersCount(int[] arr,int n){
        if(arr==null)
            return "Give proper input not null array";
        if(n>arr.length)
            return "Give proper input, sub array length exceeds array length";
        if(arr.length==0)
            return "Give proper input not empty array";

        if(n<=0)
            return "Give proper input, sub array length can not be negative or zero";
        Deque<Integer> deq=new LinkedList<>();
        Set<Integer> set=new HashSet<>();
        int i,max=-1;
        for(i=0;i<n;i++)
        {
            deq.add(arr[i]);
            set.add(arr[i]);
        }
        if(deq.size()== set.size())
            return "Count of Unique Numbers is "+set.size();
        max=Math.max(max, set.size());
        while(i<arr.length)
        {
            deq.removeFirst();
            if(!deq.contains(arr[i-n]))
            {
                set.remove(arr[i-n]);
            }
            deq.add(arr[i]);
            set.add(arr[i]);
            max=Math.max(max,set.size());
        }
        return "Count of Unique Numbers is "+max;
    }
}
