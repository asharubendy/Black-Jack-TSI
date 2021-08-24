import com.company.Card;
import org.junit.jupiter.engine.JupiterTestEngine;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CardTests {

    @Test
    @DisplayName("A test to check the instantiation of card works correctly")
    void instantiationTest(){
   Card c = new Card(1,"Diamond");
   assertEquals(c.getSuit(), "Diamond", "Test failed for assertion of getting suit type");
   assertEquals(c.getCardValue(), 1, "Test failed for assertion of getting card value");
    }
    @Test
    @DisplayName("A test to check the setters and getters of card")
    void gettersAndSettersTests(){
        Card c = new Card(0,"Diamond");
        c.setCardValue(2);
        c.setFaceCard(true);
        c.setFaceCardType("Hearts");
        assertEquals(c.getCardValue(),c.getCardValue(), "Test failed for assertion of card value");
        assertTrue(c.isFaceCard(), "Test failed for assertion of is face card value");
        assertEquals(c.getFaceCardType(),"Hearts", "Test failed for assertion of card type");
    }

}

