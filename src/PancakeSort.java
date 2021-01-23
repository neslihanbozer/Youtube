public class PancakeSort {

    public int[] sort(int[] array) {

        int currentsize = array.length;

        for(int curr_size = currentsize; curr_size>1; --curr_size){

            // Find the index of the maximum element in arr[0..curr.size-1]
            int mi = findMaxIndex(array, curr_size);

            // Move the maximum element to the end of the current array
            // if it's not already at the end.
            if(mi != curr_size -1){

                // To move at the end
                // first move maximum number to beginning
                array = flip (array, mi);

                // Now move the maximum number to the end by
                // reversing current array
                array = flip(array, curr_size -1);

            }

        }
        return array;
    }

    public int findMaxIndex(int[] array, int n){
        int i, mi;
        for(i=0,mi=0;i<n;++i){
            if(array[mi] <array[i]){
                mi = i;
            }
        }
        return  mi;
    }

    public int[] flip(int[] array, int k){
        int lastIndex = k;
        for(int j=0;j<=k/2;j++){
            int temp = array[lastIndex];
            array[lastIndex] = array[j];
            array[j] = temp;

            lastIndex--;
        }

        return array;
    }
}
