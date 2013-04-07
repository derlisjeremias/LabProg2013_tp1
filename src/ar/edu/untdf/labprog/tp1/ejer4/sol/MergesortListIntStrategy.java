/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer4.sol;

/**
 *
 * @author Jere
 */
public class MergesortListIntStrategy implements SortListIntStrategy {

    int[] list = {};

    public void setList(int[] aList) {
        this.list = aList;
    }

    public void sort() {
        System.out.print("Se utiliza mergesort");
        this.mergesort();
    }

    private void mergesort() {
        mergesort(0, list.length - 1, new int[list.length]);
    }

    private void mergesort(int low, int high, int[] helper) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergesort(low, middle, helper);
            mergesort(middle + 1, high, helper);
            merge(low, middle, high, helper);
        }
    }

    private void merge(int low, int middle, int high, int[] helper) {
        for (int i = low; i <= high; i++) {
            helper[i] = list[i];
        }
        int i = low;
        int j = middle + 1;
        int k = low;
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                list[k] = helper[i];
                i++;
            } else {
                list[k] = helper[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            list[k] = helper[i];
            k++;
            i++;
        }
    }
}
