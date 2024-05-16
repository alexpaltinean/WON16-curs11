import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ContainerClass c = new ContainerClass(12);
        ContainerClass.NestedClass nestedClass = new ContainerClass.NestedClass(34);
        ContainerClass.InnerClass innerClass = c.new InnerClass(23);


        Map<String, String> map = new HashMap<>();
        map.put("a", "apple");
        map.put("b", "blueberries");
        //...

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
