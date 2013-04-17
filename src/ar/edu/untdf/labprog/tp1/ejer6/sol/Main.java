/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.labprog.tp1.ejer6.sol;

/**
 *
 * @author Jere
 */
public class Main {

    public static void main(String[] args) {
        FtpUser user = new FtpUser("admin", "1234");
        Ftp ftp = new Ftp(user, "unarchivo.txt");
        ftp.checkUser(user);
        ftp.checkPasswd(user);
        System.out.println(ftp.getFile());
        ftp.close();

    }
}
