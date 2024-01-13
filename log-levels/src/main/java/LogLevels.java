import java.lang.String;

public class LogLevels {

    public static String message(String logLine) {
        String[] split_logLine = logLine.split(":");

        return split_logLine[1].trim();
    }

    public static String logLevel(String logLine) {
        if (logLine.contains("ERROR")) {
            return "error";
        }
        else if (logLine.contains("WARNING")) {
            return "warning";
        }
        else if (logLine.contains("INFO")) {
            return "info";
        }
        else {
            return "log level not found";
        }
    }

    public static String reformat(String logLine) {
        String[] split_logLine = logLine.split(":");
        String[] trimmed_logLine = new String[split_logLine.length];

        for (int i = 0; i < split_logLine.length; i++) {
            trimmed_logLine[i] = split_logLine[i].trim();
        }

        String logLevel = trimmed_logLine[0]
                .toLowerCase()
                .replace('[', '(')
                .replace(']', ')');

        return String.format("%s %s", trimmed_logLine[1], logLevel);
    }
}
