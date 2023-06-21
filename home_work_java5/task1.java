package home_work_java5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся 
// имена с разными телефонами, их необходимо считать, как одного человека с разными телефонами. 
// Вывод должен быть отсортирован по убыванию числа телефонов.
// Пример:
// Иванов 1231234
// Иванов 3456345
// Иванов 5676585
// Петров 12345
// Петров 82332

public class task1 {
     public static void main(String[] args) {
         Map<String, List<String>> phoneBook = new HashMap<>();
         phoneBook.put("Иван Иванов", Arrays.asList("181-811", "262-225"));
         phoneBook.put("Светлана Петрова", Collections.singletonList("433-303"));
         phoneBook.put("Кристина Белова", Collections.singletonList("344-344"));
         phoneBook.put("Анна Мусина", Collections.singletonList("545-587"));
         phoneBook.put("Анна Крутова", Collections.singletonList("612-426"));
         phoneBook.put("Иван Юрин", Collections.singletonList("731-957"));
         phoneBook.put("Петр Лыков", Collections.singletonList("158-887"));
         phoneBook.put("Павел Чернов", Collections.singletonList("699-399"));
         phoneBook.put("Петр Чернышов", Arrays.asList("987-874", "113-552"));
         phoneBook.put("Мария Федорова", Collections.singletonList("811-722"));
         phoneBook.put("Марина Светлова", Collections.singletonList("538-444"));
         phoneBook.put("Мария Савина", Collections.singletonList("359-666"));
         phoneBook.put("Мария Рыкова", Collections.singletonList("737-811"));
         phoneBook.put("Марина Лугова", Arrays.asList("566-442", "753-275"));
         phoneBook.put("Анна Владимирова", Collections.singletonList("141-033"));
         phoneBook.put("Иван Мечников", Collections.singletonList("202-404"));
         phoneBook.put("Петр Петин", Collections.singletonList("330-550"));
         phoneBook.put("Иван Ежов", Collections.singletonList("454-656"));

         Map<String, Integer> nameCount = new HashMap<>();
         for (String name : phoneBook.keySet()) {
             String firstName = name.split(" ")[0];
             nameCount.put(firstName, nameCount.getOrDefault(firstName, 0) + 1);
         }

         List<Map.Entry<String, Integer>> sortedNames = new ArrayList<>(nameCount.entrySet());
         Collections.sort(sortedNames, Map.Entry.<String, Integer>comparingByValue().reversed());

         for (Map.Entry<String, Integer> entry : sortedNames) {
             if (entry.getValue() >= 1) {
                 System.out.println(entry.getKey() + ": " + entry.getValue());
             }
         }
     }
}
