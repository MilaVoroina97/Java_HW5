import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task1 {
    //Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
    public static HashMap<String,ArrayList<Integer>> phonenumber = new HashMap<String,ArrayList<Integer>>();
    public static void main(String[] args) {
        addToThePhoneNumber("Ivanov", 123);
        addToThePhoneNumber("Ivanov", 456);
        addToThePhoneNumber("Ivanov", 789);
        addToThePhoneNumber("Aleksandrov", 111);
        addToThePhoneNumber("Aleksandrov", 113);
        addToThePhoneNumber("Aleksandrov", 114);
        for(Map.Entry<String,ArrayList<Integer>> item : phonenumber.entrySet()){
            System.out.println(item.getKey());
            System.out.println(item.getValue());
        }
        System.out.println(phonenumber);
   
    }

    public static void addToThePhoneNumber(String key,int value){
        if(phonenumber.containsKey(key)){
            phonenumber.get(key).add(value);
        }else{
            ArrayList<Integer> phones = new ArrayList<>();
            phones.add(value);
            phonenumber.put(key,phones);
        }
    }
}
