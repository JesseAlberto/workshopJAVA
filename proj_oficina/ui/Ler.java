package ui;

import ui.exceptions.FormatoInvalidoException;
import ui.exceptions.TipoEntradaInvalidoException;

public abstract class Ler<Type> {
    private String pedido;
    protected Type valor;
    private String regex;


    public String getPedido() {
        return this.pedido;
    }

    public Type getValor() {
        return this.valor;
    }

    public String getRegex() {
        return this.regex;
    }

    public Ler(String pedido, String regex) {
        this.pedido = pedido;
        this.regex=regex;
    }

    public abstract void parse(String in) throws FormatoInvalidoException, TipoEntradaInvalidoException;

}