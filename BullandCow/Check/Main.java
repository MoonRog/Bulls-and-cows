import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {

        boolean revise = true;
        int game = 1;
        int attempt = 0;
        int end = 0;

        DateFormat dateFormat = new SimpleDateFormat(" dd.MM.yyyy HH:mm");
        String date = dateFormat.format(new Date());

        Scanner scanner = new Scanner(System.in);
        FileWriter writer = new FileWriter("Game.txt", true);

        Scanner scan = new Scanner(new File("Game.txt"));
        Pattern pattern = Pattern.compile("\\d");

        while (scan.hasNextLine()){
            String line = scan.nextLine();
            if (line.length() == 48){
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()){
                    game = Integer.parseInt(matcher.group());
                    game++;
                    break;
                }
            }
        }
        scan.close();

        Spelling spelling = new Spelling();
        NumberAI numberAI = new NumberAI();
        NumberHuman numberHuman = new NumberHuman();

        System.out.println("Игра: Быки и Коровы! \n");


        while (end!=3){

            BullAndCow bullAndCrow = new BullAndCow();

            if (revise)
                numberAI.create();

            numberHuman.createNumberHuman();
            bullAndCrow.count(numberAI.getX(),numberHuman.getX());
            bullAndCrow.answer();

            if (revise){
                writer.write("Game № " + game + date +" Загаданная строка ");
                for (int i=0;i<numberAI.getX().length;i++)
                    writer.write(Integer.toString(numberAI.getX()[i]));

                writer.write("\n");
                writer.write("\tЗапрос: ");
                for (int i=0; i<numberHuman.getX().length;i++)
                    writer.write(Integer.toString(numberHuman.getX()[i]));

                writer.write(spelling.answer(bullAndCrow.getBull(), bullAndCrow.getCow()));
                game++;
                attempt++;
                revise = false;
            }
            else if (!revise) {
                writer.write("\tЗапрос: ");
                for (int i=0; i<numberHuman.getX().length;i++)
                    writer.write(Integer.toString(numberHuman.getX()[i]));

                writer.write(spelling.answer(bullAndCrow.getBull(), bullAndCrow.getCow()));
                attempt++;
            }

            if (bullAndCrow.getBull() == 4) {
                writer.write(spelling.attempt(attempt));

                revise = true;
                attempt = 0;
            }
            System.out.print("Введите 3 что-бы закончить игру, или любое другое число, что-бы продолжить: ");
            end = scanner.nextInt();
        }
        writer.close();
    }
}