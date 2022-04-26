class Simple
{
 double area;
 Simple(float l,float b)
 { 
  area=l*b;
  System.out.println("the area of rectangle:-"+area);
 }
 Simple(float r)
 {
  area=3.14f*r*r;
  System.out.println("the area of circle:-"+area);
 }
 Simple(double b,double h)
 {
  area=0.5*b*h;
  System.out.println("the area of traingle:-"+area);
 }
}
class Constructor
{
 public static void main(String args[])
 {
  Simple k=new Simple(2.1f,3.2f);
  Simple m=new Simple(2.3,3.2);
  Simple p=new Simple(2.3f);
 }
}