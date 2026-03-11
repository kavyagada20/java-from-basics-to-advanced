public class ReverseArray
{
	public static void main(String[] args) {
	  //reversing the array
	  int a=Math.floorDiv(5,2);//it is greatest integer fxn of 5/2 i.e of 2.5 which is 2
	  System.out.println(a);
	  
	  int [] arr={1,2,3,4,5};
	  System.out.println("the given array is:");
	  for(int ele:arr){
	        System.out.print(ele+" " );
	  }
	  System.out.println();
	  int l=arr.length;
	  int n=Math.floorDiv(l,2);
	  System.out.println("the reverse array is:");
	  for(int i=0;i<n;i++){
	     
	      //Swap a[i] and a[l-1-i]
	      int temp=arr[i];
	      arr[i]=arr[l-1-i];
	      arr[l-1-i]=temp;
	      
	  }
	  for(int element:arr){
	      System.out.print(element+" ");
	  }
 
	}
}
