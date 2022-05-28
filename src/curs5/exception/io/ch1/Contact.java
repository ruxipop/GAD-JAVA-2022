package curs5.exception.io.ch1;

public class Contact {
    private String name;
    private String number;



    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
