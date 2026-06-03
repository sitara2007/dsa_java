// package com.pishu;
// // import java.util.Scanner;
// // public class Main {
// //     public static void main(String[] args) {
// //         Scanner input = new Scanner(System.in);
// //         System.out.println("enter the something");
// //         int roll=input.nextInt();
// //         System.out.println("roll is: " + roll);
// //         input.close();
// //       //  int roll=20;//4 bytes of memory
// //       //  char grade='a';//2 bytes of memory
// //       //  float marks=55.77f;//4 bytes of memory
// //       //  double large_decimals_num=12986595863.456;//8 bytes of memory
// //       //  long large_num=57464;//8 bytes of memory
// //       //  boolean check=false;//1 byte of memory
// //       //  System.out.println("Roll: " + roll);
// //       //  System.out.println("Grade: " + grade);ṇ
// //       //   System.out.println("Marks: " + marks);
// //       //  System.out.println("Large Decimal: " + large_decimals_num);
// //     //    System.out.println("Large Number: " + large_num);
// //       //  System.out.println("Check: " + check);
// //       //primitive data type 
      
// //     }
// // }
// // public class Main{
// //     public static void main(String[] args){
// //         // boolean isjava=true;
// //         // boolean ispy=false;//stores true or false
// //         // System.out.println("output-->"+isjava);
// //         // System.out.println("output-->"+ispy);
// //         //  byte age=25;//small int into large memory space
// //         //  byte temp=20;
// //         //  System.out.println("agee??"+age);
// //         //  System.out.println("temp-->"+temp);
// //         //  short a=100;//moderTE VALUES IN small memory space 
// //         //  System.out.println("a-->"+a);
// //         //  long b=10;//used for large values in memory large space
// //         //  System.out.println("b-->"+b);
// //         //  float x=10.0f;
// //         //  System.out.println("x-->"+x);
// //         //  double y=100.8358934758957;
// //         //  System.out.println(y);//uses to store large decimals value into memory space
// //          //non primitive data type
// //          String name="pishu";
// //          System.out.println("name-->"+name);//safe thread
// //          System.out.println(name.length());
// //          System.out.println(name.toUpperCase());
// //          System.out.println(name.toLowerCase());
// //          System.out.println(name.substring(2));
// //          System.out.println(name.contains("pi"));
// //          System.out.println(name.equals("pishu"));
// //          System.out.println(name.equals("Pishu"));
// //          System.out.println(name.equalsIgnoreCase("Pishu"));
// //          System.out.println(name.charAt(2));
// //          System.out.println(name.indexOf("s"));
// //          System.out.println(name.lastIndexOf("s"));
// //          System.out.println(name.replace("pi","pii"));
// //          System.out.println(name.replace("pi","pii").toUpperCase());
// //          System.out.println(name.replace("pi","pii").toUpperCase().substring(2));
// //          String str1=new String("hello");
// //          char[] ch={'a','b','c'};
// //          String str2=new String(ch);
// //          System.out.println(str1);
// //          System.out.println(str2);
// //          byte[] bytes={34,56,65};
// //          String strr=new String(bytes);
// //          System.out.println(strr);
// //          //class
         




// //     }
// // }
// class Car{
//     String model;
//     int year;
//     Car(String model,int year){
//         this.model=model;
//         this.year=year;

//     }
//     void display(){
//         System.out.println(model+year);

//     }

// }
// public class Geeks{
//     public static void main(String[] args){
//         Car mycar=new Car("toyota",2020);
//         mycar.display();
//     }
// }
//if-else statement
// package com.pishu;
// public class Geeks{
//     public static void main(String[] args){}
//         int salary=500;
//         if (salary>200){
//             salary+=100;
//         }else{
//             salary+=200;
//         }
//         System.out.println(" the increment salary of employee" + salary);
//     }
// }
//multiple if-else statement
// package com.pishu;
// public class Geeks{
//     public static void main(String[] args){
//         int salary=5000;
//         if (salary>10000){
//             salary+=1000;
//         }else if(salary>5000){
//             salary+=500;
//         }else {
//             salary+=200;
//         }
//         System.out.println("Incremented salary: " + salary);
//     }
// }
// package com.pishu;

// // import java.util.Scanner;

// public class Geeks{//print num from 1 to n
//     public static void main(String[] args){
        // // for (int i=1;i<=5;i+=1){
        // //     System.out.println("Hello, World! " + i);
        // // }
        // Scanner num=new Scanner(System.in);
        // System.out.println("Enter a number: ");
        // int n=num.nextInt();
        // for (int i=1;i<=n;i++){
        //     System.out.println(i);
        // }
//         //while loops
//         int num=1;
//         while (num<=5){
//             System.out.println(num);
//             num+=1;
//         }
//     }
// }

//do while condition

//         int n=1;
//         do{
//             System.out.println(n);
//             n++;
//         }while(n<=5);  
//     }
// }
    
        //find the largest number 
//         if (a>b && a>c){
//             System.out.println("largest number is: " + a);
//         }else if(b>a && b>c){
//             System.out.println("largest number is: " + b);
//         }else{
//             System.out.println("largest number is: " + c);
//         }

//     }
// }
// package com.pishu;
// import java.util.Scanner;
// public class Geeks{
//     public static void main(String[] args){
//         Scanner num=new Scanner(System.in);
//         int c =num.nextInt();
//         int max=Math.max(c,Math.max(2, 3));
//         System.out.println(max);
//     }
// }

//         System.out.println("enter the number: ");
//         int a=num.nextInt();
//         int b=num.nextInt();
//         int c=num.nextInt();
//         int max=0;
//         if (max>a){
//             max=a;
//             System.out.println("largest number is: " + max);
//         }
//         else if (max>b) {
//             max=b;
//             System.out.println("largest number is: " + max);
//         }
//         else{
//             max=c;
//             System.out.println("largest number is: " + max);
//         }
    
//     }
// }
// package com.pishu;//index of character
// import java.util.Scanner;
// public class Geeks{
//     public static void main(String[] args){
//         Scanner ch=new Scanner(System.in);
//         char c=ch.next().trim().charAt(0);
//         System.out.println(c);
//     }
// another method
// package com.pishu;
// // import java.util.Scanner;
// public class Geeks{
//         public static void main(String[] args){
// //
//                 System.out.println("enter the character");
// //      char c=ch.next().trim().charAt(2);
//                 String st=" hello";     
//                 System.out.println(st.charAt(2));
//         }
// }
// package com.pishu;//logical operations
// public class Geeks{
//         public static void main(String[] args){
//                 int a=10;
//                 int b=20;
//                 if (a==10 && b==20){//and operator
//                         System.out.println("i get");

//                 } else {
//                         System.out.println("i don't get this");
//                 }
//         }
// }
// package com.pishu;
// public class Geeks{
//         public static void main(String[] args){
//                  int a=10;
//                  int b=20;
//                  if (a==10||b==20){//or operator
//                          System.out.println("i get");

//                  } else {
//                          System.out.println("i don't get this");
//                  }

//         }
// }
//check lower and uppercase
// package com.pishu;
// import java.util.Scanner;
// public class Geeks{
//         public static void main(String[] args){
//                Scanner ch=new Scanner(System.in);
//                System.out.println("enter the character");
//                char c=ch.next().trim().charAt(0);
//                if (c>='a' && c<='z'){
//                        System.out.println("lower case");
//                } else if (c>='A' && c<='Z'){
//                           System.out.println("upper case");

//                }else{
//                        System.out.println("not an alphabet");
//                }
//         }
// }
// package com.pishu;//fibonacci series using for loop
// import java.util.Scanner;
// public class Geeks{
//         public static void main(String[] args){
//                 int a=0;
//                 int b=1;
//                 Scanner num=new Scanner(System.in);
//                 System.out.println("enter the number: "); 
//                 int n=num.nextInt();
//                 System.out.println(a);
//                 System.out.println(b);      
//                 for (int i=1;i<=n;i++){
//                         int c=a+b;
//                         System.out.println(c);
//                 a=b;
//                 b=c;
                
//                 }
//         }
// package com.pishu;
// public class Geeks{// fibonacci using while loop
//         public static void main(String[] args){
//                 Scanner num=new Scanner(System.in);
//                 System.out.println("enter the number: ");
//                 int n=num.nextInt();
//                 int a=0;
//                 int b=1;
//                 int c=2;
//                 System.out.println(a);
//                 System.out.println(b);
//                 while (c<=n){
//                         c=a+b;
//                         System.out.println(c);
//                         a=b;
//                         b=a;
//                         c++;
//                 }

//         }
// }
// frequency of a given numberin an array
// package com.pishu;
// import java.util.Scanner;
// public class Geeks{
//         public static void main(String[] args){
//                 Scanner num=new Scanner(System.in);
//                 int n=num.nextInt();
//                 int c=0;
//                 while (n>0){
//                         int rem=n%10;//to get the last digit of the number
//                         if(rem==2){
//                                 c++;

//                         }
//                         n=n/10;//to remove the last digit and update number for the next iteration
//                 }
//                 System.out.println(c);

//         }
// }

// package com.pishu;
// import java.util.Scanner;
// public class Geeks{
//         public static void main(String[] args){
//                 Scanner num=new Scanner(System.in);
//                 int n=num.nextInt();
//                 int c=0;
//                 while (n>0){
//                         int rev=n%10;
//                         c=c*10+rev;//to reverse the number
//                         n=n/10; //to remove the last digit and update number for the next iteration
//                 }
//                 System.out.println(c);
//         }
// }
//make a calculator using switch case
// package com.pishu;
// import java.util.Scanner;
// public class Geeks{
//         public static void main(String[] args){
//                 Scanner input=new Scanner(System.in);
//                 while (true){
//                         System.out.println("enter the operator: ");
//                         char ch=input.next().trim().charAt(0);
//                         if (ch=='+'|| ch=='-'||ch=='*'||ch=='/'||ch=='%'){
//                                 System.out.println("enter the first number: ");
//                                 int b=input.nextInt();
                                   
//                                 System.out.println("enter the second number: ");
//                                 int a=input.nextInt();
                             
//                                 if (ch=='+'){
//                                         System.out.println(a+b);
//                                 }else if (ch=='-'){
//                                         System.out.println(a-b);
//                                 }else if (ch=='*'){
//                                         System.out.println(a*b);
//                                 }else if (ch=='/'){
//                                         System.out.println(a/b);
//                                 }else if (ch=='%'){
//                                         System.out.println(a%b);
//                                 }
//                         }else if (ch=='x' || ch=='X'){
//                                 System.out.println("calculator is closed");
//                         }         else{
//                                 System.out.println("invalid operator");
//                         }
//                 }               
//         }
// }
//types of variables
package com.pishu;

public class Geeks {
    // 1. STATIC VARIABLE
    // Shared by the whole class, born when program starts.
    static int c = 30; 

    // 2. INSTANCE VARIABLE
    // Unique to each object, born when 'new Geeks()' is called.
    int b = 20; 

    public static void main(String[] args) {
        // 3. LOCAL VARIABLE
        // Only exists inside this main method.
        int a = 10; 
        
        System.out.println("Local Variable a: " + a);
        
        // Accessing Static Variable (No object needed)
        System.out.println("Static Variable c: " + c);

        // Accessing Instance Variable (Object IS needed)
        Geeks obj = new Geeks(); 
        System.out.println("Instance Variable b: " + obj.b);
        
        // Calling the display method
        obj.display();
    }

    void display() {
        // This method can see 'b' and 'c' directly because it is non-static
        System.out.println("Inside display method, Instance b is: " + b);
    }
}