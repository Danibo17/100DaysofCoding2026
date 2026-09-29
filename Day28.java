public class Main {
     public static void main(String[] args) {
         int a = 5;
         int b = a++;    // postfix
         int c = ++a;    // prefix increment
         int d = --c;    // prefix decrement
         int e = d++;    // postfix increment
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);
         System.out.println(d);
         System.out.println(e);
     }
 }
