class MergeSortIncomplete {
     int[] array;
        int[] tempMergeArr;
        int length;
    public static void main(String[] args) {
       
        int[] a={38,52,9,6,62,13};
        Mergesort ms = new MergeSort();
        ms.sort(int inputArr);
        

    }
    public void sort(int inputArr[])
    {
        this.array=inputArr;
        this.length=inputArr.length;
        this.tempMergeArr=new int[length-1];
    }
    public void divideArray(int lowerIndex,int higherIndex){
        if()
    }
}