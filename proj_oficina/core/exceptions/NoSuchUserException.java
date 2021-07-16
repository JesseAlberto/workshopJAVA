package core.exceptions;

public class NoSuchUserException extends Exception {

    private static final long serialVersionUID = 1L;

    private String msg;

    public String getMsg() {
        return this.msg;
    }

    public NoSuchUserException(int id) {
        this.msg = "Não existe o Mecânico com o id:"+id;
    }

    
}