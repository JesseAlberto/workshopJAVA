package core.exceptions;

public class NoSuchReparacaoException extends Exception {
    
    private static final long serialVersionUID = 1L;

    private String msg;

    public String getMsg() {
        return this.msg;
    }

    public NoSuchReparacaoException(int id) {
        this.msg = "Não existe nenhuma reparacao com o id: " + id;
    }

}