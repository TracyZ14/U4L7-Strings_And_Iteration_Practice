public class StrangeWord {

    private String word;

    /* PRECONDITIONS: word will contain all capital letters
     *                with no spaces or other non-letter symbols;
     *                word.length() >= 2
     */
    public StrangeWord(String word) {
        this.word = word;
    }

    /* getter method for word */
    public String getWord() {
        return word;
    }

    /* This method updates word to include endChar repeated num times
     * on each end; this method does not return a value, but rather
     * updates the word instance variable
     *
     * PRECONDITIONS:  num > 0 and endChar.length() == 1
     *
     */
    public void bookend(String endChar, int num)
    {
        for(int i = 0; i < num; i++)
        {
            word = endChar + word + endChar;
        }
    }


    /* Returns the number of times that word contains searchChar followed
     * immediately by a character that is not searchChar; this method
     * does NOT modify word
     *
     * PRECONDITION: searchChar.length() == 1
     */
    public int followedBy(String searchChar)
    {
        String w = word;
        String characterAfter = "";
        int number = 0;
        for(int i = 0; i < w.length() - 1; i = i)
        {
            if(i == w.indexOf(searchChar))
            {
                if((i + 1) < w.length())
                {
                    characterAfter = w.substring(i + 1, i + 2);
                    if(!characterAfter.equals(searchChar))
                    {
                        number++;
                    }
                }
                if((i + 1) == w.length())
                {
                    characterAfter = w.substring(i + 1);
                    if(!characterAfter.equals(searchChar))
                    {
                        number++;
                    }
                }
            }
            w = w.substring(1);
        }
        return number;
    }


    /* Returns a new string consisting of the letters of word that are
     * situated at indices that are multiples of offSet; this method
     * does NOT modify word
     *
     * PRECONDITION: offset > 0
     */
    public String everyOther(int offSet)
    {
        String everyOther = "";
        for(int i = 0; (offSet * i) <= word.length(); i++)
        {
            if(((offSet * i) + 1) < word.length())
            {
                everyOther = everyOther + word.substring(offSet * i, (offSet * i) + 1);
            }
            if(((offSet * i) + 1) == word.length())
            {
                everyOther = everyOther + word.substring(offSet * i);
            }
        }
        return everyOther;
    }

    /* This method prints a word pyramid containing the letters of word;
     * the pyramid should be built top down, starting with the first
     * letter and building subsequent levels that are one more character
     * in length than the previous level; the last level can be does not
     * need to be filled
     */
    public void wordPyramid()
    {
        String w = word;
        for(int i = 0; i <= w.length(); i++)
        {
            if(i < w.length())
            {
                System.out.println(w.substring(0, i + 1));
                w = w.substring(i + 1);
            }
            if(i == w.length())
            {
                System.out.println(w.substring(i));
            }
        }
        if(w.length() != 0)
        {
            System.out.println(w);
        }
    }
}