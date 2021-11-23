package ExercisesWorkingWithAbstraction.CardsWithPower03;

public class Card {
    private Rank rank;
    private Suit suit;
    private int power;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
        setPower();
    }

    public void setPower() {
       this.power = this.rank.getRank() + this.suit.getSuit();
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d", rank.name(), suit.name(), power);
    }
}
