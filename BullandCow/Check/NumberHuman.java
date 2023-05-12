import java.util.Arrays;
import java.util.Scanner;

public class NumberHuman {
    private int[] number = new int[4];
    public int[] getX(){
        return number;
    }
    public void createNumberHuman(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите четырех-значное число: ");
        String str = scanner.next();

        for (int i=0; i<number.length; i++) {
            number[i] = Character.getNumericValue(str.charAt(i));
        }
    }

}
