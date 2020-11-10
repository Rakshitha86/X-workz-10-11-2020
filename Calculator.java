class Calculator{
public static void add(){
int a=10;
int b=20;
int sum=0;
sum=a+b;
System.out.println("The sum of 2 numbers="+sum);
}
public static void substract(){
int a=80;
int b=40;
int d=a-b;
System.out.println("The sum of 2 numbers="+d);
}
public static void multiply(){
int a=20;
int b=40;
int m=a*b;
System.out.println("The sum of 2 numbers="+m);
}
public static void divide(){
int a=100;
int b=10;
int e=a/b;
System.out.println("The sum of 2 numbers="+e);
}
public static void main(String args[]){
Calculator.add();
Calculator.substract();
Calculator.multiply();
Calculator.divide();
}
}