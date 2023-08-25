package desafiorelacionestienda;

import Service.ProductService;
import Service.StoreService;
import java.util.Scanner;

public class DesafioRelacionesTienda {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        StoreService stS = new StoreService();
        ProductService prodS = new ProductService();
  
          System.out.println("Primero vamos a crear 3 tiendas");
          
           for (int i = 0; i < 3; i++) {
                        stS.crearTienda();
                        
                         System.out.println("Acá vamos a crear 15 productos para cada tienda");
        
          for (int j = 0; j < 3; j++) {
                        prodS.crearProducto();
                    }
                        
                    }
          
        int opcionMenu = 0;

//        System.out.println("MENU: \n"
//                + "1. Crear 15 Productos \n"
//                + "2. Crear 3 tiendas \n"
//                + "3. Salir del menú");
        do {

            System.out.println("\n Ingrese opción del Menú \n");

                System.out.println("MENÚ: \n"
                        + "1. Mostrar listado de productos \n"
                        + "2. Modificar un producto \n"
                        + "3. Eliminar un producto \n"
                        + "4. Mostrar Listado de Tiendas \n"
                        + "5. Modificar una Tienda\n"
                        + "6. Eliminar una Tienda \n"
                        + "7. Agregar Productos en determinada Tienda \n"
                        + "8. Vender Productos en determinada Tienda \n"
                        + "9. Eliminar Productos en determinada Tienda \n"
                        + "10. Chequear Stock de Productos en determinada Tienda \n"
                        + "11. Salir del menú");

            opcionMenu = sc.nextInt();

            switch (opcionMenu) {
                case 1:
                    System.out.println( prodS.mostrarProductos());
                    break;
                case 2:
                   prodS.modificarProducto();
                    break;
                case 3:
                    prodS.eliminarProducto();
                    break;
                case 4:
                    System.out.println(stS.mostrarTienda());
                    break;
                case 5:
                    stS.modificarTienda();
                    break;
                case 6:
                    stS.eliminarTienda();
                    break;
                case 7:
                     stS.agregarProducto(prodS.mostrarProductos(), stS.mostrarTienda().get(0)); // recordar q empiezan en 0
                    break;
                case 8:
                     stS.VenderProductos(prodS.mostrarProductos(), stS.mostrarTienda().get(1));  // recordar q empiezan en 0
                    break;
                case 9:
                    stS.eliminarProductos(prodS.mostrarProductos(), stS.mostrarTienda().get(2));  // recordar q empiezan en 0
                    break;
                case 10:
                    stS.StockProductos(stS.mostrarTienda().get(2));  // recordar q empiezan en 0
                    break;
                case 11:
                   System.exit(0);
                    break;
                default:
                    System.out.println("Ingresar una opción válida, por favor");
            }
        } while (opcionMenu != 11);
        
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
