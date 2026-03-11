public class Matrixsum
{
	public static void main(String[] args) {
	    int[][] mat1={ {1,2,3}
	                    ,{4,5,6}};
	    int[][] mat2={ {0,0,0}, 
	                    {4,5,6}};
	                   
	    int[][] result={ {0,0,0}, 
	                    {0,0,0}};
	                    
        for(int i=0;i<mat1.length;i++){//row no. of the times
            for(int j=0;j<mat1[i].length;j++){//column no.s of times
          System.out.format("Setting value for i=%d and j=%d \n",i,j);
               
            }
        }
                  System.out.println("the value of sum of array is:");
                for(int i=0;i<mat1.length;i++){//row no. of the times
            for(int j=0;j<mat1[i].length;j++){//column no.s of times
          
  
                result[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print(result[i][j] +"\t" );
            }
             System.out.print("\n");
        }
    
   
    

	}
}
