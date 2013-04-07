/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer5.sol;

/**
 *
 * @author Jere
 */
public class BinarySearchListIntStrategy implements SearchListIntStrategy {

    int[] list = {};

    public void setList(int[] aList) {
        this.list = aList;
    }

    public boolean contains(int aInt) {
        System.out.println("Se utiliza busqueda binaria");
        if (list.length == 0) {
            return false;
        }

        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int middle = (low + high) / 2;
            if (aInt > list[middle]) {
                low = middle + 1;
            } else if (aInt < list[middle]) {
                high = middle - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
