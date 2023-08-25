package Service;

import Entity.Product;
import Entity.Store;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ProductService {

    private ArrayList<Product> listaProductos = new ArrayList<>();
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    int sumarId = 1;
 
    public void crearProducto() {

        Product p = new Product();
       
        //System.out.println("Ingrese el id");
        p.setIdProduct(sumarId);
        sumarId ++;

        System.out.println("Ingrese el nombre");
        p.setName(sc.next());

        System.out.println("Ingrese el precio");
        p.setPrice(sc.nextDouble());

        listaProductos.add(p);
        //return p;
    }

    public ArrayList<Product> mostrarProductos() {
        return this.listaProductos;

    }

    public void modificarProducto() {

        System.out.println("Que producto desea modificar? Ingrese ID");
        System.out.println(mostrarProductos());
        int auxId = sc.nextInt();
        for (Product p : this.listaProductos) {
            if (p.getIdProduct() == auxId) {
                System.out.println("Ingrese opcion a modificar: \n");
                System.out.println("1. Nombre \n"
                        + "2. Precio \n");
                int opc = sc.nextInt();

                switch (opc) {
                    case 1:
                        System.out.println("ingrese el nuevo nombre \n");
                        System.out.println("El nombre anterior era " + p.getName());
                        p.setName(sc.next());
                        System.out.println("El nombre nuevo es " + p.getName());
                        break;
                    case 2:
                        System.out.println("ingrese el nuevo precio");
                        System.out.println("El precio anterior era " + p.getPrice());
                        p.setPrice(sc.nextDouble());
                        System.out.println("El precio nuevo es " + p.getPrice());
                        break;
                    default:
                        System.out.println("No ha ingresado una opción válida");

                }

            }

        }
    }

    public void eliminarProducto() {

        System.out.println("Que producto desea eliminar? Ingrese ID");
        System.out.println(mostrarProductos());
        int auxId = sc.nextInt();

        Iterator<Product> it = listaProductos.iterator();
        while (it.hasNext()) {
            if (it.next().getIdProduct() == auxId) {
                it.remove();
            }
        }
        System.out.println(mostrarProductos());
    }

}

//Las funciones son basicas son:
//CrearProducto() 
//MostrarProductos() 
//ModificarProducto() 
//EliminarProducto()
