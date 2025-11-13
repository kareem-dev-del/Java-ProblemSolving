/*
 * البرنامج: ترتيب الأعداد باستخدام خوارزمية الفقاعات (Bubble Sort)
 * الوصف: يقوم هذا البرنامج بترتيب مصفوفة من الأعداد تصاعديًا
 *       عن طريق مقارنة كل عنصر بالعنصر الذي يليه وتبديلهما إذا كان الترتيب غير صحيح.
 * اللغة: Java
 * الكاتب: كريم***
 */


package BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] ages) {
      int [] array ={1,8,6,4,3,7,0};
        System.out.printf(Arrays.toString(Bubble(array)));

    }

    static int[] Bubble(int []arr) {
        int temp;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


        return arr;
    }
}
