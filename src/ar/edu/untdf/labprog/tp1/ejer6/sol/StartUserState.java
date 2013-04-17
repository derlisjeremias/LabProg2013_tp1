/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer6.sol;

/**
 *
 * @author Jere
 */
public class StartUserState extends UserState {

    public StartUserState() {
        name = "START";
    }

    @Override
    public boolean isStart() {
        return true;
    }

    @Override
    public boolean isUserid() {
        return false;
    }

    @Override
    public boolean isConnected() {
        return false;
    }
}
