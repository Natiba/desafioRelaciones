package desafiorelacionestienda;

import Service.ProductService;
import Service.StoreService;
import java.util.Scanner;

public class DesafioRelacionesTienda {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        StoreService stS = new StoreService();
        ProductService prodS = new ProductService();

        System.out.println("Cuantos prods queres ingresar?");
        int opcionCrearProds = sc.nextInt();

        for (int i = 0; i < opcionCrearProds; i++) {
            prodS.crearProducto();
        }

        System.out.println("---------");
        prodS.mostrarProductos();
        System.out.println("---------");
        prodS.modificarProducto();
        System.out.println("---------");
        prodS.mostrarProductos();
        System.out.println("---------");
        prodS.eliminarProducto();
        System.out.println("---------");
        prodS.mostrarProductos();
        System.out.println("---------");

        System.out.println("Cuántas tiendas queres crear?");
        int opcionCrearTiendas = sc.nextInt();

        for (int i = 0; i < opcionCrearTiendas; i++) {
               stS.crearTienda();
        }
        
     
        stS.mostrarTienda();
        stS.modificarTienda();
        stS.eliminarTienda();
        stS.agregarProducto( prodS.mostrarProductos(),  stS.mostrarTienda().get(1));
        stS.VenderProductos(prodS.mostrarProductos(),  stS.mostrarTienda().get(2));
        stS.eliminarProductos(prodS.mostrarProductos(),  stS.mostrarTienda().get(3));
        stS.StockProductos(stS.mostrarTienda().get(3));
    }

}

//Se necesita una app para una cadena de tiendas en la cual queremos almacenar los distintos productos que 
//venderemos y el precio que tendran,
//Ademas, se necesita que la app cuente con las funciones basicas. (Estas las realizaremos en la clase de servicio)
//Las funciones son basicas son:
//CrearProducto() 
//MostrarProductos() 
//ModificarProducto() 
//EliminarProducto()
// --------------------------------------
//DESAFíO#1
//Una vez realizado el programa:
//- Crear 3 tiendas.
//- Crear 15 productos.
//- Asociar a cada tienda, 5 productos de los creados. (algunos productos pueden repetirse, pero no todos) - 
//Agregar cantidad de stock de cada producto a la tienda
//- Realizar algunas ventas
//- Calcular el stock restante.
//Nota: Agregar o modificar funciones para que se realice correctamente lo que se pide. (Por ejemplo; 
//No se puede vender cierto producto si es que no hay stock.)
// --------------------------------------
//DESAFíO#2
//Intentar llegar al mismo resultado que se logró en equipo, modificando la
//logica del programa que realizaron (sea o no sea más eficiente). Intentar realizar lo mismo de 
//una manera o dos maneras diferentes.
// --------------------------------------
//para documentar:
//1) ¿Cual fue el camino más facil para resolver el problema? 
//Mostrar cual fue el camino logico que pensaron primero, y luego cual fue el alternativo.
//2) ¿Cual de esos caminos fue más eficiente a la hora de ejecutarlo? Recopilar los datos de tiempo de ejecucion, 
//cantidad de codigo escrito, y demás informacion que pueda ser relevante para analizar cual logica fue 
//más eficiente.
// --------------------------------------
//DESAFíO#3
//Realizar pruebas unitarias con JUnit para cada uno de los metodos creados.
//Subir a GitHub todo el proyecto realizado con el grupo.
