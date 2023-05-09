public class BullAndCrow {
    private int bull = 0;
    private int ram = 0;
    public  int  GetBull(){
        return bull;
    }
    public  int GetRam(){
        return ram;
    }
    public void Count(int[] mystery, int[] number ) {

        for (int i = 0; i < mystery.length; i++) {
            if (number[i] == mystery[i])
                bull++;

            else
                for (int g = 0; g < mystery.length; g++)
                    if (mystery[i] == number[g]) {
                        ram++;
                        break;
                    }
        }
    }
    public void Print(){
        System.out.println("Быки: "+bull+" Коровы: "+ram);
    }
}
