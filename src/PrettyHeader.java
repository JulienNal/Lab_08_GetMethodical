public class PrettyHeader {
    public static void prettyHeader(String msg) {
        final int WIDTH = 60;
        final int SIDE_STARS = 3;
        final int INNER_WIDTH = WIDTH - (SIDE_STARS * 2); // 54

        // Top row of stars
        for (int i = 0; i < WIDTH; i++) {
            System.out.print('*');
        }
        System.out.println();

        // Ensure message fits the inner area
        if (msg.length() > INNER_WIDTH) {
            msg = msg.substring(0, INNER_WIDTH);
        }

        // Calculate padding to center the message
        int leftPad = (INNER_WIDTH - msg.length()) / 2;
        int rightPad = INNER_WIDTH - msg.length() - leftPad;

        // Middle row: 3 stars, left spaces, message, right spaces, 3 stars
        for (int i = 0; i < SIDE_STARS; i++) System.out.print('*');
        for (int i = 0; i < leftPad; i++) System.out.print(' ');
        System.out.print(msg);
        for (int i = 0; i < rightPad; i++) System.out.print(' ');
        for (int i = 0; i < SIDE_STARS; i++) System.out.print('*');
        System.out.println();

        // Bottom row of stars
        for (int i = 0; i < WIDTH; i++) {
            System.out.print('*');
        }
        System.out.println();
    }

    public static void main(String[] args) {
        prettyHeader("Message Centered Here");
    }
}
