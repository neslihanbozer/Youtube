public class MergeTwoSortedList {

    public int[] mergeTwoSortedList(int[] l1, int[] l2) {

        int[] mergedList = new int[l1.length + l2.length];
        int l1length = l1.length;
        int l2length = l2.length;

        int l1Index = 0;
        int l2Index = 0;
        int mergedIndex = 0;

        while (l1Index < l1length && l2Index < l2length) {

            if(l1[l1Index] < l2[l2Index]){
                mergedList[mergedIndex] = l1[l1Index];
                l1Index++;
            } else if(l1[l1Index] > l2[l2Index]){
                mergedList[mergedIndex] = l2[l2Index];
                l2Index++;
            } else if(l1[l1Index] == l2[l2Index]){
                mergedList[mergedIndex] = l1[l1Index];
                l1Index++;
                mergedIndex++;
                mergedList[mergedIndex] = l2[l2Index];
                l2Index++;
            }
            mergedIndex++;
        }

        while(l1Index<l1length){
            mergedList[mergedIndex] = l1[l1Index];
            mergedIndex++;
            l1Index++;
        }

        while(l2Index<l2length){
            mergedList[mergedIndex] = l2[l2Index];
            mergedIndex++;
            l2Index++;
        }

        return mergedList;
    }
}
