package specificationDesignPattern;

import java.util.List;

public class CombineSpecifications <T> implements Specification<T> {
    private Specification<T>first, second;

    public CombineSpecifications(Specification<T> first, Specification<T> second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean isSatisfied(T item) {
        return first.isSatisfied(item) && second.isSatisfied(item);
    }
}
