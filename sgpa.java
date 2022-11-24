import java.util.*;
class student
{
String name;
String usn;
int marks[]=new int[5];
int credits[]=new int[5];
void input()
{
System.out.println("\nenter the name of the student");
System.out.println("\nenter the usn of the student");
Scanner sc=new Scanner(System.in);
name=sc.nextLine();
usn=sc.nextLine();
System.out.println("\nenter the marks and credits of the stuents");
for(int i=0;i<5;i++)
{
marks[i]=sc.nextInt();
credits[i]=sc.nextInt();
}}
void output()
{
System.out.println("name :"+" "+name+"\nUSN :"+" "+usn);
for(int i=0;i<5;i++)
{
System.out.println("marks of subject"+" "+(i+1)+" ="+marks[i]);
System.out.println("credits of subject"+" "+(i+1)+" ="+credits[i]);
}}
void cgpa()
{
float s_gpa=0;
int sum=0;
int credit[]=new int[5];
for(int i=0;i<5;i++)
{
if(marks[i]>=90)
{
credit[i]=10;
}
else if(marks[i]>=80)
{
credit[i]=9;
}
else if(marks[i]>=70)
{
credit[i]=8;
}
else if(marks[i]>=60)
{
credit[i]=7;
}
else if(marks[i]>=50)
{
credit[i]=6;
}
else if(marks[i]>=35)
{
credit[i]=5;
}
else if(marks[i]<35)
{
credit[i]=0;
}
else
{
System.out.println("invalid input");
}

s_gpa+=(credit[i]*credits[i]);
sum=sum+credits[i];
}
float res =s_gpa/sum;
System.out.println("SGPA="+" "+res);
}}
class sgpa
{
public static void main(String args[]){
student vj=new student();
vj.input();
vj.output();
vj.cgpa();
}}