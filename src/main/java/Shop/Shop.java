package Shop;

import java.util.Collections;
import java.util.List;

public class Shop {
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    //    метод sortProductsByPrice() сортирует список продуктов по стоимости (по возрастанию)
    public List<Product> sortProductsByPrice() {
        Collections.sort(products);
        return products;
    }

    //    метод getMostExpensiveProduct() возвращает самый дорогой продукт
    public Product getMostExpensiveProduct() {
        return sortProductsByPrice().get(products.size() - 1);
    }


}