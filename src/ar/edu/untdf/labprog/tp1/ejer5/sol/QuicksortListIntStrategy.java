/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer5.sol;


/**
 *
 * @author Jere
 */
public class QuicksortListIntStrategy implements SortListIntStrategy {

    int[] lista = {};

    public void setList(int[] aList) {
        this.lista = aList;
    }

    public void sort() {
        System.out.print("Se utiliza quicksort");
        this.quicksort();
    }

    private void quicksort() {
        quicksort(0, lista.length - 1);
    }

    private void quicksort(int low, int high) {
        int i = low, j = high;
        int pivot = lista[low + (high - low) / 2];
        while (i <= j) {
            while (lista[i] < pivot) {
                i++;
            }
            while (lista[j] > pivot) {
                j--;
            }

            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j) {
            quicksort(low, j);
        }
        if (i < high) {
            quicksort(i, high);
        }
    }

    private void exchange(int i, int j) {
        int temp = lista[i];
        lista[i] = lista[j];
        lista[j] = temp;
    }
}
