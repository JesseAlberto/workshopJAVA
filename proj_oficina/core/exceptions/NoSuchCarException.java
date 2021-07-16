package core.exceptions;

public class NoSuchCarException extends Exception {

    private static final long serialVersionUID = 1L;

    private String msg;

    public String getMsg() {
        return this.msg;
    }

    public NoSuchCarException(String matricula) {
        this.msg = "Não existe nenhum veiculo com a matricula: " + matricula;
    }

    
}