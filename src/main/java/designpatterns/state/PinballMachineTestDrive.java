package designpatterns.state;

public class PinballMachineTestDrive {

    public static void main(String[] args) {
        PinballMachine pinballMachine = new PinballMachine(0);

        System.out.println(pinballMachine);

        System.out.println(">>>>> INSERT QUARTER (1) <<<<<");
        pinballMachine.insertQuarter();

        System.out.println(pinballMachine);

        System.out.println(">>>>> PULL LAUNCHER (1) <<<<<");
        pinballMachine.pullLauncher();
        System.out.println(pinballMachine);

        System.out.println("\n>>>>> PULL LAUNCHER (2) <<<<<");
        pinballMachine.pullLauncher();
        System.out.println(pinballMachine);

        System.out.println("\n>>>>> PULL LAUNCHER (3) <<<<<");
        pinballMachine.pullLauncher();
        System.out.println(pinballMachine);

        System.out.println("\n>>>>> PULL LAUNCHER (4) <<<<<");
        pinballMachine.pullLauncher();
        System.out.println(pinballMachine);

        System.out.println("\n>>>>> INSERT QUARTER (1) <<<<<");
        pinballMachine.insertQuarter();
        System.out.println(pinballMachine);

        System.out.println("\n>>>>> INSERT QUARTER (2) <<<<<");
        pinballMachine.insertQuarter();
        System.out.println(pinballMachine);

        System.out.println("\n>>>>> PULL LAUNCHER (1) <<<<<");
        pinballMachine.pullLauncher();
        System.out.println(pinballMachine);

        System.out.println("\n>>>>> PULL LAUNCHER (2) <<<<<");
        pinballMachine.pullLauncher();
        System.out.println(pinballMachine);

        System.out.println("\n>>>>> PULL LAUNCHER (3) <<<<<");
        pinballMachine.pullLauncher();
        System.out.println(pinballMachine);

        System.out.println("\n>>>>> PULL LAUNCHER (4) <<<<<");
        pinballMachine.pullLauncher();
        System.out.println(pinballMachine);

        System.out.println("\n>>>>> INSERT QUARTER (1) <<<<<");
        pinballMachine.insertQuarter();
        System.out.println(pinballMachine);

        System.out.println("\n>>>>> PULL LAUNCHER (1) <<<<<");
        pinballMachine.pullLauncher();
        System.out.println(pinballMachine);

        System.out.println("\n>>>>> PULL LAUNCHER (2) <<<<<");
        pinballMachine.pullLauncher();
        System.out.println(pinballMachine);

        System.out.println("\n>>>>> PULL LAUNCHER (3) <<<<<");
        pinballMachine.pullLauncher();
        System.out.println(pinballMachine);

        System.out.println("\n>>>>> PULL LAUNCHER (4) <<<<<");
        pinballMachine.pullLauncher();
        System.out.println(pinballMachine);

        System.out.println("\n>>>>> PULL LAUNCHER (5) <<<<<");
        pinballMachine.pullLauncher();
        System.out.println(pinballMachine);

        System.out.println("\n>>>>> PULL LAUNCHER (6) <<<<<");
        pinballMachine.pullLauncher();
        System.out.println(pinballMachine);

        System.out.println("\n>>>>> PULL LAUNCHER (7) <<<<<");
        pinballMachine.pullLauncher();
        System.out.println(pinballMachine);
    }
}