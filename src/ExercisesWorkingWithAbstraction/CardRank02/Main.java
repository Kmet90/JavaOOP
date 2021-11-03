package ExercisesWorkingWithAbstraction.CardRank02;

public class Main {
    public static void main(String[] args) {

        System.out.println("Card Ranks:");

        for (Card card : Card.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", card.ordinal(),card.name());
        }

    }
}
