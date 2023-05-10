import java.util.Random;

//TODO названия методов с маленькой буквы
public class NumberAI {
    //TODO модификатор доступа добавь
    Random rand = new Random();
    private int[] mystery = new int[4];

    public int[] GetX() {
        return mystery;
    }

    //TODO в загаданной строке символы не должны повторяться
    public void Create() {
        for (int i = 0; i < mystery.length; i++)
            mystery[i] = rand.nextInt(0, 10);
    }
}
