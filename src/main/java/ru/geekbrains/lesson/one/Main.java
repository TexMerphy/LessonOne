package ru.geekbrains.lesson.one;

public class Main {

    public static void main(String[] args) {
        //region Задание № 2
    byte a = 100;
    short b = 10000;
    int c = 1000000;
    long d = 1000000000L;
    float e = 9.8f;
    double f = 9.8;
    char g = '$';
    boolean h = true;
        //endregion
        System.out.println("Ответ задания № 3: " + doThirdQuestion(3.14f, 15.8f, 67.3f, 24.5f));
        System.out.println("Ответ задания № 4: " + doFourthQuestion(7, 9));
        doFifthQuestion(-3);
        System.out.println("Ответ задания № 6: " + doSixthQuestion(6));
        doSeventhQuestion("Мастер");
        checkLongYear(2021);
    } //Задание № 1
    //region Задание № 3
    public static float doThirdQuestion(float a, float b, float c, float d){
//        a = 4;
//        b = 5;
//        c = 10;
//        d = 8;
        return a * (b + (c / d));
    }
    //endregion
    //region Задание № 4
    public static boolean doFourthQuestion (int a, int b){
        int c = a + b;
        if (c >= 10 && c <= 20) {
            return true;
        }
        return false;
    }
    //endregion
    //region Задание № 5
    public static void doFifthQuestion (int a){
        if (a >= 0){
           System.out.println("Ответ задания № 5: " + a + " положительное число");
        }
        if (a < 0){
           System.out.println("Ответ задания № 5: " + a + " отрицательное число");
        }
    }
    //endregion
    //region Задание № 6
    public static boolean doSixthQuestion (int a){
        if (a > 0){
            return (a > 0);
        }
        else {
            return false;
        }
    }
    //endregion
    //region Задание № 7
    public static void doSeventhQuestion (String a){
        System.out.println("Ответ задания № 7: "+ "Привет, " + a +"!");
    }
    //endregion
    //region Задание № 8
    public static void checkLongYear (int a){
        if ((a % 4) != 0 || (a % 100) != 0 && (a % 400) != 0) {
            System.out.println("Ответ задания № 8: " + a + " Високосный год");
        }
        else {
            System.out.println("Ответ задания № 8: " + a + " Невисокосный год");
    }
    }
    //endregion
}


