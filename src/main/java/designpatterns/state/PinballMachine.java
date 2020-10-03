package designpatterns.state;

public class PinballMachine {
    State noTurnState;
    State hasTurnState;

    State state;
    int numberOfTurns;
    int numberOfPinballs = 0;

    public PinballMachine(int numberOfTurns) {
        noTurnState = new NoTurnsState(this);
        hasTurnState = new HasTurnsState(this);

        if (numberOfTurns > 0) {
            this.numberOfPinballs = 3 * numberOfTurns;
            this.numberOfTurns = numberOfTurns - 1;
            state = hasTurnState;
        } else {
            this.numberOfTurns = numberOfTurns;
            state = noTurnState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void pullLauncher() {
        state.pullLauncher();
    }

    void addPinballs() {
        System.out.println("3 pinballs roll down to play...");
        numberOfPinballs = 3;
    }

    int getNumberOfPinballs() {
        return numberOfPinballs;
    }

    int getNumberOfTurnsCount() {
        return numberOfTurns;
    }

    void addOneTurn() {
        this.numberOfTurns += 1;
        if(this.numberOfTurns == 1) {
            System.out.println("--> You bought a turn! You now have " + this.numberOfTurns + " extra turn.");
        } else {
            System.out.println("--> You bought another turn! You now have " + this.numberOfTurns + " extra turns.");
        }
    }

    public void removeOneTurn() {
        this.numberOfTurns -= numberOfTurns;
        System.out.println("--> You used a turn! You now have " + this.numberOfTurns + " turns left.");
    }

    void launchPinball() {
        this.numberOfPinballs -= 1;
        System.out.println("--> Pinball launched! Pinballs remaining: " + this.numberOfPinballs);
    }

    void setState(State state) {
        this.state = state;
    }

    public State getNoTurnState() {
        return noTurnState;
    }

    public State getHasTurnState() {
        return hasTurnState;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\n=====================================");
        result.append("\n|            80's Pinball           |");
        result.append("\n|===================================|");
        result.append("\n|                                   |");
        result.append("\n|    Number of Turns Left: " + numberOfTurns + "        |");
        result.append("\n|           Pinballs Left: " + numberOfPinballs + "        |");
        result.append("\n|                                   |");
        result.append("\n|  " + state + " |");
        result.append("\n=====================================");
        return result.toString();
    }

    public State getState() {
        return this.state;
    }
}