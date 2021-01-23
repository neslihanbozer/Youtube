public class BinarySearch {

    public int binarySearchRecursion(int[] searchArray, int i) {

        return binarySearchRecursionHelper(searchArray, 0, searchArray.length-1, i);
    }

    private int binarySearchRecursionHelper(int[] searchArray, int left, int right, int item) {

        if(left>right){
            return -1;
        }

        int pivot = (right - left) / 2 + left;

        if(item == searchArray[pivot]){
            return pivot;
        } else if(item < searchArray[pivot]){
            return binarySearchRecursionHelper(searchArray, left, pivot-1, item);
        } else {
            return binarySearchRecursionHelper(searchArray, pivot+1, right, item);
        }

    }

    public int binarySearchIteration(int[] searchArray, int item) {

        int left = 0;
        int right = searchArray.length -1;

        while(left <= right){
            int pivot = (right - left)/2 + left;

            if(searchArray[pivot] == item){
                return pivot;
            } else if(searchArray[pivot] < item){
                left = pivot + 1;
            } else{
                right = pivot -1;
            }
        }

        return -1;
    }
}
