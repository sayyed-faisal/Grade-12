public class GuessTheNumber extends ConsoleProgram
{
    public void run()
    {
        int secretNumber = 6;
        
        // Allow the user to keep guessing numbers between
        // 1 and 10 until they guess the correct number
      
        System.out.println("I'm thinking of a number between 1 and 10.");
        System.out.println("See if you can guess the number!");
        
        while (true)
        {
            int numberGuess = readInt("Enter your guess: ");
            if (numberGuess == secretNumber)
            {
                break;
            }
            System.out.println("Try again!");
        }
        System.out.println("Correct!");
    }
}
