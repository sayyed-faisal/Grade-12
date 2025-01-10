public String tripleString(String word) 
    {
        String result = word;
        for (int i = 0; i < 2; i++)
        {
            result += "!" + word;
        }
        return result;
    }
