package Entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Store {

    private UUID idTienda;
    // private ArrayList <Product> listaDeProductos;
    private HashMap<Product, Integer> listaDeProductos = new HashMap<>();
    private String direccion;
    private String representanteDeLaTienda;

    public Store() {
    }

    public Store(UUID idTienda, String direccion, String representanteDeLaTienda) {
        this.idTienda = idTienda;
        this.direccion = direccion;
        this.representanteDeLaTienda = representanteDeLaTienda;
    }

    public UUID getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(UUID idTienda) {
        this.idTienda = idTienda;
    }

    public HashMap<Product, Integer> getListaDeProductos() {
        return listaDeProductos;
    }

    public void setListaDeProductos(HashMap<Product, Integer> listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRepresentanteDeLaTienda() {
        return representanteDeLaTienda;
    }

    public void setRepresentanteDeLaTienda(String representanteDeLaTienda) {
        this.representanteDeLaTienda = representanteDeLaTienda;
    }

    @Override
    public String toString() {
        return "Store{" + "idTienda=" + idTienda + ", listaDeProductos=" + listaDeProductos + ", direccion=" + direccion + ", representanteDeLaTienda=" + representanteDeLaTienda + '}';
    }
    
}

//La app, tambien debe contener las diferentes tiendas. Cada tienda, tendrá como atributos: ID de tienda, 
//Lista de productos, direccion, representante de la tienda.
//Las funciones de la tienda son:
//CrearTienda()
//MostrarTiendas()
//ModificarTienda()
//EliminarTienda()
//Además:
//AgregarProductos(): Agrega el producto elegido y la cantidad. VenderProductos(): Vende cierta cantidad 
//del producto. EliminarProductos(): Elimina el Producto de esa tienda. StockProductos(): Nos devuelve 
//cuantos productos hay.
//Nota:
//- Cada tienda tendrá una lista de productos diferentes con sus respectivos stocks.
