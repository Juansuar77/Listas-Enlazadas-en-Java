package umg.edu.progra.listas;

/**
 *
 * @author Walter Cordova
 */
public class Lista {

    private Nodo primero;

    @Override
    public String toString() {
        return "=>" + primero;
    }

    public Lista() {
        primero = null;
    }

    public Nodo leerPrimero() {
        return primero;
    }

    public void insertarCabezaLista(int entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace = primero;
        primero = nuevo;
    }

    public void insertarLista(Nodo anterior, int entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace = anterior.enlace;
        anterior.enlace = nuevo;
    }

    public void eliminar(int entrada) {
        Nodo actual, anterior;
        actual = primero;
        anterior = null;

        while ((actual != null) && !(actual.dato == entrada)) {
            anterior = actual;
            actual = actual.enlace;
        }

        if (actual != null) {
            if (actual == primero) {
                primero = actual.enlace;
            } else {
                anterior.enlace = actual.enlace;
            }
        }
    }

    public Nodo buscarLista(int destino) {
        Nodo indice;
        for (indice = primero; indice != null; indice = indice.enlace) {
            if (indice.dato == destino) {
                return indice;
            }
        }
        return null;
    }

    public void visualizar() {
        Nodo n;
        n = primero;
        while (n != null) {
            System.out.print(n.dato + " ");
            n = n.enlace;
        }
        System.out.println();
    }

    // Ejercicio 1: Ordenar la lista de forma ascendente
    public void ordenarAscendente() {
        if (primero == null || primero.enlace == null) return;

        boolean cambiado;
        do {
            cambiado = false;
            Nodo actual = primero;
            while (actual.enlace != null) {
                if (actual.dato > actual.enlace.dato) {
                    int temp = actual.dato;
                    actual.dato = actual.enlace.dato;
                    actual.enlace.dato = temp;
                    cambiado = true;
                }
                actual = actual.enlace;
            }
        } while (cambiado);
    }

    // Ejercicio 2: Unir dos listas enlazadas
    public void unirLista(Lista otra) {
        if (primero == null) {
            primero = otra.primero;
        } else {
            Nodo actual = primero;
            while (actual.enlace != null) {
                actual = actual.enlace;
            }
            actual.enlace = otra.primero;
        }
    }

    // Ejercicio 3: Separar pares e impares en dos listas
    public void separarParesImpares(Lista pares, Lista impares) {
        Nodo actual = primero;
        while (actual != null) {
            if (actual.dato % 2 == 0) {
                pares.insertarCabezaLista(actual.dato);
            } else {
                impares.insertarCabezaLista(actual.dato);
            }
            actual = actual.enlace;
        }
    }
}
