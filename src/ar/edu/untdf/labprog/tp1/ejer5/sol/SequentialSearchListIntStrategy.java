/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer5.sol;

/**
 *
 * @author Jere
 */
public class SequentialSearchListIntStrategy implements SearchListIntStrategy {

    int[] list = {};

    public void setList(int[] aList) {
        this.list = aList;
    }

    public boolean contains(int aInt) {
        System.out.println("Se utiliza busqueda secuencial");
        for (int i : list) {
            if (i == aInt) {
                return true;
            }
        }
        return false;
    }
}
