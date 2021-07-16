package app.viaturas;

public interface Label {
    String TITULO="MENU VIATURAS";
    String TITULO_MENU_ADD_VEICULO = "ADICIONA VIATURA";

    String MENU_ADD_VIAT="Adicionar viatura";
    String MENU_LIST_VIAT="Listar viaturas";
    String MENU_PRINT_VIAT="Imprimir viatura";

    String MENU_ADD_VIAT_CARRO="Adicionar Carro";
    String MENU_ADD_VIAT_MOTA="Adicionar Mota";

    String ASK_FOR_MATRICULA= "Insira a matricula(00AA00): ";
    String ASK_FOR_MARCA= "Insira a marca: ";
    String ASK_FOR_DATE_MATRICULA= "Insira o data da matricula (YYYY-MM-DD): ";
    String ASK_FOR_N_PORTAS= "Insira o numero de portas do carro: ";
    String ASK_FOR_CILINDRADA="Insira a cilindrada da mota: ";

    String MATRICULA_REGEX = "^\\d{2}[A-Z]{2}\\d{2}";
}