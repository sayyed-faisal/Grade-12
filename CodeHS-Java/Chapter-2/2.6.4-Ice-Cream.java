// This program asks the user if they like ice cream and
// prints their response to the console.
public class IceCream extends ConsoleProgram
{
    public void run()
    {
        boolean likeIceCream = readBoolean("Do you like ice cream? (true/false) ");
        System.out.println(likeIceCream);
    }
}
