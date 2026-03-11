import package vol;
public class CylinderPackage{
double radius, height;
public CylinderPackage(double radius, double height){
this.radius = radius;
this.height = height;
}
public double volume(){
return Math.PI*radius*radius*height;
}
}
import vol.CylinderPackage;
public class VolumePackageDemo{
public static void main(String[] args){
CylinderPackage cp = new CylinderPackage(10, 1);
double volume = cp.volume();
System.out.print("Volume: "+volume); }}


