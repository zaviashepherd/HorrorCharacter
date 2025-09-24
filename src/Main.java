import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        int choice = 0;

        while(option != 7){
            System.out.println("Welcome to the horror character program.");
            choice = characterSelect();
            if(choice == 1 || choice == 2 || choice == 3){
                String name = "";
                if(choice == 1){
                    System.out.println("What would you like to name your monster?");
                    name = scanner.nextLine();
                    Vampire vampire = new Vampire(name);
                }
                if(choice == 2){
                    System.out.println("What would you like to name your monster?");
                    name = scanner.nextLine();
                    Zombie zombie = new Zombie(name);
                }
                if(choice == 3){
                    System.out.println("What would you like to name your monster?");
                    name = scanner.nextLine();
                    Werewolf werewolf = new Werewolf(name);
                }
            }
            else{
                System.out.println("Error, please try again.");
                choice = characterSelect();
            }
        }

        }

        //for character selection
    public static int characterSelect(){
        Scanner scanner = new Scanner(System.in);
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