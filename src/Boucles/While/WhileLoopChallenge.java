package Boucles.While;

public class WhileLoopChallenge {
    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int countNumberPair = 0;
        int countNumberImpair = 0;

        while (number <= finishNumber) {
            number++;

            if (number % 2 != 0) {
                countNumberImpair++;
                continue;
            }

            if (isEvenNumber(number)) {
                System.out.println("Pair number: " + number);
            }
            countNumberPair++;
            if (countNumberPair >= 5) {
                break;
            }

        }
            System.out.println("Total pairs found: " + countNumberPair);
            System.out.println("Total odds encountered: " + countNumberImpair);
    }

    public static boolean isEvenNumber (int number){
        if (number < 0) {
            return false;
        } else if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

