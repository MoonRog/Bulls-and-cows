
public class Spelling {

    public String answer(int bull,int cow){
        if (bull == 1 && cow == 1){
            return " Ответ: " + bull + " Бык " + cow + " Корова\n";
        } else if (bull == 0 && cow == 0) {
            return " Ответ: " + bull + " Быков " + cow + " Коров\n";
        } else if (bull == 1 && cow == 0) {
            return " Ответ: " + bull + " Бык " + cow + " Коров\n";
        } else if (bull == 0 && cow == 1) {
            return " Ответ: " + bull + " Быков " + cow + " Корова\n";
        } else if (bull == 0) {
            return " Ответ: " + bull + " Быков " + cow + " Коровы\n";
        } else if (cow == 0) {
            return " Ответ: " + bull + " Быка " + cow + " Коров\n";
        } else if (bull == 1) {
            return " Ответ: " + bull + " Бык " + cow + " Коровы\n";
        } else if (cow == 1) {
            return  " Ответ: " + bull + " Быка " + cow + " Корова\n";
        } else {
            return " Ответ: " + bull + " Быка " + cow + " Коровы\n";
        }
    }
    public String attempt(int attempt){
        if (attempt == 1){
            return "\tСтрока была угадана за " + attempt + " попытку. \n";
        }
        else if (attempt>5){
            return "\tСтрока была угадана за " + attempt + " попыток. \n";
        }
        else {
            return "\tСтрока была угадана за " + attempt + " попытки. \n";
        }
    }
}
