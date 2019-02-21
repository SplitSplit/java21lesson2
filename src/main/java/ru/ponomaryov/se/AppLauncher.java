package ru.ponomaryov.se;

public class AppLauncher {
    public static void main(String[] args)
    {
        try
        {
            FormulaCalculator formulaCalculator = new FormulaCalculator(3, 0);
            formulaCalculator.calculate();
        }
        catch (CustomException e)
        {
            e.sendInfo();
            System.out.println("В блоке null pointer");
            e.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Обязательно выполнятся");
        }
    }
}
