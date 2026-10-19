class Nodo<T> {
    T dato;
    Nodo<T> siguiente;

public Nodo(T dato) {
    this.dato = dato;
    this.siguiente = null;
    }
}

public class Pila<T> {
private Nodo<T> tope;
private int nElementos;

public Pila() {
    this.tope = null;
    this.nElementos = 0;
}

public void push(T elemento) {
    Nodo<T> nuevo = new Nodo<>(elemento);
    nuevo.siguiente = this.tope;
    this.tope = nuevo;
    this.nElementos++;
}

public T pop() {
    if (empty()) {
    throw new IllegalStateException("La pila está vacia");
    }
    T datoExtraido = this.tope.dato;
    this.tope = this.tope.siguiente;
    this.nElementos--;
return datoExtraido;
}

public T peek() {
    if (empty()) {
    throw new IllegalStateException("La pila está vacía");
    }
return this.tope.dato;
}

public boolean empty() {
return this.tope == null;
}
                                                                                                                                                                                                                                            
public static void main(String[] args) {
    Pila<Integer> miPila = new Pila<>();

    System.out.println("¿La pila está vacia? " + miPila.empty());

    miPila.push(5);
    miPila.push(10);
    miPila.push(15);

    System.out.println("Tope actual : " + miPila.peek());
    System.out.println("Elemento extraído : " + miPila.pop());
    System.out.println("Nuevo tope tras el pop: " + miPila.peek());
    System.out.println("¿La pila está vacia? " + miPila.empty());
    }
}
