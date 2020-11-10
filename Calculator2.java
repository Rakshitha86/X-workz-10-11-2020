class Calculator2{
public static void add(int a,int b){
int sum=0;
sum=a+b;
System.out.println("The sum of 2 numbers="+sum);
}
public static void substract(int a,int b){
int d=a-b;
System.out.println("The sum of 2 numbers="+d);
}
public static void multiply(int a,int b){
int m=a*b;
System.out.println("The sum of 2 numbers="+m);
}
public static void divide(int a,int b){
int e=a/b;
System.out.println("The sum of 2 numbers="+e);
}
public static void main(String args[]){
Calculator2.add(10,20);
Calculator2.substract(40,20);
Calculator2.multiply(60,40);
Calculator2.divide(80,20);
}
}