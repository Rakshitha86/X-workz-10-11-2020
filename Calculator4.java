class Calculator4{
public static int add(int a,int b){
int sum=0;
sum=a+b;
return sum;
}
public static int substract(int a,int b){
int d=a-b;
return d;
}
public static int multiply(int a,int b){
int m=a*b;
return m;
}
public static int divide(int a,int b){
int e=a/b;
return e;
}
public static void main(String args[]){
int sum=Calculator4.add(10,20);
int d=Calculator4.substract(40,20);
int m=Calculator4.multiply(60,40);
int e=Calculator4.divide(80,20);
System.out.println("The sum of 2 numbers="+sum);
System.out.println("The sum of 2 numbers="+d);
System.out.println("The sum of 2 numbers="+m);
System.out.println("The sum of 2 numbers="+e);
}
}