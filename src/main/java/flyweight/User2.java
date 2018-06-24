package flyweight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class User2 {

    public static List<String> commonNames = new ArrayList<>();
    private int[] names;

    public User2(String name) {
        Function<String, Integer> getOrAdd = (String s) -> {
            int index = commonNames.indexOf(s);
            if (index != -1) {
                System.out.println("Getting name from cache " + name);
                return commonNames.indexOf(s);
            } else {
                commonNames.add(s);
                return commonNames.size() - 1;
            }
        };
        names = Arrays.stream(name.split(" ")).
                mapToInt(s -> getOrAdd.apply(s)).toArray();
    }

    public String getFullName()
    {
        return Arrays.stream(names).mapToObj(i -> commonNames.get(i))
                .collect(Collectors.joining(","));
    }

}
