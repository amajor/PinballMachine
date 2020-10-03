# PinballMachine
This is a very simple example using the State pattern.

Adding a quarter provides 1 turn. A single turn provides 3 pinballs. 

If there are currently 0 turns, the user just gets 3 balls (0 extra turns). 

If there are currently 1 or more turns, the user gets additional extra turns.

Additional quarters will add more turns, that will provide more balls as each turn uses its last ball.

## State Pattern Definition

> **The State Pattern** allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

## This Project

**[State](https://github.com/amajor/PinballMachine/blob/master/src/main/java/designpatterns/state/State.java)** is the state interface.

**[HasTurnsState](https://github.com/amajor/PinballMachine/blob/master/src/main/java/designpatterns/state/HasTurnsState.java)** is the state when there are turns left in the pinball game.

**[NoTurnsState](https://github.com/amajor/PinballMachine/blob/master/src/main/java/designpatterns/state/NoTurnsState.java)** is the state when there are no turns left.

To see the classes in action, we can run the different JUnit test files.

We can also run `PinballMachineTestDrive` to see output from running the game.
