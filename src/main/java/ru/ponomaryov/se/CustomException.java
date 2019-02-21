package ru.ponomaryov.se;

public class CustomException extends Exception {
    private String field;

    public CustomException(String field)
    {
        this.field = field;
    }

    public CustomException()
    {
    }

    public void sendInfo()
    {

    }
}
