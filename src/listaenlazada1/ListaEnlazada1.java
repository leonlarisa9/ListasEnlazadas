
package listaenlazada1;

import java.util.ArrayList;

public class ListaEnlazada1 {

    public static void main(String[] args) {
        int nCantidadElementosIniciales = 15;
        int nValorInicialDato=1;
        int nValorFinalDato=50000;
        int nValorInicialEnlace=1;
        int nValorFinalEnlace=1000000;

        ArrayList<Nodo> oLista;
        
        oLista =  ListarLinealEnlazada.DevuelveListaEnlazada(nCantidadElementosIniciales, nValorInicialDato, nValorFinalDato, nValorInicialEnlace, nValorFinalEnlace);
        //Instanciar la clase Nodo//
        
        ListarLinealEnlazada ListaLinealEnlazada = new ListarLinealEnlazada(oLista, 1,nCantidadElementosIniciales);
        ListaLinealEnlazada.ImprimirLlistaLinealEnlazada();
        System.out.println("/////ORDENADA///////");
        ListaLinealEnlazada.ImprimirListaLinealEnlazadaOrdenada(oLista);
        ListaLinealEnlazada.ImprimirLlistaLinealEnlazada();
        
        System.out.println("Posicion 5 : " + ListaLinealEnlazada.DevolverDatoListaEnlazada(5));
    }

    
}
