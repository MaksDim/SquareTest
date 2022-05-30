package ru.netology.sqr;
public class SQRService {

    public int calculateEnumerationOfNumbers(int number) {
        for (int i = 10; i <= 99; i++) {
            for (int j = 200; j <= 300; j++) {
                if (i * i == j) {
                    return i;

                }
            }
        }
        return 0;
    }
}