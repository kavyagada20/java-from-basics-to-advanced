import java.util.Scanner;

class CylinderTsaVolume{
    public static void main(String[] args) {
        // Scanner sc=new scanner(System.in);
        // System.out.println("enteer a integer between 0 to 100");
        // int b=sc.nextInt();
        // System.out.println("Try programiz.pro");=n
        Cylinder myCylinder=new Cylinder();
        myCylinder.setHeight(12);
        int h=myCylinder.getHeight();
        System.out.println(h);
        myCylinder.setRadius(13);
        int r=myCylinder.getRadius();
        System.out.println(r);
        System.out.println(myCylinder.totalSurfaceArea());
        System.out.println(myCylinder.volume());
        
    }
}

class Cylinder {
  private int radius;
  private int height;
  
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public double totalSurfaceArea(){
        return ((2*3.14*radius*radius)+(radius*height*2*3.14));
    }
    public double volume(){
        return (Math.PI*radius*radius*height);
        //for wanting exact value of the pi we must use Math.PI
    }
}