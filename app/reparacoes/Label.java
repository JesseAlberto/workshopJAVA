package app.reparacoes;

public interface Label {
    String TITULO="MENU REPARAÇÕES";

    String MENU_ADD_REP="adicionar reparação";
    String MENU_GET_INFO_REP="Imprimir uma reparação";
    String MENU_LIST_VIAT_REP="Listar Reparações de uma viatura";
    String MENU_LIST_ALL="Listar todas as reparações";



    String ASK_FOR_OBS="Insira uma observação: ";
    String ASK_FOR_TIPO="Insira tipo Reparacao: 1-PROGRAMADA, 2-EXTRAORDINARIA: ";
    String ASK_FOR_MATRICULA="Insira a matricula da viatura: ";
    String ASK_FOR_ID_MECANICO="Insira o id do Mecanico: ";
    String ASK_FOR_ID_REPARACAO="Insira o id da reparacao: ";
    
    String REGEX_MATRICULA="^\\d{2}[A-Z]{2}\\d{2}";
    String REGEX_FOR_TIPO = "^[1-2]{1}";

}