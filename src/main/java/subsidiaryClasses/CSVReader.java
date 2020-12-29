package subsidiaryClasses;

import java.util.List;

public class CSVReader {
    private String filePath;
    private List<List<String>> values;

    public CSVReader(String filePath)
    {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return this.filePath;
    }
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public List<String> getRow(int index) {
        return this.values.get(index);
    }
}
