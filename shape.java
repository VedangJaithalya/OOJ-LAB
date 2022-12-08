import java.util.*;
abstract class abc
{
double a,b;
abc(double i,double j)
{
a=i;
b=j;
}
abstract double area();
}
class rec extends abc
{
rec(double i,double j)
{
super(i,j);
}
double area()
{
return (a*b);
}}
class tri extends abc
{
tri(double i,double j)
{
super(i,j);
}
double area()
{
return (0.5*a*b);
}}
class cir extends abc
{
cir(double i,double j)
{
super(i,j);
}
double area()
{
return (3.14*a*a);
}}
class shape
{
public static void main(String args[])
{
rec r1=new rec(2,5);
tri t1=new tri(1,7);
cir c1=new cir(4,4);
abc a;
a=r1;
double area1=a.area();
a=t1;
double area2=a.area();
a=c1;
double area3=a.area();
System.out.println("Area Of Rectengle Is: "+area1);
System.out.println("Area Of Triangle Is: "+area2);
System.out.println("Area Of Circle Is: "+area3);
}}