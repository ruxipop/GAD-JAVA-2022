package curs5.exception.io.ch1;

public class PhoneBook {
    Contact[] contacts =new  curs5.exception.io.ch1.Contact[100];
    int count=0;
    public PhoneBook(String inputFile){
        java.util.Scanner s=null;
        String  name;
        String number;
        try {
            s=new java.util.Scanner(new java.io.BufferedReader(new java.io.FileReader(inputFile)));
      while (s.hasNext()){
          name=s.next();
          number=s.next();
          contacts[count++]=new curs5.exception.io.ch1.Contact(name,number);

      }
        } catch (java.io.FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(s!=null) s.close();
        }
    }
   public Contact getContactByName(String name){
        for(int i=0; i<=count;i++){
            if(contacts[i].getName().equals(name)){
                return contacts[i];
            }
        }
        return null;
   }
    @Override
    public String toString() {
        return "PhoneBook{" +
                "contacts=" + java.util.Arrays.toString(contacts) +
                ", count=" + count +
                '}';
    }
}
