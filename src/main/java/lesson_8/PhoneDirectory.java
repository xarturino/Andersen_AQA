package lesson_8;

import java.util.HashMap;
import java.util.Map;

public class PhoneDirectory {

    String surname;
    String number;

    Map<Object, Object> phoneDirectory = new HashMap<>();

    void add(String number,String surname){
        this.surname = surname;
        this.number = number;
        phoneDirectory.put(number,surname);
    }

    void phoneDirectoryInfo(){
        System.out.println(phoneDirectory.toString());
    }

    void get(String surname){
        this.surname = surname;
        for (Map.Entry<Object, Object> entry : phoneDirectory.entrySet()) {
            if (entry.getValue().equals(surname)){
                System.out.println("Surname: " + surname + " and the number is " + entry.getKey());
            }
        }
    }
}



class PhoneDirectoryTest {
    public static void main(String[] args) {

        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add("+98765","Simons");
        phoneDirectory.add("+32567","Jackson");
        phoneDirectory.add("+48627","Svenson");
        phoneDirectory.add("+98254","Simons");
        phoneDirectory.phoneDirectoryInfo();
        phoneDirectory.get("Simons");
        phoneDirectory.get("Jackson");

}
}
