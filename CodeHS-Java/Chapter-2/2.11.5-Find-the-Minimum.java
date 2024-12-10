public class FindMinimum extends ConsoleProgram
{
    public void run()
    {
        int firstNumber = readInt("Enter first number: ");
        int secondNumber = readInt("Enter second number: ");
        int thirdNumber = readInt("Enter third number: ");
        
        if (firstNumber <= secondNumber && firstNumber <= thirdNumber)
        {
            System.out.println(firstNumber);
        } 
        else if (secondNumber <= firstNumber && secondNumber <= thirdNumber)
        {
            System.out.println(secondNumber);
        }
        else if (thirdNumber <= firstNumber && thirdNumber <= secondNumber)
        {
            System.out.println(thirdNumber);
        }
    }
}
