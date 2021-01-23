import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AbsoluteValue {

    public int[] absSort(int[] array) {

        List<Integer> list = new ArrayList<Integer>();
        for(int i: array){
            list.add(i);
        }
        Collections.sort(list, AbsoluteComparator);

        for(int i=0;i<list.size();i++){
            array[i] = list.get(i);
        }
        return array;
    }

    public static Comparator<Integer> AbsoluteComparator = new Comparator<Integer>() {
        @Override
        public int compare(Integer a, Integer b) {
            if(Math.abs(a) < Math.abs(b) ) return -1;
            if(Math.abs(a) > Math.abs(b) ) return  1;
            if(a<b) return -1;
            if(a>b) return 1;
            return 0;
        };
    };
}
