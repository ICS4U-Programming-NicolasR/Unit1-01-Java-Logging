import java.util.Scanner;
/**
* Calculates the amount of logs that can fit in a truck.
*
* @author  Mr. Riscalas
* @version 1.0
* @since   2023-02-16
*/

public final class Logging {
    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private Logging() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     *
     */
    public static void main(final String[] args) {
        // Create the constants
        final double[] sizes = {0.25, 0.5, 1.0};
        final double defaultMass = 20.0;
        final double maxMass = 1100.0;
        // Created a scanner object
        final Scanner inputScan = new Scanner(System.in);
        // Ask the user for the size of the logs
        System.out.println("What is the size of the logs?");
        final String logS = inputScan.nextLine();
        // Error catching
        try {
            // try to parse the string to a double type variable
            final double logD = Double.parseDouble(logS);
            // Check if their size is part of the actual size
            if (logD == sizes[0] || logD == sizes[1] || logD == sizes[2]) {
                // Do the actual logic
                final double numberOfLogs = maxMass / (defaultMass * logD);
                System.out.println("The number of logs that can be put on "
                            + "the truck is " + numberOfLogs);
            } else {
                // Print out if they didn't put a default size
                System.out.println("You must enter in a default size: "
                        + sizes[0] + " or "
                        + sizes[1] + " or lastly "
                                      + sizes[2]);
            }
        // catch the error
        } catch (NumberFormatException error) {
            System.out.println("You have entered a string "
                    + "You must enter a real number\n"
                    + error);
        }
        inputScan.close();
    }
}
