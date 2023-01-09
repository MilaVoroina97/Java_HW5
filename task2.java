import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
public class task2 {
    //  Пусть дан список сотрудников: ,,*... Написать программу, которая найдет и выведет повторяющиеся имена с количеством 
    // повторений. Отсортировать по убыванию популярности.

    public static void main(String[] args) {
        Map<String, Integer> employees = new HashMap<>();
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Иван Иванов ",
        "Светлана Петрова" ,
        "Кристина Белова" ,
        "Анна Мусина" ,
        "Анна Крутова" ,
        "Иван Юрин" ,
        "Петр Лыков" ,
        "Павел Чернов" ,
        "Петр Чернышов" ,
        "Мария Федорова" ,
        "Марина Светлова" ,
        "Мария Савина" ,
        "Мария Рыкова" ,
        "Марина Лугова" ,
        "Анна Владимирова" ,
        "Иван Мечников" ,
        "Петр Петин" ,
        "Иван Ежов",
        "Иван Ежов",
        "Иван Иванов",
        "Иван Иванов",
        "Иван Иванов",
        "Анна Владимирова",
        "Анна Владимирова",
        "Марина Светлова",
        "Марина Светлова",
        "Марина Светлова",
        "Марина Светлова",
        "Марина Светлова",
        "Марина Светлова",
        "Иван Мечников",
        "Иван Мечников",
        "Иван Мечников",
        "Иван Мечников",
        "Марина Лугова",
        "Марина Лугова",
        "Марина Лугова" ));
        for(String name : names){
            if(employees.get(name) == null){
                employees.put(name,1);
            }else{
                employees.put(name, employees.get(name)+1);
            }
        }
        for(Map.Entry<String, Integer> elem : employees.entrySet()){
            System.out.println(elem.getKey() + ":" + elem.getValue());
        }

        Map<String,Integer> sortedEmployees = new LinkedHashMap<>();
        int max = 1;
        for(int num : employees.values()){
            if(num > max) max = num;
        }

        for(int i = max ; i > 0; i --){
            for(Map.Entry<String,Integer> temp : employees.entrySet() ){
                String key = temp.getKey();
                if(employees.get(key) == i) sortedEmployees.put(key,employees.get(key));
            }
        }

        System.out.println(sortedEmployees);
    }
}


