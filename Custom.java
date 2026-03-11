class Custom {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee haryy = new Employee();
        Employee kavya = new Employee();
        //Instantiating a new Employee Object
        
        //Setting attributes
        haryy.id=12;
        haryy.name="Codewithharry";
        
        kavya.id=12;
        kavya.name="Codewithkavya";
        kavya.salary=100000;
        
        
        //printing the attributes
        // System.out.println(haryy.id);
        // System.out.println(haryy.name);
        
         haryy.printdetails();
         kavya.printdetails();
        int s=kavya.getsalary();
        System.out.println(s);
    }
}

class Employee{
    int id;
    String name;
    int salary;
    public void printdetails(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }
    public int getsalary(){
        return salary;
    }
}
//Only 1 class can be used with public
