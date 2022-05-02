package lesson_7;

import java.io.*;
import java.nio.file.Path;

public class AppData {

    private final String[] header;
    private final int[][] data;


    AppData(String[] header, int[][] data) {
        this.data = data;
        this.header = header;
    }

    void saveDataInCsv(AppData data) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.csv"));
        StringBuilder sb = new StringBuilder();
        for (String header : data.header) {
            sb.append(header);
            sb.append(";");
        }
        sb.append("\n");
        for (int i = 0; i < data.data.length; i++) {
            for (int k = 0; k < data.data[i].length; k++) {
                sb.append(data.data[i][k]).append(";");
            }
            sb.append("\n");
        }
        bufferedWriter.write(sb.toString());
        System.out.println("CSV file is save in " + Path.of("C:\\Users\\anduser\\IdeaProjects\\Andersen_AQA\\test.csv"));
        bufferedWriter.close();
    }

    void readCsvFile(FileReader fileReader) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("test.csv"));
        String rowOfCSV = bufferedReader.readLine();
        while (rowOfCSV != null) {
            System.out.println(rowOfCSV);
            rowOfCSV = bufferedReader.readLine();
        }
    }
}

class AppDataTest {
    public static void main(String[] args) throws IOException {
        AppData csv = new AppData(new String[]{"Value", "Value", "Value"}, new int[][]{{1, 2, 3}, {1, 2, 3}});
        csv.saveDataInCsv(csv);
        csv.readCsvFile(new FileReader("test.csv"));
    }
}
