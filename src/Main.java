import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        int choice2 = 0;
        while(choice2 != 4){
            System.out.println("Welcome to the horror character program.");
            HorrorCharacter monster = null;
            choice = characterSelect(scanner);

            if(choice == 1 || choice == 2 || choice == 3){
                String name = "";
                System.out.println("What would you like to name your monster?");
                name = scanner.nextLine();
                if(choice == 1){
                    monster = new Vampire();
                    monster.setName(name);
                }
                if(choice == 2){
                    monster = new Zombie();
                    monster.setName(name);
                }
                if(choice == 3){
                   monster = new Werewolf();
                    monster.setName(name);
                }
                System.out.println("You have created a " + monster.getMonsterType() + " named " + monster.getName());

                while(choice2 != 4) {
                    System.out.println("What would you like to do with your character?");
                    System.out.println("1. Attack");
                    System.out.println("2. Flee");
                    System.out.println("3. Transform");
                    choice = scanner.nextInt();
                    scanner.nextLine();

                    if (choice == 1 || choice == 2 || choice == 3) {
                        if (choice == 1) {
                            monster.attack();
                        }
                        if (choice == 2) {
                            monster.flee();
                            choice2 = 4;
                        }
                        if (choice == 3) {
                            monster.transform();
                        }
                    }
                    else{
                        System.out.println("There was an error please try again.");
                    }
                }
            }
            else{
                System.out.println("Error, please try again.");
                choice = characterSelect(scanner);
            }
        }

        }

        //for character selection
    public static int characterSelect(Scanner scanner){
        int c = 0;

        System.out.println("Which type of monster would you like? Please type corresponding number only");
        System.out.println("1. Vampire");
        System.out.println("2. Zombie");
        System.out.println("3. Werewolf");
        c = scanner.nextInt();
        scanner.nextLine();
        return c;
    }

    }