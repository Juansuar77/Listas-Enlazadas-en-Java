package umg.edu.progra.listas;

/**
 *
 * @author Walter Cordova
 */
public class Principal {

    public static void main(String[] args) {

        Lista lista = new Lista();
        lista.insertarCabezaLista(1);
        lista.insertarCabezaLista(2);
        lista.insertarCabezaLista(3);
        lista.insertarCabezaLista(4);
        lista.insertarCabezaLista(5);
        lista.insertarCabezaLista(6);

        lista.visualizar();        

        System.out.println("\n");
        System.out.println("primero: " + lista.leerPrimero());

        lista.eliminar(3);
        System.out.println("lista: " + lista);

        System.out.println("\n");

        Nodo dato = lista.buscarLista(4);  
        System.out.println("dato: " + dato);

        lista.insertarLista(dato, 10);
        System.out.println("lista " + lista);

        dato = lista.buscarLista(5);        
        System.out.println("dato " + dato);
        lista.insertarLista(dato, 600);

        System.out.println("lista " + lista);

        lista.visualizar();

        // Ejercicio 1: Ordenar la lista
        System.out.println("\n\n--- Ejercicio 1: Ordenar lista ---");
        lista.ordenarAscendente();
        lista.visualizar();

        // Ejercicio 2: Unir con lista2
        System.out.println("\n\n--- Ejercicio 2: Unir con lista2 ---");
        Lista lista2 = new Lista();
        lista2.insertarCabezaLista(9);
        lista2.insertarCabezaLista(7);
        lista2.insertarCabezaLista(8);

        System.out.print("Lista 2: ");
        lista2.visualizar();

        lista.unirLista(lista2);

        System.out.print("Lista unida: ");
        lista.visualizar();

        // Ejercicio 3: Separar pares e impares
        System.out.println("\n\n--- Ejercicio 3: Separar pares e impares ---");
        Lista pares = new Lista();
        Lista impares = new Lista();

        lista.separarParesImpares(pares, impares);

        System.out.print("Lista de pares: ");
        pares.visualizar();

        System.out.print("\nLista de impares: ");
        impares.visualizar();
    }
}
