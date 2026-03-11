class Pattern2

{ public static void main(String args[])
{
int i,j;
char ch='A';
for(i=1;i<=4;i++)
{
 for(j=1;j<=4-i;j++)
{  
System.out.print(" ");
}
 for(j=1;j<=1;j++)
{  
System.out.print(ch--);
}
ch++;
for(j=1;j<=1;j++)
{ 
ch++;
ch++;
}
System.out.println(" ");
}

}
}