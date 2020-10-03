package designpatterns.state;

import junit.framework.TestCase;

public class NoTurnsStateTest extends TestCase {
    PinballMachine game = new PinballMachine(0);

    public void testToString() {
        String expected = "Need a quarter in order to play.";
        assertEquals(expected, game.state.toString());
    }

    public void testPullLauncher() {
        game.pullLauncher();

        // Test for no change in pinballs
        int expectedPinballs = 0;
        assertEquals(expectedPinballs, game.numberOfPinballs);

        // Test for no extra turns
        int expectedTurns = 0;
        assertEquals(expectedTurns, game.numberOfTurns);
    }

    public void testInsertQuarter() {
        game.insertQuarter();

        // Test for addition of pinballs
        int expectedPinballs = 3;
        assertEquals(expectedPinballs, game.numberOfPinballs);

        // Test for no extra turns
        int expectedTurns = 0;
        assertEquals(expectedTurns, game.numberOfTurns);
    }
}