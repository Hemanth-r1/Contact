package in.hr.contact;

public class ListGetSet {
    private String textNameSQL;
    private String textNumberSQL;
    private String textViewSQL;
    // create constructor to set and get the values

    public ListGetSet(String textNameSQL, String textNumberSQL, String textSQL) {
        this.textNameSQL = textNameSQL;
        this.textNumberSQL = textNumberSQL;
        this.textViewSQL = textSQL;
    }

    //generate getter and setters

    public String getTextNameSQL() {
        return textNameSQL;
    }

    public void setTextNameSQL(String textNameSQL) {
        this.textNameSQL = textNameSQL;
    }

    public String getTextNumberSQL() {
        return textNumberSQL;
    }

    public void setTextNumberSQL(String textNumberSQL) {
        this.textNumberSQL = textNumberSQL;
    }

    public String getTextViewSQL() {
        return textViewSQL;
    }
    public void setTextViewSQL(String textViewSQL) {
        this.textViewSQL = textViewSQL;
    }
}
