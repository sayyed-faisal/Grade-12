public String altCase(String text)
{
    String result = "";
    for (int i = 0; i < text.length(); i++)
    {
        if (i % 2 == 0)
        {
            char upperCase =  Character.toUpperCase(text.charAt(i));
            result += upperCase;
        }
        else
        {
            char lowerCase = Character.toLowerCase(text.charAt(i));
            result += lowerCase;
        }
    }
    return result;
}
