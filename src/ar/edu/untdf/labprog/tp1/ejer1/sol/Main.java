/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer1.sol;

/**
 *
 * @author matiasgel
 */
public class Main {

    public static void main(String args[]) {
        //Store myStore =new StoreWithMysql();
        //Store myStore =new StoreWithOracle();
        Store myStore =new StoreWithPostgres();
        
        myStore.buy("12345", 5);
        myStore.sell("54321", 3);
    }
}
