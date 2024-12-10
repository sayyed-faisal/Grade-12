public class TripleDouble extends ConsoleProgram
{
    public void run()
    {
        int numberOfPoints = readInt("How many points? ");
        int numberOfRebounds = readInt("How many rebounds? ");
        int numberOfAssists = readInt("How many assists? ");
        
        boolean tripleDouble = numberOfPoints >= 10 && numberOfRebounds >= 10
        && numberOfAssists >= 10;
        
        System.out.println("Got a Triple Double? " + tripleDouble);
    }
}
