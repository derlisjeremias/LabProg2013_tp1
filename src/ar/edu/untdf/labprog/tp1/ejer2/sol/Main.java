/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer2.sol;

/**
 *
 * @author matiasgel
 */
public class Main {

    public static void main(String args[]) {
        //Store myStore =new StoreWithMysql();
        //Store myStore =new StoreWithOracle();
        //Store myStore =new StoreWithPostgres();
        Store myStore = new StoreWithMsSqlServer();
        
        myStore.buy("12345", 5);
        myStore.sell("54321", 3);
    }
}
