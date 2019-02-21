package ru.ponomaryov.se;

public class MyArrayDataException extends Exception {
    int x;
    int y;

    public MyArrayDataException(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
