class Calculator3{
public static int add(){
int a=10;
int b=20;
int sum=0;
sum=a+b;
return sum;
}
public static int substract(){
int a=40;
int b=20;
int d=a-b;
return d;
}
public static int multiply(){
int a=10;
int b=40;
int m=a*b;
return m;
}
public static int divide(){
int a=40;
int b=10;
int e=a/b;
return e;
}
public static void main(String args[]){
int sum=Calculator3.add();
int d=Calculator3.substract();
int m=Calculator3.multiply();
int e=Calculator3.divide();
System.out.println("The sum of 2 numbers="+sum);
System.out.println("The sum of 2 numbers="+d);
System.out.println("The sum of 2 numbers="+m);
System.out.println("The sum of 2 numbers="+e);
}
}
