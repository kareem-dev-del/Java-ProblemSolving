/*
 * البرنامج: التحقق من الـ Palindrome
 * الوصف: يقوم هذا البرنامج بقراءة كلمة أو جملة من المستخدم،
 *       ثم يتحقق إذا كانت الكلمة أو الجملة تقرأ نفسها من الأمام إلى الخلف (Palindrome) أم لا.
 *       البرنامج يتجاهل المسافات والحروف الكبيرة أثناء المقارنة.
 * اللغة: Java
 * الكاتب: كريم
 */




package Palindrome;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word or sentence: ");
        String Word = input.nextLine();

        String cleanInput = Word.replaceAll("\\s+", "").toLowerCase();

        if (Palindromee(cleanInput)) {
            System.out.println("The word is a Palindrome ");
        } else {
            System.out.println("The word is not a Palindrome ");
        }
    }

    static boolean Palindromee(String word) {
        char[] letter = word.toCharArray();
        int start = 0;
        int end = letter.length - 1;

        while (start < end) {
            if (letter[start] != letter[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
