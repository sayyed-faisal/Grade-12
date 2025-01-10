public String doubleVowel(String str)
{
    String vowels = "aeiouAEIOU";
    String result = "";
    for (int i = 0; i < str.length(); i++)
    {
        if (vowels.indexOf(str.charAt(i)) != -1)
        {
            result = result + str.charAt(i) + str.charAt(i);
        }
        else
        {
            result += str.charAt(i);
        }
    }
    return result;
}