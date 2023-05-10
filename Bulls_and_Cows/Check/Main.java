import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;



public class Main {
    public static void main(String[] args) throws IOException {
        //TODO что такое a? Дай более понятное название
        boolean a = true;
        int game = 1;
        int attempt = 0;
        int end = 0;

        DateFormat dateFormat = new SimpleDateFormat(" dd.MM.yyyy HH:mm");
        String date = dateFormat.format(new Date());

        FileWriter pw = new FileWriter("Game.txt", true);

        Scanner scanner = new Scanner(System.in);

        NumberAI numberAI = new NumberAI();
        NumberHuman numberHuman = new NumberHuman();

        while (end!=3){

            BullAndCrow bullAndCrow = new BullAndCrow();

            if (a)
                numberAI.Create();

            numberHuman.CreateNumberHuman();
            bullAndCrow.Count(numberAI.GetX(),numberHuman.GetX());
            bullAndCrow.Print();

            if (a){
                pw.write("Game № " + game + date +" Загаданная строка ");
                for (int i=0;i<numberAI.GetX().length;i++)
                    pw.write(Integer.toString(numberAI.GetX()[i]));

                pw.write("\n");
                pw.write("\tЗапрос: ");
                for (int i=0; i<numberHuman.GetX().length;i++)
                    pw.write(Integer.toString(numberHuman.GetX()[i]));

                pw.write(" Ответ: " + bullAndCrow.GetBull() + " Быки " + bullAndCrow.GetRam() + " Коровы \n");
                game++;
                attempt++;
                a = false;
            }
            else if (!a) {
                pw.write("\tЗапрос: ");
                for (int i=0; i<numberHuman.GetX().length;i++)
                    pw.write(Integer.toString(numberHuman.GetX()[i]));

                pw.write(" Ответ: " + bullAndCrow.GetBull() + " Быки " + bullAndCrow.GetRam() + " Коровы \n");
                attempt++;
            }

            if (bullAndCrow.GetBull() == 4) {
                if (attempt == 1){
                    pw.write("\tСтрока была угадана за " + attempt + " попытку. \n");
                }
                else if (attempt>5){
                    pw.write("\tСтрока была угадана за " + attempt + " попыток. \n");
                }
                else {
                    pw.write("\tСтрока была угадана за " + attempt + " попытки. \n");
                }
                a = true;
                attempt = 0;
            }
            System.out.print("Введите 3 что-бы закончить игру, или любое другое число, что-бы продолжить: ");
            end = scanner.nextInt();
        }
        pw.close();
    }
}

//TODO 1) При записи в файл нумерация игр должна продолжаться