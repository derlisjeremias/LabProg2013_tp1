/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer4.sol;

/**
 *
 * @author Jere
 */
public class Main {

    public static void main(String[] args) {
        int[] list = {34, 6, 3, 3, 5, 6, 4, 434, 5, 7, 8, 535, 67, 8, 8, 4, 63464, 7, 8, 6, 86, 85, 54, 6346, 346, 4, 546, 985};
        ListInt aList = new ListInt(list);
        aList.setSortStrategy(new QuicksortListIntStrategy());
        //aList.setSortStrategy(new MergesortListIntStrategy());
        aList.printMe();
        aList.sort();
        aList.printMe();



    }
}
