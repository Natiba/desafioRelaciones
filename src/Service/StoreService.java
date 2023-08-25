package Service;

import Entity.Product;
import Entity.Store;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

public class StoreService {

    ArrayList<Store> listaTiendas = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void crearTienda() {

        UUID uuid = UUID.randomUUID();
        Store t = new Store();

        //System.out.println("Ingrese el id");
        t.setIdTienda(uuid);

        System.out.println("Ingrese la dirección");
        t.setDireccion(sc.next());

        System.out.println("Ingrese el nombre del representante");
        t.setRepresentanteDeLaTienda(sc.next());

        listaTiendas.add(t);
        //return t;
    }

    public ArrayList<Store> mostrarTienda() {
        return this.listaTiendas;
    }

    public void modificarTienda() {
        System.out.println("Ingrese el id de tienda a modificar");
        System.out.println(mostrarTienda());
        System.out.println("Elija una tienda \n"
                + "0.Tienda 1 \n"
                + "1. Tienda 2 \n"
                + "2. Tienda 3 \n");
        int opcionTienda = sc.nextInt();
        sc.nextLine();
        // this.listaTiendas.get(opcionTienda).getIdTienda();
        UUID mod = this.listaTiendas.get(opcionTienda).getIdTienda();
        for (Store t : this.listaTiendas) {
            if (t.getIdTienda() == mod) {
                System.out.println("Que quiere modificar, ingrese 1 para dirección o 2 para representante");
                int opc = sc.nextInt();
                sc.nextLine();
                switch (opc) {
                    case 1:
                        System.out.println("ingrese la nueva dirección");
                        System.out.println("El nombre anterior era" + t.getDireccion());
                        t.setDireccion(sc.next());
                        System.out.println("El nombre nuevo es" + t.getDireccion());
                        break;
                    case 2:
                        System.out.println("ingrese el nuevo representante");
                        System.out.println("El representante anterior era" + t.getRepresentanteDeLaTienda());
                        t.setRepresentanteDeLaTienda(sc.next());
                        System.out.println("El representante nuevo es" + t.getRepresentanteDeLaTienda());
                        break;
                    default:
                        System.out.println("No ha ingresado una opción válida /n");

                }
            }
        }
    }

    public void eliminarTienda() {
        System.out.println("Ingrese el id de la tienda a eliminar");
        System.out.println(mostrarTienda());
        UUID mod = this.listaTiendas.get(sc.nextInt()).getIdTienda();
        sc.nextLine();
        for (Store t : this.listaTiendas) {
            if (t.getIdTienda() == mod) {
                this.listaTiendas.remove(t);
                System.out.println("La tienda " + mod + " se eliminó correctamente");
                break;
            }
        }
    }

    public void agregarProducto(ArrayList<Product> p, Store t) {
        System.out.println("Que producto quiere agregar, ingrese el id");
        System.out.println(p);
        int idProd = sc.nextInt();
        sc.nextLine();
        for (Product producto : p) {
            if (producto.getIdProduct() == idProd) {
                System.out.println("Ingrese la cantidad del producto");
               Integer qty = sc.nextInt();
               sc.nextLine();
                t.getListaDeProductos().put(producto, qty);
            }
        }

    }
    
    public void VenderProductos(ArrayList<Product> p, Store t) {
        System.out.println("Que producto quiere vender, ingrese el id");
        System.out.println(p);
        int idProd = sc.nextInt();
         for (Product producto : p) {
            if (producto.getIdProduct() == idProd) {
                System.out.println("Ingrese la cantidad del producto que queres vender");
                int qty = sc.nextInt();
                sc.nextLine();
                int cantidadProd = t.getListaDeProductos().get(producto);
                
                if (cantidadProd >= qty) {
                    t.getListaDeProductos().put(producto, cantidadProd - qty);
                    System.out.println("Se vendieron " + qty + " productos");
                    System.out.println("Quedan " + t.getListaDeProductos().get(producto));
                } else {
                    System.out.println("No hay suficiente cantidad de productos para realizar esa venta");
                }
            }
        }
    }
    
    public void eliminarProductos(ArrayList<Product> p, Store t) {
        System.out.println("Que producto quiere eliminar, ingrese el id");
        System.out.println(p);
        int idProd = sc.nextInt();
        sc.nextLine();
        boolean bandera = true;
         for (Product producto : p) {
            if (producto.getIdProduct() == idProd) {
                 t.getListaDeProductos().remove(producto);
                System.out.println("El producto " + idProd + " ha sido eliminado correctamente");
                bandera = !bandera;
            } 
        }
         if (bandera) {
             System.out.println("El producto " + idProd + " no fue eliminado, no estaba en la lista");
         }
    }
    
    public void StockProductos(Store t) {
        
        for (Map.Entry<Product, Integer> entry : t.getListaDeProductos().entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            
            System.out.println(key.toString());
            System.out.println("Entry " + entry.getKey());
            
             System.out.println(key.toString());
            System.out.println("Hay " + entry.getValue() + " productos");
            
        }
        
    }
    
}

//Las funciones de la tienda son:
//CrearTienda()
//MostrarTiendas()
//ModificarTienda()
//EliminarTienda()
//Además:
//AgregarProductos(): Agrega el producto elegido y la cantidad. 
//VenderProductos(): Vende cierta cantidad del producto. 
//EliminarProductos(): Elimina el Producto de esa tienda. 
//StockProductos(): Nos devuelve cuantos productos hay.
//Nota:
//- Cada tienda tendrá una lista de productos diferentes con sus respectivos stocks.
