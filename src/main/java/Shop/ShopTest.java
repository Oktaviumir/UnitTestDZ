package Shop;

import java.util.*;
import static org.assertj.core.api.Assertions.*;

public class ShopTest {

    public static void main(String[] args) {
        Shop testShop = new Shop();
        testShop.setProducts(getShuffleListProducts(getTestListProducts()));
// проверяем утверждение, что магазин хранит верное количество продуктов
        assertThat(testShop.getProducts()).hasSize(4);
// проверяем утверждение, что магазин возвращает самый дорогой продукт
        assertThat(testShop.getMostExpensiveProduct().getProductName()).isEqualTo(getTestListProducts().get(3)
                .getProductName());
// проверяем утверждения, что магазин верно сортирует список продуктов
        assertThat(testShop.sortProductsByPrice().get(0).getCost()).isEqualTo(90);
        assertThat(testShop.sortProductsByPrice().get(1).getCost()).isEqualTo(170);
        assertThat(testShop.sortProductsByPrice().get(2).getCost()).isEqualTo(299);
        assertThat(testShop.sortProductsByPrice().get(3).getCost()).isEqualTo(600);

    }

    //    метод для создания списка продуктов
    static List<Product> getTestListProducts() {

        Product productA = new Product();
        productA.setProductName("A");
        productA.setCost(90);

        Product productB = new Product();
        productB.setProductName("B");
        productB.setCost(170);

        Product productC = new Product();
        productC.setProductName("C");
        productC.setCost(299);

        Product productD = new Product();
        productD.setProductName("D");
        productD.setCost(600);

        List<Product> productList = new ArrayList<>();

        productList.add(productA);
        productList.add(productB);
        productList.add(productC);
        productList.add(productD);

        return productList;
    }

    //    метод перемешивает продукты в нашем списке
    static List<Product> getShuffleListProducts(List<Product> productList) {
        Collections.shuffle(productList);
        return productList;
    }

}