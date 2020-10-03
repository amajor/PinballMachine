package designpatterns.state;

import junit.framework.TestCase;

public class HasTurnsStateTest extends TestCase {
    PinballMachine game = new PinballMachine(1);

    public void testTestToString() {
        String expected = "  Waiting for pull of launcher. ";
        assertEquals(expected, game.state.toString());
    }

    public void testPullLauncher() {
        // Test for full pinball set
        int expectedPinballs = 3;
        assertEquals(expectedPinballs, game.numberOfPinballs);

        // Test for no extra turns
        int expectedTurns = 0;
        assertEquals(expectedTurns, game.numberOfTurns);

        // Pull it!
        game.pullLauncher();

        // Test for one less pinball
        expectedPinballs = 2;
        assertEquals(expectedPinballs, game.numberOfPinballs);

        // Test for no extra turns
        expectedTurns = 0;
        assertEquals(expectedTurns, game.numberOfTurns);
    }

    public void testInsertQuarter() {
        // Test for no extra turns
        int expectedTurns = 0;
        assertEquals(expectedTurns, game.numberOfTurns);

        // Insert money!
        game.insertQuarter();

        // Test for no extra turns
        expectedTurns = 1;
        assertEquals(expectedTurns, game.numberOfTurns);
    }
}