import java.util.Scanner;

public class NumberHuman {
    private int[] number = new int[4];
    public int[] GetX(){
        return number;
    }
    public void CreateNumberHuman(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите четырех-значное число по порядку: ");

        for (int i=0; i<number.length; i++) {
            System.out.print((i + 1) + " число: ");
            number[i] = scanner.nextInt();
        }

    }

}
