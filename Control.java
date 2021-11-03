package org.itstep;

import java.util.ArrayList;

public class Control {
    //Вариант 1

    public static void main(String[] args) {
        System.out.println("Задание 1");
       one();
        System.out.println("Задание 2");
       two();
        System.out.println("Задание 3");
       three();
    }

    public static void one() {
        //Задача 1
        int[] array = {1, 3, 5, 0, 4, 9, 0, 7, 6};
        int sum = 0;
        for (int i = 3; i < 6; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }

    public static void two(){
        String s = "Дан символ и строка";
        String result = "";
        int i = 0;
        while (i < s.length()){
            char c = s.charAt(i);
            result = result + c + c;
            i++;
        }
        System.out.println(result);
    }

    public static void three() {
        int[][] array = {{6, 7, 6}, {1, 9, 8}, {3, 9, 1}};
        for (int i = 0; i < array.length; i++) {
        }
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) ;
            if (min > array[i][i]) {
                min = array[i][i];
            }
        }
        int max = array[0][0];
        {
            for (int i = 0; i < array.length; i++) {
                max = Math.max(max, array[i][i]);
            }
            System.out.println("max:"+max +" min:"+min);
        }
    }
}

