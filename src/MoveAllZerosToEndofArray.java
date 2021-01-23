
public class MoveAllZerosToEndofArray {

    // Move all zero elements to the end of array
    public static void main(String[] args) {

        int[] array = {1, 9, 8, 4, 0, 0, 2, 7, 0 ,6, 0, 9};

        array = putZerosEnd(array);

        for(int i:array){
            System.out.print(i + " ");
        }
    }

    // Time complexity : O(n)
    private static int[] putZerosEnd(int[] array) {

        int counter = 0;

        for (int i=0;i<array.length;i++){
            if(array[i]>0){
                array[counter++] = array[i];
            }
        }

        while(counter<array.length){
            array[counter++]=0;
        }

        return array;
    }
}

