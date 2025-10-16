import java.util.Scanner;

public class SafeInput
{
    /**
     * Get a non-zero length string from the user
     * Use: String name = getNonZeroLenString(pipe, prompt);
     * @param pipe - Scanner to use for input
     * @param prompt -Propmt to display to the user (e.g. "Enter your name: ")
     * @return - a non-empty String
     */


    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";
        do {
            System.out.print(prompt);
            retString = pipe.nextLine();
            if (!retString.isEmpty())
            {
            } else {
                System.out.println("Input must be at least one character long. Please try again.");
            }
        } while (retString.isEmpty());

        return retString;

    }
}
