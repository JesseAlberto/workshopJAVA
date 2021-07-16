# Aplicação Oficina

Escreva uma pequena aplicação para gestão de uma Oficina. Esta Oficina deverá ter as seguintes funcionalidades:

- Realcionadas com Pessoal:
  - Adicionar Mecânico
  - Listar todos os mecânicos (Empregados com mais tempos de serviço)
  - Imprimir Informação de uma mecânico em particular (pedido o seu id da empresa)

- Relacionadas com Viaturas:
  - Adicionar Viatura (Carro ou Mota);
  - Listar todas as viaturas (Ordenadas, primeiro os carros ordenados por Ano de MAtricula e em seguida Motas, também ordenadas por ano de matrícula);
  - Imprimir a informação de uma viatura

- Relacionadas com as reparações:
  - Adicionar reparação;
  - Listar todas as reparações;
  - Listar todas as reparações de uma viatura (pede matrícula)
  - Imprimir Informação de uma reparação Específica (pedir id da reparação)


- Atributos de um Mecânico:
  - Id (inteiro único) - numero interno do mecânico, atribuido de forma sequêncial;
  - Nome
  - Data com inicio de trabalho na empresa (YYYY-MM-DD);
  
- Atributos de uma viatura:
  - Carros:
    - Matricula;
    - Marca;
    - Ano de matricula (YYYY);
    - Nº Portas (inteiro)
  - Mota:
    - Todos os atributos de carro (excepto num portas) mais a cilindrada (inteiro);

- Atributos de uma Reparação:
  - Id (inteiro sequencial)
  - Ordinária ou extraordiária;
  - Data da realização;
  - Viatura que sofreu a reparação (matricula)
  - Mecânico que trabalho na viatura (para simplificação admite-se que será 1)
  - Comentários Campo livre de texto. Máximo 1000 caracteres;



