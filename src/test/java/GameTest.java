import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void divisibleByThreeShouldTrue() {
        var game = new Game();
        assertEquals(true, game.DivisibleByThree(3));
        assertEquals(true, game.DivisibleByThree(6));
    }

    @Test
    void divisibleByFiveShouldTrue(){
        var game = new Game();
        assertEquals(true, game.DivisibleByFive(5) );
        assertEquals(true, game.DivisibleByFive(10) );
    }


    @Test
    void divisibleFiveAndDivisibleThreeShouldTrue(){
        var game = new Game();
        assertEquals(true, game.DivisibleByFive(10));
        assertEquals(true, game.DivisibleByThree(6));

    }
}

