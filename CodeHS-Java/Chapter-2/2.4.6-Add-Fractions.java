public class AddFractions extends ConsoleProgram
{
    public void run()
    {
        int firstNum = readInt("What is the numerator of the first fraction? ");
        int firstDenom = readInt("What is the denominator of the first fraction? ");
        int secondNum = readInt("What is the numerator of the second fraction? ");
        int secondDenom = readInt("What is the denominator of the second fraction? ");

        int finalNum = firstNum * secondDenom + secondNum * firstDenom;
        int finalDenom = firstDenom * secondDenom;
        System.out.println("The sum of " + firstNum + "/" + firstDenom + " + " + secondNum + "/" + secondDenom + " = " + finalNum + "/" + finalDenom);
    }
}
