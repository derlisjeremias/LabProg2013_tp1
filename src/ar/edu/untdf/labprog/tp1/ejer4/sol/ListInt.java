/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer4.sol;

/**
 *
 * @author Matias
 */
public class ListInt {

    private int[] list;
    private SortListIntStrategy strategy = null;

    public ListInt(int[] list) {
        this.list = list;
    }

    protected int[] getList() {
        return this.list;

    }

    public void sort() {
        if (strategy != null) {
            this.strategy.sort();
        } else {
            System.out.print("Estrategia sin definir");
        }
    }

    public void setSortStrategy(SortListIntStrategy aStrategy) {
        strategy = aStrategy;
        strategy.setList(list);
    }

    public void printMe() {
        System.out.println();
        System.out.print("(");
        for (int x : list) {
            System.out.print(x);
            System.out.print(" ");
        }
        System.out.print(")");
        System.out.println();
    }
}
