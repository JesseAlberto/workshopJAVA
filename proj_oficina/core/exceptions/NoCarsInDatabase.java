package core.exceptions;

public class NoCarsInDatabase extends Exception{

    private static final long serialVersionUID = 1L;
    
        
    private String msg;

    public String getMsg() {
        return this.msg;
    }

    public NoCarsInDatabase() {
        this.msg = "Não existe Viaturas na Database";
    }

    
}