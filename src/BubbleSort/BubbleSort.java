package BubbleSort;

public class BubbleSort {
    public static void main(String[] ages) {
        // استدعاء الدالة التي تنفذ خوارزمية الفرز الفقاعي
        Bubbl();
    }

    static void Bubbl() {
        int temp; // متغير مؤقت لتبديل القيم أثناء الفرز
        int[] numbers = {5, 7, 2, 3, 9, 10, 20, 0}; // مصفوفة الأرقام التي سيتم فرزها

        // الحلقة الأولى للتحكم بعدد التكرارات اللازمة لفرز كل العناصر
        for (int i = 0; i < numbers.length; i++) { // تم تعديل i < numbers.length + i الى i < numbers.length
            // الحلقة الثانية لمقارنة العناصر المجاورة وتبديلها إذا كانت غير مرتبة
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) { // إذا العنصر الحالي أكبر من التالي
                    // تبديل العناصر
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // طباعة المصفوفة بعد الفرز
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
