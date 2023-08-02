package FunctionalPracticalExc;

public class Product {
    private String  name;
    private double cost;
    private String category;
    private int stock;

    public Product(String name, double cost, String category, int stock) {
        this.name = name;
        this.cost = cost;
        this.category = category;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getTotalCost(){
        double totalCost = stock*cost;
        return totalCost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", category='" + category + '\'' +
                ", stock=" + stock +
                '}';
    }
}
