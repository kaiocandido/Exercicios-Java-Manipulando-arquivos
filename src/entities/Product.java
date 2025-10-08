package entities;

public class Product {
    private String name;
    private Double price;
    private Integer qntd;

    public Product(){

    }

    public Product(String name, Double price, Integer qntd) {
        this.name = name;
        this.price = price;
        this.qntd = qntd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQntd() {
        return qntd;
    }

    public void setQntd(Integer qntd) {
        this.qntd = qntd;
    }

    public double total(){
        return price * qntd;
    }


}
