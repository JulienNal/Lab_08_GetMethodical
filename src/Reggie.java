import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("SSN test (pattern: ^\\d{3}-\\d{2}-\\d{4}$).");
        String ssn = SafeInput.getRegExString(in, "SSN test", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Accepted SSN: " + ssn);

        System.out.println("\nUC Student M# test (pattern: ^(M|m)\\d{5}$).");
        String mnum = SafeInput.getRegExString(in, "M# test", "^(M|m)\\d{5}$");
        System.out.println("Accepted M#: " + mnum);

        System.out.println("\nMenu choice test (pattern: ^[OoSsVvQq]$) - O=Open, S=Save, V=View, Q=Quit.");
        String choice = SafeInput.getRegExString(in, "Menu choice test", "^[OoSsVvQq]$");
        System.out.println("Accepted choice: " + choice.toUpperCase());

        in.close();
        System.out.println("\nAll tests complete.");
    }
}
