# Base de Dados do Projeto "Momento"

## Visão Geral
Esta base de dados foi criada para o projeto "Momento", e tem como objetivo emular uma base fictícia para a utilização com APIs. 

É importante ressaltar que, por ser uma base fictícia, nem sempre foram aplicadas as melhores práticas em sua estruturação. O foco principal foi viabilizar a interação com as APIs do projeto.

As tabelas presentes nesta base de dados são as seguintes:

1. Tabela `cargos`: Armazena informações sobre os diferentes cargos na empresa.
2. Tabela `funcionários`: Contém detalhes sobre os funcionários contratados.
3. Tabela `dependentes`: Registra informações dos dependentes associados a cada funcionário.
4. Tabela `regiões`: Lista as regiões disponíveis na empresa.
5. Tabela `países`: Mantém o registro dos países relacionados às regiões.
6. Tabela `escritórios`: Armazena dados sobre os escritórios da empresa.

## Importando a Base de Dados
Para utilizar esta base de dados em seu projeto, você pode importar o arquivo SQL fornecido e executá-lo em seu servidor de banco de dados compatível com SQL (por exemplo, MySQL, PostgreSQL, SQLite, etc.).

**Arquivo SQL:** `momento_base_de_dados.sql`

Certifique-se de que o servidor de banco de dados esteja em execução e, em seguida, execute o arquivo SQL para criar as tabelas e inserir dados fictícios nas respectivas tabelas.

## Observações
- Esta base de dados foi criada com o objetivo de fornecer uma estrutura de dados básica para o projeto "Momento" e não representa uma implementação completa ou otimizada. Sugere-se que seja utilizada apenas para fins de teste e desenvolvimento.

- Como a base de dados emula uma situação fictícia, podem existir dados duplicados, incompletos ou inconsistentes. É importante considerar isso ao realizar qualquer interação com a API que utilize esta base.

- Caso necessário, adaptações e melhorias na estrutura da base de dados podem ser feitas para atender aos requisitos específicos do projeto "Momento" ou para seguir melhores práticas de desenvolvimento.

- Lembre-se de manter a segurança da base de dados e não expor informações sensíveis em um ambiente de produção real.

- Este arquivo README tem como objetivo fornecer informações detalhadas sobre a base de dados do projeto "Momento". Utilize-o como referência para interagir com a base de dados e desenvolver as APIs necessárias para o projeto. Lembre-se sempre de seguir boas práticas de desenvolvimento e manutenção de bases de dados em seus projetos reais.
