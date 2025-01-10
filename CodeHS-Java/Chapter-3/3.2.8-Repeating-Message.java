public class MyProgram extends ConsoleProgram
{
    public void run()
    {
        printMessage("Hi", "Karel", 5);
    }
    
    public void printMessage(String lineOne, String lineTwo, int numLines)
    {
        for (int i = 0; i < numLines / 2; i++) {
            System.out.println(lineOne);
            System.out.println(lineTwo);
        }
        if (numLines % 2 == 1)
        {
            System.out.println(lineOne);
        }
    }
}