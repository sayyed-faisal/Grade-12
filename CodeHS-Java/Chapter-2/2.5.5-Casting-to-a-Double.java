public class CastingToDouble extends ConsoleProgram
{
    public void run()
    {
        int firstInt = readInt("First Int: ");
        int secondInt = readInt("Second Int: ");
        double firstDivSecond = (double)firstInt / secondInt;
        System.out.println(firstDivSecond);
    }
}
