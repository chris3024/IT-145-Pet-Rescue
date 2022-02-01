import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

    private static Scanner scanner = new Scanner(System.in);

    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    // Instance variables (if needed)
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

    public static void main(String[] args) {
        String menuChoice = "";

        initializeDogList();
        initializeMonkeyList();

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.
        while (!menuChoice.equalsIgnoreCase("q")) {
            displayMenu();
            menuChoice = scanner.nextLine();
            switch(menuChoice) {
                case "1":
                    intakeNewDog(scanner);
                    break;
                case "2":
                    intakeNewMonkey(scanner);
                    break;
                case "3":
                    reserveAnimal(scanner);
                    break;
                case "4":
                    printAnimals();
                case "5":
                    printAnimals();
                case "6":
                    printAnimals();
                    break;
                case "q":
                    System.out.println("You have exited the application");
                    break;
            }
        }
    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6",
                "05-12-2019", "United States", "intake", false,
                "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2",
                "02-03-2020", "United States", "Phase I", false,
                "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6",
                "12-12-2019", "Canada", "in service", true,
                "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("Sam", "Capuchin", "2.0", "5.1", "7.1",
                "male", "3", "8", "02-03-2021", "United States",
                "intake", false, "United State");

        monkeyList.add(monkey1);
    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        // Add the code to instantiate a new dog and add it to the appropriate list
    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
            System.out.print("What is the new monkey's name?\n");
            String name = scanner.nextLine();

            for(Monkey monkey: monkeyList) {
                if (monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system.");
                    return;
                }
            }

            System.out.println("What is the monkey's species?");
            String species = scanner.nextLine();

            //TODO: Validation check for species

            System.out.println("What is the monkey's tail length?");
            String tailLength = scanner.nextLine();

            System.out.println("What is the monkey's height?");
            String height = scanner.nextLine();

            System.out.println("What is the monkey's body length?");
            String bodyLength = scanner.nextLine();

            System.out.println("What is the monkey's gender?");
            String gender = scanner.nextLine();

            System.out.println("What is the monkey's age?");
            String age = scanner.nextLine();

            System.out.println("What is the monkey's weight?");
            String weight = scanner.nextLine();

            System.out.println("What is the monkey's acquisition date?");
            String acquisitionDate = scanner.nextLine();

            System.out.println("What is the monkey's acquisition country?");
            String acquistionCountry = scanner.nextLine();

            System.out.println("What is the monkey's training status?");
            String trainingStatus = scanner.nextLine();

            System.out.println("Is this monkey reserved?");
            boolean reserved = scanner.nextBoolean();

            System.out.println("What is the monkey's service country?");
            String inServiceCountry = scanner.nextLine();

            Monkey monkey = new Monkey(name, species, tailLength, height, bodyLength, gender, age, weight,acquisitionDate,
                    acquistionCountry, trainingStatus, reserved, inServiceCountry);

            monkeyList.add(monkey);
        }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            System.out.println("The method reserveAnimal needs to be implemented");

        }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals() {
            System.out.println("The method printAnimals needs to be implemented");


        }

}

