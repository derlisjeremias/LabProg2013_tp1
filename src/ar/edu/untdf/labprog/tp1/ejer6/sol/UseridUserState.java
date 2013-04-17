/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer6.sol;

/**
 *
 * @author Jere
 */
public class UseridUserState extends UserState {

    public UseridUserState() {
        name = "USERID";
    }

    @Override
    public boolean isStart() {
        return false;
    }

    @Override
    public boolean isUserid() {
        return true;
    }

    @Override
    public boolean isConnected() {
        return false;
    }
}
