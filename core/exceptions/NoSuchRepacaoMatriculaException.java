package core.exceptions;

public class NoSuchRepacaoMatriculaException extends Exception {


    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    private String msg;

    public String getMsg() {
        return this.msg;
    }

    public NoSuchRepacaoMatriculaException(String matricula) {
        this.msg = "Não existe nenhuma reparacao com a matricula: " + matricula;
    }


}