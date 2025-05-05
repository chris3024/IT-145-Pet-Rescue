import java.util.ArrayList;
import java.util.Scanner;
"""lack of comments throughout makes it hard to follow along with code"""
	"""no testing present at all in the project"""
public class Driver {

    private static Scanner scanner = new Scanner(System.in);

    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    // create monkey arraylist
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

    public static void main(String[] args) {
        String menuChoice = "";

        initializeDogList();
        initializeMonkeyList();

        //Menu loop system
        while (!menuChoice.equalsIgnoreCase("q")) {
            displayMenu();
            menuChoice = scanner.nextLine();

                switch (menuChoice) {
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
                        printAnimals("dog");
                        break;
                    case "5":
                        printAnimals("monkey");
                        break;
                    case "6":
                        printAnimals("available");
                        break;
                    case "q":
                        System.out.println("You have exited the application");
                        break;
                    default:
                        System.out.println("Enter valid menu option");
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


    // Add dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6",
                "05-12-2019", "United States", "in service", false,
                "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2",
                "02-03-2020", "United States", "in service", false,
                "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6",
                "12-12-2019", "Canada", "in service", false,
                "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Add monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("Sam", "Capuchin", "2.0", "5.1", "7.1",
                "male", "3", "8", "02-03-2021", "United States",
                "in service", false, "United State");

        monkeyList.add(monkey1);
    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for (Dog dog : dogList) {
            if (dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();
"""NO input validation for non-integer numbers"""
        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();

        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();

        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();

        System.out.println("What is the dog's acquisition date?");
        String acquisitionDate = scanner.nextLine();

        System.out.println("What is the dog's acquisition country?");
        String acquisitionCountry = scanner.nextLine();

        System.out.println("What is the dog's training status?");
        String trainingStatus = scanner.nextLine();

        System.out.println("Is this dog reserved?");
        boolean reserved = scanner.nextBoolean();

        System.out.println("What is the dog's service country?");
        String inServiceCountry = scanner.next();

        //creating dog object
        Dog dog = new Dog(name, breed, gender, age, weight,acquisitionDate,
                acquisitionCountry, trainingStatus, reserved, inServiceCountry);

        // adding dog to list
        dogList.add(dog);


    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
            System.out.print("What is the new monkey's name?\n");
            String name = scanner.nextLine();

            // input validation by checking for name of monkey
            for(Monkey monkey: monkeyList) {
                if (monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system.");
                    return;
                }
            }

            System.out.println("What is the monkey's species?");
            String species = scanner.nextLine();

            // input validation to check for monkey species
            if (!species.equalsIgnoreCase("capuchin") && !species.equalsIgnoreCase("guenon") &&
            !species.equalsIgnoreCase("macaque") && !species.equalsIgnoreCase("marmoset") &&
            !species.equalsIgnoreCase("squirrel monkey") && !species.equalsIgnoreCase("tamarin"))
            {
                System.out.println("\n\nThis monkey is not eligible for training\n\n");
                return; //returns to menu
            }

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
            String acquisitionCountry = scanner.nextLine();

            System.out.println("What is the monkey's training status?");
            String trainingStatus = scanner.nextLine();

            System.out.println("Is this monkey reserved?");
            boolean reserved = scanner.nextBoolean();

            System.out.println("What is the monkey's service country?");
            String inServiceCountry = scanner.nextLine();


            //creating monkey object
            Monkey monkey = new Monkey(name, species, tailLength, height, bodyLength, gender, age, weight,acquisitionDate,
                    acquisitionCountry, trainingStatus, reserved, inServiceCountry);

            // adding monkey to list
            monkeyList.add(monkey);

        }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
	""" This does not iterate through all the animals, it just gets the first animal that matches and flips the reserved status"""
        public static void reserveAnimal(Scanner scanner) {

            //getting user input for animal type
            System.out.println("Enter animal type: Dog or Monkey");
            String animalType = scanner.nextLine().toLowerCase();

            // input validation for animal type
            if(!animalType.equals("dog") && !animalType.equals("monkey")){
                System.out.println("Invalid input");
                return;
            }

            // getting user input for service country
            System.out.println("Enter animal service country: ");
            String serviceCountry = scanner.nextLine().toLowerCase();

            // reserving dog
            if(animalType.equals("dog")){
                for (Dog dog : dogList) {
                    if (dog.getInServiceLocation().equalsIgnoreCase(serviceCountry) && !dog.getReserved()) {
                        dog.setReserved(true);
                        System.out.println();
                        System.out.println(dog.getName() + " successfully reserved.");
                        return;
                    }
                }
            }

            // reserving monkey
            if (animalType.equals("monkey")) {
                for (Monkey monkey: monkeyList) {
                    if (monkey.getInServiceLocation().equalsIgnoreCase(serviceCountry) && !monkey.getReserved()) {
                        monkey.setReserved(true);
                        System.out.println();
                        System.out.println(monkey.getName() + " successfully reserved");
                        return;
                    }
                }
            }

            // outputting no available animal
            System.out.println();
            System.out.println("No " + animalType + " found in " + serviceCountry);
        }


        public static void printAnimals(String type) {
            // if, else statements to break method into three outcomes

            // if statement to get the list of dogs
            if (type.equalsIgnoreCase("dog")) {
                System.out.println("List of dogs: ");
                for (Dog dog : dogList) {
                    System.out.println(dog.getName() + "\t" + dog.getTrainingStatus() + "\t" + dog.getAcquisitionLocation()
                            + "\t" + dog.getReserved());
                }
            }
            // else if statement to get list of monkeys
            else if (type.equalsIgnoreCase("monkey")) {
                System.out.println("List of monkeys: ");
                for (Monkey monkey: monkeyList) {
                    System.out.println(monkey.getName() + "\t" + monkey.getTrainingStatus() + "\t" + monkey.getAcquisitionLocation()
                            + "\t" + monkey.getReserved());
                }
            }
            // else if statement to get list of available animals
            else if (type.equalsIgnoreCase("available")) {
                    System.out.println("List of available animals: ");

                    for (Dog dog: dogList) {
                        if (dog.getTrainingStatus().equalsIgnoreCase("in service") && !dog.getReserved()) {
                            System.out.println(dog.getName() + "\t" + dog.getTrainingStatus() + "\t" + dog.getAcquisitionLocation()
                                    + "\t" + dog.getReserved());
                        }
                    }
                    for (Monkey monkey:monkeyList) {
                        if (monkey.getTrainingStatus().equalsIgnoreCase("in service") && !monkey.getReserved())
                        {
                            System.out.println(monkey.getName() + "\t" + monkey.getTrainingStatus() + "\t" + monkey.getAcquisitionLocation()
                            + "\t" + monkey.getReserved());
                        }
                    }
                }
            }

}


