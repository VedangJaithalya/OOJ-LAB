import java.util.*;
class book
{
String name;
String author;
int price;
int num_pages;
void set()
{
System.out.println("Enter the name of the book");
Scanner sc=new Scanner(System.in);
name=sc.nextLine();
System.out.println("Enter the name of the author");
author=sc.nextLine();
System.out.println("Enter the price of the book");
price=sc.nextInt();
System.out.println("Enter the number of pages in the book");
num_pages=sc.nextInt();
}
public String toString()
{
return("NAME OF THE BOOK : "+name+"\n"+"AUTHOR : "+author+"\n"+"PRICE : "+price+"\n"+"NUMBER OF PAGES : "+num_pages);
}}
class supply
{
public static void main(String args[])
{
int n;
System.out.println("ENTER THE NUMBER OF BOOKS");
Scanner ac=new Scanner(System.in);
n=ac.nextInt();
book b1[]=new book[n];
for(int i=0;i<n;i++)
{
b1[i]=new book();
b1[i].set();
}
for(int i=0;i<n;i++){
System.out.println("DETAILS OF BOOK "+(i+1));
System.out.println(b1[i]);
}}}