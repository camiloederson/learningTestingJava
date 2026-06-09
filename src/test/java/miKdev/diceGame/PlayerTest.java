package miKdev.diceGame;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class PlayerTest {

    @Mock
    private Dice dice;

    @Test
    void ShouldReturnTrueWhenDiceIsHigherOrEqualThanFour() {
        Mockito.when(dice.roll()).thenReturn(4); //Where is the 4 assigned??
        Player player = new Player(dice); // are we creating the player with the mocked dice?
        assertTrue(player.play());
    }

    @Test
    void ShouldReturnFalseWhenDiceIsLowerThanFour() {
        Mockito.when(dice.roll()).thenReturn(3);
        Player player = new Player(dice);
        assertFalse(player.play());
    }

}