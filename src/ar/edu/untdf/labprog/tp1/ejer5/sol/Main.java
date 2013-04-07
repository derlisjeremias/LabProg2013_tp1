/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer5.sol;

/**
 *
 * @author Jere
 */
public class Main {

    public static void main(String[] args) {
        int[] list = {34, 6, 3, 3, 5, 6, 4, 434, 5, 7, 8, 535, 67, 8, 8, 4, 63464, 7, 8, 6, 86, 85, 54, 6346, 346, 4, 546, 985};
        int aInt = 985;//Elemento que está en la lista
        //int aInt = 1;//Elemento que no está en la lista
        ListInt aList = new ListInt(list);

        //Seleccionar estrategia de Ordenamiento
        //aList.setSortStrategy(new QuicksortListIntStrategy());
        aList.setSortStrategy(new MergesortListIntStrategy());

        //Seleccionar estrategia de Búsqueda
        //aList.setSearchStrategy(new BinarySearchListIntStrategy());
        aList.setSearchStrategy(new SequentialSearchListIntStrategy());

        if (aList.contains(aInt)) {
            System.out.println("El elemento " + aInt + " está en la lista");
        } else {
            System.out.println("No fue encontrado el elemento " + aInt);
        }

        aList.printMe();
        aList.sort();
        aList.printMe();

    }
}
