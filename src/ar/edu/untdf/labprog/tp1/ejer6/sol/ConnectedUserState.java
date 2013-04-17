/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer6.sol;

/**
 *
 * @author Jere
 */
public class ConnectedUserState extends UserState {

    public ConnectedUserState() {
        name = "CONECTED";
    }

    @Override
    public boolean isStart() {
        return false;
    }

    @Override
    public boolean isUserid() {
        return false;
    }

    @Override
    public boolean isConnected() {
        return true;
    }
}
