public class PhraseOMatic {
  public static void main(String[] args) {
    String[] wordListOne = {"Gotta get schwifty", "And thats the wayyy the news goes", "Hit the sack, Jack", "Uh ohh, somersault jump", "GRASSS... tastes bad", "BURGERTIME"} ;

    String[] wordListTwo = {"Blah blah blah", "Blah", "blah"} ;

    String[] wordListThree = {"Last phrase"} ;

    int oneLength = wordListOne.length ;
    int twoLength = wordListTwo.length ;
    int threeLength = wordListThree.length ;

    System.out.println(oneLength) ;
    System.out.println(twoLength) ;
    System.out.println(threeLength) ;

    int rand1 = (int) (Math.random() * oneLength) ;
    int rand2 = (int) (Math.random() * twoLength) ;
    int rand3 = (int) (Math.random() * threeLength) ;


    System.out.println(rand1) ;
    System.out.println(rand2) ;
    System.out.println(rand3) ;

    String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3] ;

    System.out.println("What we need is a " + phrase) ;
  }
}
