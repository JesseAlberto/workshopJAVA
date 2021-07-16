package core.exceptions;

public class NoRepairsDatabaseException extends Exception{

    private static final long serialVersionUID = 1L;

    private String msg;

    public String getMsg() {
        return this.msg;
    }

    public NoRepairsDatabaseException() {
        this.msg = "Não existe nenhuma reparação de uma viatura na Base de dados: ";
    }

    
}