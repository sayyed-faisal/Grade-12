public class RollerCoaster extends ConsoleProgram
{
    public void run()
    {
        boolean tallEnough = readBoolean("Are you tall enough? ");
        boolean oldEnough = readBoolean("Are you old enough? ");
        
        if (tallEnough && oldEnough) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
