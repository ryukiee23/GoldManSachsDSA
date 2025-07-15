package ReferenceList;

public class Direction {

    public static int[] finalCoordinates(int startX, int startY, String moves) {
        int x = startX;
        int y = startY;

        if (moves == null || moves.trim().isEmpty()) {
            return new int[]{x, y};
        }

        String[] tokens = moves.trim().split("\\s+");

        for (String token : tokens) {
            int multiplier = 1;
            String direction;

            if (token.contains("x") || token.contains("X")) {
                String[] parts = token.split("[xX]", 2);
                try {
                    multiplier = Integer.parseInt(parts[0]);
                } catch (NumberFormatException e) {
                    multiplier = 1;
                }
                direction = parts[1];
            } else {
                direction = token;
            }

            direction = direction.toUpperCase();

            // Map directions to coordinate changes
            switch (direction) {
                case "U":
                case "UP":
                    y += multiplier;
                    break;
                case "D":
                case "DOWN":
                    y -= multiplier;
                    break;
                case "L":
                case "LEFT":
                    x -= multiplier;
                    break;
                case "R":
                case "RIGHT":
                    x += multiplier;
                    break;
                default:
                    for (char ch : direction.toCharArray()) {
                        switch (ch) {
                            case 'U':
                                y += 1;
                                break;
                            case 'D':
                                y -= 1;
                                break;
                            case 'L':
                                x -= 1;
                                break;
                            case 'R':
                                x += 1;
                                break;
                            default:
                                // ignore invalid chars
                        }
                    }
                    break;
            }
        }
        return new int[]{x, y};
    }

    public static void main(String[] args) {
        int[] res1 = finalCoordinates(0, 0, "UUU");
        System.out.println("(" + res1[0] + "," + res1[1] + ")");

        int[] res2 = finalCoordinates(0, 0, "URRDDL");
        System.out.println("(" + res2[0] + "," + res2[1] + ")");

        int[] res3 = finalCoordinates(0, 0, "DOWN UP 2xRIGHT DOWN 3xLEFT");
        System.out.println("(" + res3[0] + "," + res3[1] + ")"); 
    }
}
