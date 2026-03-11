class over
{
public static void main(String[] args)
{
over obj= new over();
obj.Area(2);
obj.Area(2,4);
obj.Area(2.2,3.14);
}
void Area(int a, int b)
{
int area = a*b;
System.out.println("Area of rectangle = "+area);
}
void Area(int a)
{
int area = a*a;
System.out.println("Area of square = "+area);
}
void Area(double r, double p)
{
p=3.14;
double area = p*r*r;
System.out.println("Area of circle = "+area);
}
}
