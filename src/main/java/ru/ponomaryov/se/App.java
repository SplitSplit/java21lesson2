package ru.ponomaryov.se;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        final String[][] sArray = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        try {
            System.out.println("Sum is: " + sumArray(sArray));
        } catch (MyArraySizeException e) {
            System.out.println("Wrong array size");
        }
        catch (MyArrayDataException e) {
            System.out.println("Wrong data format in cell [" + e.x + "][" + e.y + "]");
        }
        finally {
            System.out.println("Process correct finished");
        }
    }

    private static int sumArray(String[][] vString) throws MyArrayDataException, MyArraySizeException {
        int a = 0;
        if (vString.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < 4; i++) {
            if (vString[i].length != 4) {
                throw new MyArraySizeException();
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    a += Integer.parseInt(vString[i][j].trim());
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return a;
    }
}
