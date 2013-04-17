package ar.edu.untdf.labprog.tp1.ejer6.sol;

/**
 *
 * @author Matias
 */
public class Ftp {

    private final FtpUser user;
    private final String file;

    public Ftp(FtpUser u, String f) {
        user = u;
        file = f;
        if (u.getState().isStart()) {
            System.out.println("Estado START");
        }
    }

    /**
     * Verifica el usuario
     *
     * @param ruser el usuario a verificar
     */
    public void checkUser(FtpUser ruser) {
        if (user.getState().isStart()) {

            if (ruser.equals(user)) {
                user.setState(new UseridUserState());
                System.out.println("Ingrese su clave");
            }

        } else {
            this.commandUnexpected();

        }

    }

    public void checkPasswd(FtpUser u) {
        if (user.getState().isUserid()) {
            System.out.println("Bienvenido");

            if (user.getPassword().equals(u.getPassword())) {
                user.setState(new ConnectedUserState());
            }
        } else {
            this.commandUnexpected();
        }

    }

    public String getFile() {
        if (user.getState().isConnected()) {
            return file;
        } else {
            this.commandUnexpected();
            return null;
        }
    }

    public void close() {
        user.setState(new StartUserState());
    }

    public void commandUnexpected() {
        System.out.println("Error, comando no esperado");
        user.setState(new StartUserState());
    }
}
