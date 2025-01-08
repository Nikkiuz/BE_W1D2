package exercise_1;

public class ex_1 {
    public static boolean stringaPariDispari(String input){
        if (input.length() % 2 == 0){
            return true;
        } else{
            return false;
        }
    };

    public static boolean annoBisestile(int year){
        if (year % 4 == 0){
            return true;
        } else if (year %100 == 0 && year %400 == 0){
            return true;
        }
        else{
            return false;
        }
    }
};


