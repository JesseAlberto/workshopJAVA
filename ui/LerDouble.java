package ui;

import ui.exceptions.FormatoInvalidoException;
import ui.exceptions.TipoEntradaInvalidoException;

public class LerDouble extends Ler<Double> {

    public LerDouble(String pedido) {
        super(pedido, null);
    }

    @Override
    public void parse(String in) throws FormatoInvalidoException, TipoEntradaInvalidoException {
        try {
            this.valor=Double.parseDouble(in);
        } catch (NullPointerException e) {
            throw new TipoEntradaInvalidoException(Mensagens.ERROR_DOUBLE);
        }catch (NumberFormatException e){
            throw new TipoEntradaInvalidoException(Mensagens.ERROR_DOUBLE);
        }
    }
    
}