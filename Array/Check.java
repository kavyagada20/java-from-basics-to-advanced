public class Check
{
	public static void Sum(String[] args) {
		System.out.println("Hello World");
	float []marks={  23.4f,43.2f,87.4f};
	float sum=0;

float num=43.2f;
boolean isInArray=false;

for(float element:marks){
if (num==element){
isInArray=true;
break;
}
if(isInArray){
System.out.println("the value is present in the array");
}
else{
System.out.println("the value is not present in the array");
}

}
System.out.println("the value is of avg marks"+sum);
for(float element:marks){
    sum=sum+element;
}
System.out.println("The value of sum is "+sum/marks.length);


}
}