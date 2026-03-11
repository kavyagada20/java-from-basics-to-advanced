 class OopsPraticeq {
    public static void main(String[] args) {
        //Problem 1
        Employee harry=new Employee();
        harry.salary=233;
        harry.setName("Codewith harry");
        System.out.println( harry.getName() );
        System.out.println( harry.getSalary() );
        System.out.println( harry.salary );
        System.out.println( harry.salary() );
    }
}

class Employee{
    String name;
    int salary;
    
    public String getName(){
       return name;
    }
    public void setName(String n){
        name=n;
    }
    public int getSalary(){
        return salary;
    }
    public int salary(){
        return salary;
    }
}