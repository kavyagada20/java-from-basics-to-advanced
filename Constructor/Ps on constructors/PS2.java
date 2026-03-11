
class PS2{
    public static void main(String[] args) {
        // Scanner sc=new scanner(System.in);
        // System.out.println("");
        // int b=sc.nextInt();
        Rectangle myCylinder=new Rectangle();
        myCylinder.setLength(12);
        int h=myCylinder.getLength();
        System.out.println(h);
        myCylinder.setBreadth(13);
        int r=myCylinder.getBreadth();
        System.out.println(r);
        System.out.println();
        System.out.println();
        
    }
}

class Rectangle {
  private int length;
  private int breadth;
  
  public Rectangle(){
      this.length=4;
      this.breadth=5;
  }
  public Rectangle(int length,int breadth){
      this.length=length;
      this.breadth=breadth;
  }
    public int getLength(){
        return length;
    }
    public void setLength(int length){
        this.length=length;
    }
    public int getBreadth(){
        return breadth;
    }
    public void setBreadth(int breadth){
        this.breadth=breadth;
    }
}