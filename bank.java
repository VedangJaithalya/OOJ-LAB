import java.util.*;
class Account{
String name;
int acc_no;
double balance;
void get_info(){
System.out.println("Enter name\n");
Scanner sc=new Scanner(System.in);
name=sc.next();
System.out.println("Enter Account number\n");
acc_no=sc.nextInt();
System.out.println("Enter balance\n");
balance=sc.nextDouble();
if(balance<5000.0){
System.out.println("Balance should be greater than 5000\n");
}
}
void deposit(){
System.out.println("Enter the amount to be deposited");
Scanner vb=new Scanner(System.in);
double add=vb.nextDouble();
balance=balance+add;
}
void display(){
System.out.println("Name "+name);
System.out.println("Account Number  "+acc_no);
System.out.println("Updated Balance=  "+balance);
}
void withdrawal(){
System.out.println("Enter the amount to be withdrawed");
Scanner va=new Scanner(System.in);
double amt=va.nextDouble();
balance=balance-amt;
}
}
class Curr_acct extends Account{
double min=5000.0;
double pen=500.0;
void check(){
if(balance<=min){
System.out.println("Low Balance");
balance=balance-pen;
}
}
}
class Sav_acct extends Account{
public void interest(){
balance=balance+(5*balance/100);
System.out.println("Updated Balance="+balance);
}
}
class bank{
public static void main(String args[]){
System.out.println("1.CURRENT ACCOUNT\t2.SAVINGS ACCOUNT\t3.EXIT\n");
System.out.println("Enter your choice");
Scanner sp=new Scanner(System.in);
Curr_acct c1=new Curr_acct();
Sav_acct s1=new Sav_acct();
boolean a=true;
System.out.println("Press c for current account\n");
System.out.println("Press s for savings account\n");
String l=sp.next();
if(l.equalsIgnoreCase("c")){
c1.get_info();
c1.check();
while(a){
System.out.println("1.DISPALY\t2.DEPOSIT\t3.WITHDRAW\t4.EXIT\n");
System.out.println("Enter your choice");
int choi=sp.nextInt();
switch(choi){
case 1:c1.display();
break;
case 2:c1.deposit();
break;
case 3:c1.withdrawal();
break;
case 4:System.exit(0);
break;
default:System.out.println("Invalid Choice");
}}}
else if(l.equalsIgnoreCase("s")){
s1.get_info();
while(a){
System.out.println("1.DISPLAY\t2.DEPOSIT\t3.WITHDRAW\t4.INTEREST\t5.EXIT\n");
System.out.println("Enter your choice");
int cho=sp.nextInt();
switch(cho){
case 1:s1.display();
break;
case 2:s1.deposit();
break;
case 3:s1.withdrawal();
break;
case 4:s1.interest();
break;
case 5:System.exit(0);
break;
default:System.out.println("Invalid choice\n");
}}}
else{
System.out.println("Invalid character");
}
}}
