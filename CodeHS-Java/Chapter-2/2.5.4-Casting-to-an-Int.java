public class CastingToInt extends ConsoleProgram
{
    public void run()
    {
        double myDouble = readDouble("Please input your double: ");
        int doubleToInt = (int)myDouble;
        System.out.println(doubleToInt);
    }
}
