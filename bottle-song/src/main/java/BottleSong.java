import java.util.StringJoiner;

class BottleSong {

    String recite(int startBottles, int takeDown) {
        StringBuilder result = new StringBuilder();

        for (int i = startBottles; i > (startBottles - takeDown); i--) {
            String numberOfBottles = convert(startBottles);
            String bottleOrBottles = "";
            if (i == 1)
                bottleOrBottles = "bottle";
            else
                bottleOrBottles = "bottles";

            result.append(numberOfBottles).append(" green ").append(bottleOrBottles).append(" hanging on the wall,\n");
            result.append(numberOfBottles).append(" green ").append(bottleOrBottles).append(" hanging on the wall,\n");
            result.append("And if one green bottle should accidentally fall,\n");

            if (startBottles == 1)
                result.append("There'll be no green bottles hanging on the wall.");
            else
                result.append("There'll be ")
                        .append(convert(startBottles-1).toLowerCase())
                        .append(" green ").append(bottleOrBottles)
                        .append(" hanging on the wall.");
        }

        result.append("\n");
        return result.toString();
    }

    /**
     *
     * @param number Number as integer.
     * @return Integer as a String, from "One" to "Ten".
     */
    private String convert(int number) {
        return switch (number) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            case 10 -> "Ten";
            default -> "Error";
        };
    }
}