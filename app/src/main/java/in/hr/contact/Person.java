package in.hr.contact;

// this is a modal class which will provide data to our Adapter in the future
public class Person {
    private  String name;
    private  String number;
    private  String text;
    // create constructor to set and get the values

    public Person(String name, String number, String text) {
        this.name = name;
        this.number = number;
        this.text = text;
    }

    //generate getter and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
