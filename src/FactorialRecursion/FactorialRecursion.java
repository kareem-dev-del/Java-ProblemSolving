/*
 * البرنامج: حساب العامل (Factorial) باستخدام الاستدعاء الذاتي (Recursion)
 * الوصف: يقوم هذا البرنامج بحساب العامل (Factorial) لعدد يُدخله المستخدم
 *       عن طريق دالة تستدعي نفسها Recursively.
 * اللغة: Java
 * الكاتب: كريم
 */

package FactorialRecursion;
import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Enter number ");
     int num =input.nextInt();
       System.out.println("Factoria: "+ num + " is " +Factorial(num));

    }
    static  int Factorial( int number){
        if (number < 1) return 1;
        else return number * Factorial(number - 1);
    }
}
