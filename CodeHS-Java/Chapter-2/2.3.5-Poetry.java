/* This program prints a haiku, acrostic, and a user-defined poem
 * to the console.
 */
public class Poetry extends ConsoleProgram
{
    public void run()
    {
        // Print an example of a haiku, 3 lines long.
        System.out.println("An old silent pond");
        System.out.println("A frog jumps into the pond--");
        System.out.println("Splash! Silence again.");
        
        // Print an example of an acrostic, 5 lines long.
        System.out.println("Shining bright in the velvet night,");
        System.out.println("Twinkling with a timeless light.");
        System.out.println("Above us, dreams are softly cast,");
        System.out.println("Reaching out from eons past.");
        System.out.println("Secrets of the cosmos, vast.");
        
        // Prompt the user for a one-line poem and print it to the console.
        String userPoem = readLine("Write a one-line poem: ");
        System.out.println(userPoem);
    }
}
