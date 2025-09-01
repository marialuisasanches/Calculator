import java.util.ArrayList;

public class History {

    private ArrayList<String> record = new ArrayList<>();

    public void addRecord(String operation) {
        this.record.add(operation);
    }

    public void showRecord() {
        for (String operation : record) {
            System.out.println(operation);
        }
    }

    public void removeRecord(String operation) {
        this.record.remove(operation);
    }

    public void cleanRecord() {
        this.record.clear();
    }
}
