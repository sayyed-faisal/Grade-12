public class Factorial extends ConsoleProgram
{
    public void run()
    {
        int userFactorial = readInt("Enter the factorial you want to find: ");
        
        int result = 1;
        
        for (int i = userFactorial; i > 0; i--)
        {
            result *= i;
        }
        System.out.println(result);
    }
}
