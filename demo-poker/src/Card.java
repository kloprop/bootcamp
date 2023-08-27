public class Card {
  private Rank rank;
  private Suit suit;

  private Card (Rank rank, Suit suit){
    this.rank = rank;
    this.suit = suit;
  }

  public static Card of (Rank rank, Suit suit){
      return new Card(rank, suit);
  }

  public Rank getRank(){
    return this.rank;
  }

  public Suit getSuit(){
    return this.suit;
  }
}

  
