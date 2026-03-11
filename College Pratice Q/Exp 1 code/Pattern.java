class Pattern{ 
public static void main(String args[])

{

int i,j;
for(i=1;i<=7;i++)
{
for(j=1;j<=i;j++)
{
if(i%2==0)
System.out.print(i-j+1);
else System.out.print(j);
}
System.out.println(" ");
}

}
}