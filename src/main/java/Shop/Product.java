package Shop;

public class Product implements Comparable<Product> {
    private Integer cost;
    private String productName;

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    //    упорядочиваем объекты, сравнивая их между собой
    @Override
    public int compareTo(Product product) {
        return this.getCost().compareTo(product.getCost());
    }
}