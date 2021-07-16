package core.exceptions;

public class NoMechanicsInDatabase extends Exception {

    private static final long serialVersionUID = 1L;
    
    private String msg;

    public String getMsg() {
        return this.msg;
    }

    public NoMechanicsInDatabase() {
        this.msg = "Não existe Mecânicos na Database";
    }

    
}