/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer5.sol;

/**
 *
 * @author Matias
 */
public class ListInt {

    private int[] list;
    private SortListIntStrategy sortStrategy = null;
    private SearchListIntStrategy serchStrategy = null;

    public ListInt(int[] list) {
        this.list = list;
    }

    protected int[] getList() {
        return this.list;

    }

    public void sort() {
        if (sortStrategy != null) {
            this.sortStrategy.sort();
        } else {
            System.out.print("Estrategia de ordenamiento sin definir");
        }
    }

    public void setSortStrategy(SortListIntStrategy aStrategy) {
        sortStrategy = aStrategy;
        sortStrategy.setList(list);
    }

    public boolean contains(int aInt) {
        if (serchStrategy != null) {
            return this.serchStrategy.contains(aInt);
        } else {
            System.out.println("Estrategia de busqueda sin definir");
            return false;
        }
    }

    public void setSearchStrategy(SearchListIntStrategy aStrategy) {
        serchStrategy = aStrategy;
        serchStrategy.setList(list);
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
