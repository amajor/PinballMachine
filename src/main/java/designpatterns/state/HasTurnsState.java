package designpatterns.state;

public class HasTurnsState implements State {
    PinballMachine pinballMachine;

    public HasTurnsState(PinballMachine pinballMachine) {
        this.pinballMachine = pinballMachine;
    }

    public void insertQuarter() {
        this.addTurn();
    }

    public void pullLauncher() {
        System.out.println("You pulled the launcher...");
        if(pinballMachine.getNumberOfPinballs() > 1) {
            pinballMachine.launchPinball();
        } else if(pinballMachine.getNumberOfTurnsCount() > 0) {
            pinballMachine.launchPinball();
            pinballMachine.addPinballs();
            pinballMachine.removeOneTurn();
        } else {
            pinballMachine.launchPinball();
            pinballMachine.setState(pinballMachine.getNoTurnState());
        }
    }

    private void addTurn() {
        pinballMachine.addOneTurn();
    }

    public String toString() {
        return "  Waiting for pull of launcher. ";
    }
}