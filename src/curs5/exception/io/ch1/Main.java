package curs5.exception.io.ch1;

public class Main {
    public  static void main(String[] args){
        PhoneBook pb=new curs5.exception.io.ch1.PhoneBook("src/curs5/io/ch1/input.txt");
        System.out.println(pb.getContactByName("Abbey"));
        System.out.println(pb.getContactByName("Abdul"));
    }
}
