package ru.ponomaryov.se;

public class FormulaCalculator {
    private int a;
    private int b;

    public FormulaCalculator(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public void calculate() throws CustomException
    {

        if (a % 2 != 0)
        {
            throw new CustomException("Vanya");
        }

        System.out.println("ALL OK");
    }
}
