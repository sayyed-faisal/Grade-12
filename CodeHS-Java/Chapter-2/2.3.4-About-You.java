public class AboutYou extends ConsoleProgram
{
    public void run()
    {
        String favoriteFood = readLine("What is your favorite food? ");
        String favoriteColor = readLine("What is your favorite color? ");
        String favoriteMovie = readLine("What is your favorite movie? ");
        System.out.println(favoriteFood);
        System.out.println(favoriteColor);
        System.out.println(favoriteMovie);
    }
}
