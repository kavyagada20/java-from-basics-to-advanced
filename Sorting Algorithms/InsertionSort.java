class InsertionSort {
    //it's less effective than quick,heap and merge sort;but is benefial if we sort when there are lesser no. of the elements
    
    public static void main(String[] args) {
        int[] a={38,52,9,6,62,13};
        //String [] a={"Deepak","amit","vironika","rahul","deepash"};
        int j,temp;
        //String temp="";
       for(int i=1;i<a.length;i++)
       {
           temp=a[i];
           j=i;
           while(j>0 && a[j-1]>temp)
           {
               a[j]=a[j-1];
               j=j-1;
           }
           a[j]=temp;
           
        }
        
        for(int i=0;i<a.length;i++)
        {
             System.out.println(a[i]); 
        }
    }
}