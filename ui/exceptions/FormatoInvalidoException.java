package ui.exceptions;

public class FormatoInvalidoException extends Exception {

    private static final long serialVersionUID = 1L;

    private String msg;

    public String getMsg() {
        return "Formato Inválido. " + this.msg;
    }

    public FormatoInvalidoException(String msg) {
        this.msg = msg;
    }

}