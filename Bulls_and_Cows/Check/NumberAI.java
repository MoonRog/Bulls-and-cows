import java.util.Random;

public class NumberAI {
    Random rand = new Random();
    private int[] mystery = new int[4];
    public int[] GetX(){
        return mystery;
    }
    public void Create(){
        for (int i=0;i<mystery.length;i++)
            mystery[i]=rand.nextInt(0,10);
    }
}
