public String teenTalk(String sentence)
{
    String result = "";
    
    for (int i = 0; i < sentence.length(); i++)
    {
        char current = sentence.charAt(i);
        
        if (Character.isWhitespace(current))
        {
            result += " like ";
        }
        else
        {
            result += current;
        }
    }
    
    return result;
}