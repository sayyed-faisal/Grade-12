public class Taffy extends ConsoleProgram
{
    public void run()
    {
        System.out.println("Starting Taffy Timer...");
        
        int temperature = readInt("Enter the temperature: ");
        
        while (temperature < 270)
        {
            System.out.println("");
            System.out.println("The mixture isn't ready yet.");
            temperature = readInt("Enter the temperate: ");
        }
        System.out.println("Your taffy is ready for the next step!");
    }
}
