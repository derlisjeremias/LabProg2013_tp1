/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer6.sol;

/**
 *
 * @author Jere
 */
public class FtpUser {

    private String name = null;
    private String password = null;
    private UserState state = null;

    public FtpUser(String n, String p) {
        name = n;
        password = p;
        state = new StartUserState();
    }

    public void setPassword(String p1, String p2, String p3) {
        if ((password == null) | password.equals(p1)) {
            if (p2.equals(p3)) {
                password = p3;
            } else {
                System.out.println("Clave " + p2 + " distinta a " + p3);
            }

        } else {
            System.out.println("Clave mal introducida");
        }
    }

    public void setState(UserState s) {
        state = s;
    }

    public String getName() {
        return name;
    }

    protected String getPassword() {
        return password;
    }

    public UserState getState() {
        return state;
    }
}
