import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> employee = new HashMap<>();
        employee.put("営業部", "yamada");
        employee.put("広報部", "sato");
        employee.put("総務部", "kimura");
        employee.put("財務部", "kato");
        System.out.println(employee);

        employee.entrySet().stream()
                .filter(e -> e.getKey().equals("広報部"))
                .forEach(s -> System.out.println("広報部に所属しているのは、" + s.getValue() + "さんです。"));
    }

}
