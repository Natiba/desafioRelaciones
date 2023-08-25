
package Entity;

public class Product {
    
    private int idProduct;
    private String name;
    private double price;

    public Product() {
    }

    public Product(int idProduct, String name, double price) {
        this.idProduct = idProduct;
        this.name = name;
        this.price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product { \n"
                +  "idProducto: " + idProduct  + "\n"
                +  " nombre: " + name + "\n"
                + " precio: " + price + "\n"
                + " } \n";
    }
    
}

//Cada producto tiene que tener como atributos: id, nombre, y debe tener asociado un precio.