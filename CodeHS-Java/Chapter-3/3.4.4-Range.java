/**
 * This method returns true if num is between min and max inclusive
 * and false otherwise.
 */
private boolean inRange(int num, int min, int max)
{
    if (min <= num && num <= max)
    {
        return true;
    }
    else
    {
        return false;
    }
}