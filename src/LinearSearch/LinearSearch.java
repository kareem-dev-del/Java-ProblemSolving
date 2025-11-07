package LinearSearch;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 🔹 مصفوفة فيها مجموعة أرقام ثابتة
        int[] numbers = {5, 8, 4, 3, 0, 7, 9, 1, 2, 20, 22, 13};

        // 🔹 المستخدم بيدخل الرقم اللي عايز يدور عليه
        System.out.print("Enter the target number: ");
        int target = input.nextInt();

        // 🔹 البحث الخطي (Linear Search)
        // نمر على كل عنصر في المصفوفة ونقارن بالقيمة المطلوبة
        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                System.out.println("✅ Number " + target + " found at index: " + i);
                input.close();
                return; // نوقف البرنامج بعد ما نلاقي الرقم
            }
        }

        // 🔹 لو مفيش تطابق
        System.out.println("❌ Number " + target + " not found in the array.");

        input.close();
    }
}

/*
📘 البرنامج: Linear Search in Java
🔍 الفكرة:
    - عندنا مصفوفة أرقام.
    - المستخدم يدخل رقم.
    - نمر على كل عنصر في المصفوفة:
        • لو لقيناه → نطبع مكانه (index).
        • لو مش لقيناه → نطبع "Not Found".
🎯 الهدف: فهم طريقة البحث الخطي خطوة بخطوة.
*/
