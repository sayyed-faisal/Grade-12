public class ThreeStrings extends ConsoleProgram
{
    public void run()
    {
        String stringOne = readLine("First string? ");
        String stringTwo = readLine("Second string? ");
        String stringThree = readLine("Third string? ");
        
        boolean stringsAreEqual = stringThree.equals(stringOne + stringTwo);
        
        if (stringsAreEqual)
        {
            System.out.println(stringOne + " + " + stringTwo + " is equal to " + stringThree + "!");
        }
        else
        {
            System.out.println(stringOne + " + " + stringTwo + " is not equal to " + stringThree + "!");
        }
    }
}
