public boolean bracketsMatch(String brackets)
{
    int counter = 0;

    for (int i = 0; i < brackets.length(); i++)
    {
        char current = brackets.charAt(i);
        if (current == '{')
        {
           counter++;
        }
        else if (current == '}')
        {
            counter--;
        }

        if (counter < 0)
        {
            return false;
        }
    }
    return counter == 0; 
}