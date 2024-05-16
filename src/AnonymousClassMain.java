import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class AnonymousClassMain {
    public static void main(String[] args) {
        ContainerClass c = new ContainerClass(2);
        List<String> list = new ArrayList<>();

        Function<String, String> f = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s;
            }
        };


    }
}
