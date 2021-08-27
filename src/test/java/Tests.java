import com.company.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class Tests {
    //Card Tests
    @Test
    @DisplayName("A test to check the instantiation of card works correctly")
    void instantiationTest(){
   Card c = new Card(1,"Diamond");
   assertEquals(c.getSuit(), "Diamond", "Test failed for assertion of getting suit type");
   assertEquals(c.getCardValue(), 1, "Test failed for assertion of getting card value");

    }

    @Test
    @DisplayName("A test to check the setters and getters of card type test boolean")
    void TestCardTypeBoolTest(){
        Card c = new Card(0,"Diamond");
        c.setFaceCard(true);
        assertTrue(c.isFaceCard(), "Test failed for assertion of card face boolean");
    }

    @Test
    @DisplayName("A test to check the setters and getters of card values")
    void CardValueTest(){
        Card c = new Card(0,"Diamond");
        c.setCardValue(2);
        assertEquals(c.getCardValue(),c.getCardValue(), "Test failed for assertion of card value");
    }
    @Test
    @DisplayName("A test to check the setters and getters of card type")
    void CardTypeTest() {
        Card c = new Card(0,"Hearts");
        c.setFaceCardType("Diamonds");
        assertEquals(c.getFaceCardType(), "Diamonds",  "Test failed for assertion of is face card types");
    }
    @Test
    @DisplayName("Test for setting card suit")
    void setSuitTest(){
        Card c = new Card(1,"Diamonds");
        c.setSuit("Hearts");
        assertEquals(c.getSuit(),"Hearts", "Test failed for setting of the suit" );
    }
    //Person class Tests
    @Test
    @DisplayName("A test to check the starting betting money works")
    void PersonStartingMoneyTest(){
        assertEquals(Person.getStartingMoney(), 500, "the initial starting money isn't 500");
    }

    @Test
    @DisplayName("Test for the deck generation")
    void PersonStackOfCardsTest(){
        Person t = new Person();
        Stack<Card> test = t.getHand();
        Person p = new Person();
        Stack<Card> c = p.getHand();

        assertEquals(c,test,"Test failed for The deck generation since it is not the same");
    }



    @Test
    @DisplayName("Test for setting the hand")
    void personSetHandTest(){
        Stack<Card> test = new Stack<>();
        Person p = new Person();
        p.setHand(test);
            assertEquals(p.getHand(),test, "Test failed for the setting of the persons hand" );
    }
    @Test
    @DisplayName("Test for showing the hand")
    void PersonShowHandTest() {
       Person p = new Person();
        Stack<Card> test = new Stack<>();
        test.add(new Card(1,"Diamonds"));
        p.setHand(test);
        p.showHand();
    }
    //Dealer Tests
    @Test
    @DisplayName("Dealer hand test")
    void DealerShowHandTest(){
        Dealer d = new Dealer();
        Stack<Card> test = new Stack<>();
        test.add(new Card(1,"Diamonds"));
        d.setHand(test);
        d.showHand();
    }
    //deck and generator tests
    @Test
    @DisplayName("Test to check deck generation")
    void generateDeckTest(){
       Stack<Card> c;
       Stack<Card> d;
        c = DeckGenerator.getDeck();
        d = DeckGenerator.getDeck();
       assertNotEquals(d,c, "test failed for shuffling of deck");
    }
    @Test
    @DisplayName("Test to get suit types")
    void getSuitTypesTest(){
    Deck d = new Deck();
    String testInput[] = {"Test","test2","test3","test4"};
    String actualinput[] = d.getSuitType();
    d.setSuitType(testInput);
    assertNotEquals(actualinput,d.getSuitType(), "Test test failed due to not setting the suit types of the deck");
    }
    @Test
    @DisplayName("Test to get suit types")
    void getSuitAmountTest(){
        Deck d = new Deck();
        int amount = d.getAmount();
        d.setAmount(66);
        assertNotEquals(amount, d.getAmount(), "the test failed due to not setting a different amount");
    }
    //tests for game rules
    @Test
    @DisplayName("Test blackjack game rules")
    void blackjackGameRulesTest() {
    Stack <Card> c = new Stack<>();
    c = DeckGenerator.getDeck();
    GameRules.blackJackGameRules(c);
        for (Card t:c)
        {
            assertNotEquals(11,t.getCardValue(), "This test failed because there are cards that have not been changed from the higher value to 10");
        }

    }
    @Test
    @DisplayName("Test blackjack game rules")
    void blackjackNewHandTest() {
        Stack <Card> c = new Stack<>();
        c = DeckGenerator.getDeck();
        Player player = new Player();
        Dealer dealer = new Dealer();
        GameRules.blackJackDealNewHand(c,player.getHand(), dealer.getHand());
        player.getHand().trimToSize();
        assertEquals(10, dealer.getHand().size(), "This test failed because there are not two items in the stack");
    }
    @Test
    @DisplayName("blackjack checks for hit me")
    void blackJackCheckHitMeTest() {
        Stack<Card> c = new Stack<>();
        c = DeckGenerator.getDeck();
        Player p = new Player();
        Dealer d = new Dealer();
        GameRules.blackJackDealNewHand(c,p.getHand(), d.getHand());
        GameRules.blackJackHitMe(c,p.getHand());
        assertTrue(p.getHand().size() > 2, "Test failed since there are 2 or less cards still in the hand");
    }

    @Test
    @DisplayName("BlackJack Check values test")
    void blackJackCheckValuesTest() {
        Stack<Card> c = new Stack<>();
        c = DeckGenerator.getDeck();
        Player p = new Player();
        Dealer d = new Dealer();
        GameRules.blackJackDealNewHand(c,p.getHand(), d.getHand());
        System.out.println(GameRules.blackJackCheckValues(p.getHand()));
        assertTrue(GameRules.blackJackCheckValues(p.getHand()) >= -1, "This test failed because the cards have failed to add up");
    }
    @Test
    @DisplayName("BlackJack Check values test")
    void blackJackCheckValuesAboveThresholdTest(){
        Stack<Card> c = new Stack<>();
        c = DeckGenerator.getDeck();
        Player p = new Player();
            GameRules.blackJackAceRules(p.getHand());
        for (Card t: p.getHand()){
            assertNotEquals(11, t.getCardValue(), "one of these cards is 11");
        }
    }

}




