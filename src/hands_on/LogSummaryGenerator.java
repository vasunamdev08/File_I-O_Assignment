package hands_on;

import java.io.*;
import java.nio.file.*;
import java.util.List;

public class LogSummaryGenerator {

    public static void main(String[] args) {
        // Check for correct number of command-line arguments
        String inputFile ;
        String outputFile;

        if (args.length != 2) {
            inputFile = "src/server.log"; // Default input file
            outputFile = "src/summary.txt"; // Default output file
        }else{
            inputFile = args[0];
            outputFile = args[1];
        }



        int total = 0;
        int errorCount = 0;
        int warningCount = 0;

        // Read all lines from the input file
        try {
            List<String> lines = Files.readAllLines(Paths.get(inputFile));

            for (String line : lines) {
                total++;
                if (line.contains("ERROR")) {
                    errorCount++;
                } else if (line.contains("WARNING")) {
                    warningCount++;
                }
            }

            // Prepare the output content
            StringBuilder report = new StringBuilder();
            report.append("Log Summary Report\n");
            report.append("------------------\n");
            report.append("Total log entries: ").append(total).append("\n");
            report.append("ERROR entries: ").append(errorCount).append("\n");
            report.append("WARNING entries: ").append(warningCount).append("\n");

            // Bonus: calculate and add percentages
            if (total > 0) {
                double errorPercent = (errorCount * 100.0) / total;
                double warningPercent = (warningCount * 100.0) / total;
                report.append(String.format("ERROR percentage: %.2f%%\n", errorPercent));
                report.append(String.format("WARNING percentage: %.2f%%\n", warningPercent));
            }

            // Write the report to the output file using BufferedWriter (with try-with-resources)
            try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFile))) {
                writer.write(report.toString());
            }

            System.out.println("Log summary written to: " + outputFile);

        } catch (IOException e) {
            System.err.println("Error reading/writing file: " + e);
        }
    }
}

