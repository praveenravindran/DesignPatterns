package specificationDesignPattern;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter implements Filter<Product> {

    public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
        return items.stream().filter(product -> spec.isSatisfied(product));
    }
}
