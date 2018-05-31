package specificationDesignPattern;

import com.sun.tools.javac.util.List;

public class Demo {

    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> products = List.of(apple, tree, house);
        ProductFilter filter = new ProductFilter();

        filter.filter(products, new ColorSpecification(Color.GREEN)).forEach(product -> System.out.println(" - " +
                product.getName() + " is green "));

        filter.filter(products, new SizeSpecification(Size.LARGE)).forEach(product -> System.out.println(" - " +
                product.getName() + " is Large"));

        filter.filter(products, new CombineSpecifications<>(new ColorSpecification(Color.BLUE),
                new SizeSpecification(Size.LARGE))).forEach(product ->
                System.out.println(" - " + product.getName() + " is Green and Large"));
    }


}
