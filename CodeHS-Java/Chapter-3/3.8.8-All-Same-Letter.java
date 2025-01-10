public boolean allSameLetter(String str)
{   
    boolean allSameLetter = true;
    for (int i = 1; i < str.length(); i++)
    {
        char currentLetter = Character.toLowerCase(str.charAt(i));
        char previousLetter = Character.toLowerCase(str.charAt(i - 1));
        if (currentLetter != previousLetter)
        {
            allSameLetter = false;
            return allSameLetter;
        }
    }
    return allSameLetter;
}