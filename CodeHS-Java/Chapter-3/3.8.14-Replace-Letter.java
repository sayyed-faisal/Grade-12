public String replaceLetter(String word, char letterToReplace, char replacingLetter)
{
    String result = "";
    for (int i = 0; i < word.length(); i++) {
        char current = word.charAt(i);
        if (current == letterToReplace) {
            result += replacingLetter;
        }
        else {
            result += current;
        }
    }
    return result;
}