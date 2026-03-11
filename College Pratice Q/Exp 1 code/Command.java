class Command
{
public static void main(String args[])
{
System.out.println("Enter the number (less than ten billion)"+args[0]);
int n=Integer.parseInt(args[0]);
int count=0;
while(n!=0)
{
n=n/10;
count++;
}
System.out.println("NUmber of digits are:"+count);
}
}