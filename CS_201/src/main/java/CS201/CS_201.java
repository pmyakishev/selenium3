/*
 * Class: CMSC201 
 * Instructor: Grinberg
 * Description: Zellers Congruence
 * Due: 02/18/2018
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Paul Myakishev
*/

package CS201;


public class CS_201 {

    public static void main(String[] args) {

        getBigWords("There are 87,000,000 people in Canada");
        getBigWords("Location, location, location");
    }

    public static String[] getBigWords(String sentence)
    {
        java.util.ArrayList<String> result = new java.util.ArrayList<>();
        String[] split = sentence.split("\\s+");
        for(int i = 0; i < split.length; i++)
        {
            if(split[i].length() > 5)
            {
                if(split[i].matches("[a-zA-Z]+"))
                {
                    result.add(split[i]);
                }
                if (split[i].matches("[a-zA-Z]+,"))
                {
                    String temp = "";
                    for(int j = 0; j < split[i].length(); j++)
                    {
                        if((split[i].charAt(j))!=((char)','))
                        {
                            temp += split[i].charAt(j);
                            //System.out.print(split[i].charAt(j) + "|");
                        }
                    }
                    result.add(temp);
                }
            }
        }
        return result.toArray(new String[0]);
    }
    }




