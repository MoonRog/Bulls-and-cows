import java.util.Random;

public class NumberAI {
    private Random rand = new Random();
    private int[] mystery = new int[4];
    public int[] getX(){
        return mystery;
    }
    public void create(){
        for (int i = 0; i<mystery.length;){

            boolean alreadyHas;
            int newRandomNumber = rand.nextInt(0,10);
            alreadyHas = false;

            for (int j = 0; j < i; j++) {
                if (mystery[j] == newRandomNumber){
                    alreadyHas = true;
                    break;
                }
            }
            if (!alreadyHas){
                mystery[i] = newRandomNumber;
                i++;
            }
        }
    }
}
