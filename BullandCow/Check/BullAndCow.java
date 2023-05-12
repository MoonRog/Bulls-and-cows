public class BullAndCow {
    private int bull = 0;
    private int cow = 0;
    public  int  getBull(){
        return bull;
    }
    public  int getCow(){
        return cow;
    }
    public void count(int[] mystery, int[] number ) {

        for (int i = 0; i < mystery.length; i++) {
            if (number[i] == mystery[i])
                bull++;

            else
                for (int g = 0; g < mystery.length; g++)
                    if (mystery[i] == number[g]) {
                        cow++;
                        break;
                    }
        }
    }
    public void answer(){
        if (bull == 1 && cow == 1){
            System.out.println(bull + " Бык " + cow + " Корова");
        } else if (bull == 0 && cow == 0) {
            System.out.println(bull + " Быков " + cow + " Коров");
        } else if (bull == 1 && cow == 0) {
            System.out.println(bull + " Бык " + cow + " Коров");
        } else if (bull == 0 && cow == 1) {
            System.out.println(bull + " Быков " + cow + " Корова");
        } else if (bull == 0) {
            System.out.println(bull + " Быков " + cow + " Коровы");
        } else if (cow == 0) {
            System.out.println(bull + " Быка " + cow + " Коров");
        } else if (bull == 1) {
            System.out.println(bull + " Бык " + cow + " Коровы");
        } else if (cow == 1) {
            System.out.println(bull + " Быка " + cow + " Корова");
        } else {
            System.out.println(bull + " Быка " + cow + " Коровы");
        }
    }
}
