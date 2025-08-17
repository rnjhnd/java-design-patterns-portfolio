import java.util.Scanner;

public class CentralHub {
    public static void main(String[] args) {
        LightSystem lights = new LightSystem();
        MusicSystem music = new MusicSystem();
        Thermostat thermos = new Thermostat();
        Control control = new Control();

        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("\nMAIN MENU:");
            System.out.println("1. Control Light");
            System.out.println("2. Control Music");
            System.out.println("3. Control Thermostat");
            System.out.println("4. Exit");
            System.out.print("\nSelect a device to control: ");

            int option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("\nLIGHT CONTROLS:");
                    System.out.println("1. Turn On");
                    System.out.println("2. Turn Off");
                    System.out.println("3. Increase Brightness");
                    System.out.println("4. Decrease Brightness");
                    System.out.print("\nSelect an action: ");

                    int lightOption = input.nextInt();

                    switch (lightOption) {
                        case 1:
                            control.setCommand(new TurnOn(lights));
                            control.select();
                            break;
                        case 2:
                            control.setCommand(new TurnOff(lights));
                            control.select();
                            break;
                        case 3:
                            control.setCommand(new IncreaseSetting(lights));
                            control.select();
                            break;
                        case 4:
                            control.setCommand(new DecreaseSetting(lights));
                            control.select();
                            break;
                        default:
                            System.out.println("Invalid Option!");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("\nMUSIC CONTROLS:");
                    System.out.println("1. Turn On");
                    System.out.println("2. Turn Off");
                    System.out.println("3. Increase Volume");
                    System.out.println("4. Decrease Volume");
                    System.out.println("5. Change Playlist");
                    System.out.print("\nSelect an action: ");

                    int musicOption = input.nextInt();

                    switch (musicOption) {
                        case 1:
                            control.setCommand(new TurnOn(music));
                            control.select();
                            break;
                        case 2:
                            control.setCommand(new TurnOff(music));
                            control.select();
                            break;
                        case 3:
                            control.setCommand(new IncreaseSetting(music));
                            control.select();
                            break;
                        case 4:
                            control.setCommand(new DecreaseSetting(music));
                            control.select();
                            break;
                        case 5:
                            control.setCommand(new ChangePlaylist(music));
                            control.select();
                            break;
                        default:
                            System.out.println("Invalid Option!");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("\nTHERMOSTAT CONTROLS:");
                    System.out.println("1. Turn On");
                    System.out.println("2. Turn Off");
                    System.out.println("3. Increase Temperature");
                    System.out.println("4. Decrease Temperature");
                    System.out.print("\nSelect an action: ");

                    int thermostatOption = input.nextInt();

                    switch (thermostatOption) {
                        case 1:
                            control.setCommand(new TurnOn(thermos));
                            control.select();
                            break;
                        case 2:
                            control.setCommand(new TurnOff(thermos));
                            control.select();
                            break;
                        case 3:
                            control.setCommand(new IncreaseSetting(thermos));
                            control.select();
                            break;
                        case 4:
                            control.setCommand(new DecreaseSetting(thermos));
                            control.select();
                            break;
                        default:
                            System.out.println("Invalid Option!");
                            break;
                    }
                    break;

                case 4:
                    System.out.println("Program Terminated");
                    input.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Option!");
                    break;
            }
        }
    }
}