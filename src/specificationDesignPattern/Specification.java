package specificationDesignPattern;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
