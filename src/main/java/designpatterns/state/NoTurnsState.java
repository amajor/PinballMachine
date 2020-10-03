package designpatterns.state;

public class NoTurnsState implements State {
    PinballMachine pinballMachine;

    public NoTurnsState(PinballMachine pinballMachine) {
        this.pinballMachine = pinballMachine;
    }

    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        pinballMachine.addPinballs();
        pinballMachine.setState(pinballMachine.getHasTurnState());
    }

    public void pullLauncher() {
        System.out.println("You pulled the launcher, but there's no turns left.");
    }

    public String toString() {
        return "Need a quarter in order to play.";
    }
}