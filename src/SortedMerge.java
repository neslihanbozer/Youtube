public class SortedMerge {

    public int[] merge(int[] a, int[] b) {

        int pointer1 = a.length-b.length-1;
        int pointer2 = b.length-1;
        int mergedIndex = a.length-1;

        while(pointer2>=0) {

            if(pointer1>=0 && a[pointer1] > b[pointer2]) {
                a[mergedIndex] = a[pointer1];
                pointer1--;
            } else {
                a[mergedIndex] = b[pointer2];
                pointer2--;
            }
            mergedIndex--;
        }

        return a;
    }
}
