package Practice.Methods;

import java.util.Scanner;

/*
1. Member Variables (Class Level Scope)
     -> variables that are declared inside the class
   ->  these variables can be anywhere in class , but outside methods
     public class Main{
     int sore;
     private Strong playername;
     void showscore(){.....}
     int getscore(){.....}
     }

     2. Local Variables(method level scope)
     Variables declared inside a pair of curly braces {} have block-level scope.

      public class Main{
     void showscore(){
     int score;
     }

     }

     3. Loop variables(Block Scope)

     for(int score=0;score<100;score++){
     }



     // Formal Parameters

     4. class Main {
     static int diff(int p,int q)  // Formal Paremeters
{
return p-q;
}
public static void main (String[] args) {
int p=89;
int q=9;
System.out.println(diff(p,q));   // this is actual parameters
}
 */
public class Scope_of_variables {
    public static int add(int n1, int n2)
    {
        int ans = n1 + n2;
        return ans;
    }
    public static void main(String[] args) {
  // Pass by value
        int a, b, ans;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = sc.nextInt();
        System.out.print("Enter the second number: ");
        b = sc.nextInt();
        ans = add(a, b);
        System.out.println("The sum of two numbers a and b is: " + ans);
    }
}
