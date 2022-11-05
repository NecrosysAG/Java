import java.util.Scanner;

public class AstericsObelixHomework {

    //задача 3

    public static void main(String[] args) {
        int potionPrepareTime = 5;
        double potionPreparedByAsterix = 3;
        double potionPreparedByObelix = potionPreparedByAsterix / 2;

        boolean potionTheoryOfProbability = (potionPreparedByAsterix + potionPreparedByObelix > potionPrepareTime);

        System.out.println(potionTheoryOfProbability);

        //задача 4

        Scanner num = new Scanner(System.in);
        for (; ;) {
            System.out.println("Enter num");
        int first;
        first = num.nextInt();

        int anyNum = first % 2;
        boolean evenOrOdd = (anyNum == 0);
        System.out.println(evenOrOdd);
        }



    }
}


