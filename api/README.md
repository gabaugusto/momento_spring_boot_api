# API da Empresa Momento (para Estudantes)

Bem-vindo à API da Empresa Momento! Esta API foi projetada para fornecer dados relacionados a Funcionários, Escritórios e muito mais. 

É uma ótima maneira de aprender e explorar o desenvolvimento de APIs usando o Spring Boot.

Este projeto é uma API básica construída usando Java SpringBoot. Ele serve como exemplo para uso em sala de aula, fornecendo uma introdução à construção de APIs com SpringBoot e mostrando vários recursos e potencialidades das tecnologias envolvidas.

## Tecnologias usadas
Java: A linguagem de programação usada para construir a API.

SpringBoot: Uma estrutura poderosa para desenvolver aplicativos Java, incluindo APIs RESTful.

Maven: Uma ferramenta popular de automação de compilação e um sistema de gerenciamento de dependência usado para gerenciar dependências de projeto e criar a API.

Spring Data JPA: Uma parte da estrutura Spring que fornece abstrações convenientes para trabalhar com bancos de dados usando Java Persistence API (JPA).

Postman: Uma plataforma de colaboração para desenvolvimento e teste de API, que pode ser usada para interagir e testar os endpoints da API.

## Características

Essa API mostrará os seguintes recursos:

Operações CRUD: A API oferece suporte a operações básicas CRUD (Criar, Ler, Atualizar, Excluir) para uma entidade específica.

Arquitetura RESTful: A API segue os princípios de Representational State Transfer (REST), fornecendo uma interface uniforme para interagir com os recursos.

Validação: os dados da solicitação são validados para garantir que atendam aos critérios exigidos antes do processamento.

Sinta-se à vontade para explorar e modificar o código para saber mais sobre como criar APIs com Java SpringBoot.

## Documentação da API

Aqui está uma visão geral dos principais endpoints disponíveis nesta API:

### Funcionários

- `GET /api/funcionarios`: Retorna a lista de todos os funcionários cadastrados.
- `GET /api/funcionarios/id/{id}`: Retorna informações detalhadas sobre um funcionário específico com base no ID.
- `GET /api/funcionarios/nome/{nome}`: Retorna informações detalhadas sobre um funcionário específico com base no Nome.
- `GET /api/funcionarios/email/{email}`: Retorna informações detalhadas sobre um funcionário específico com base no e-mail.
- `GET /api/funcionarios/departamento/{departamento}`: Retorna informações detalhadas sobre um funcionário específico com base no departamento.
- `POST /api/funcionarios`: Cria um novo funcionário com base nos dados fornecidos.
- `PUT /api/funcionarios/{id}`: Atualiza as informações de um funcionário específico com base no ID.
- `DELETE /api/funcionarios/{id}`: Remove um funcionário específico com base no ID.


### Dependentes

- `GET /api/dependentes`: Retorna a lista de todos os dependentes cadastrados.
- `GET /api/dependentes/id/{id}`: Retorna informações detalhadas sobre um dependente específico com base no ID.
- `GET /api/dependentes/nome/{nome}`: Retorna informações detalhadas sobre um dependente específico com base no Nome.
- `GET /api/dependentes/funcionario/{nome}`: Retorna informações detalhadas sobre um dependente específico com base no ID de determinado funcionário.
- `POST /api/dependentes`: Cria um novo dependente com base nos dados fornecidos.
- `PUT /api/dependentes/{id}`: Atualiza as informações de um dependente específico com base no ID.
- `DELETE /api/dependentes/{id}`: Remove um dependente específico com base no ID.

### Escritórios

- `GET /api/escritorios`: Retorna a lista de todos os escritórios cadastrados.
- `GET /api/escritorios/id/{id}`: Retorna informações detalhadas sobre um escritório específico com base no ID.
- `GET /api/escritorios/nome/{nome}`: Retorna informações detalhadas sobre um escritório específico com base no Nome.
- `POST /api/escritorios`: Cria um novo escritório com base nos dados fornecidos.
- `PUT /api/escritorios/{id}`: Atualiza as informações de um escritório específico com base no ID.
- `DELETE /api/escritorios/{id}`: Remove um escritório específico com base no ID.

### Cargos

- `GET /api/cargos`: Retorna a lista de todos os cargos cadastrados.
- `GET /api/cargos/id/{id}`: Retorna informações detalhadas sobre um cargo específico com base no ID.
- `GET /api/cargos/nome/{nome}`: Retorna informações detalhadas sobre um cargo específico com base no Nome.
- `POST /api/cargos`: Cria um novo cargo com base nos dados fornecidos.
- `PUT /api/cargos/{id}`: Atualiza as informações de um cargo específico com base no ID.
- `DELETE /api/cargos/{id}`: Remove um cargo específico com base no ID.

### País

- `GET /api/paises`: Retorna a lista de todos os paises cadastrados.
- `GET /api/paises/id/{id}`: Retorna informações detalhadas sobre um país específico com base no ID.
- `GET /api/paises/nome/{nome}`: Retorna informações detalhadas sobre um país específico com base no Nome.
- `POST /api/paises`: Cria um novo país com base nos dados fornecidos.
- `PUT /api/paises/{id}`: Atualiza as informações de um país específico com base no ID.
- `DELETE /api/paises/{id}`: Remove um país específico com base no ID.

### Região

- `GET /api/regioes`: Retorna a lista de todos as regiões cadastradas.
- `GET /api/regioes/id/{id}`: Retorna informações detalhadas sobre uma região específica com base no ID.
- `GET /api/regioes/nome/{nome}`: Retorna informações detalhadas sobre uma região específica com base no Nome.
- `POST /api/regioes`: Cria um novo país com base nos dados fornecidos.
- `PUT /api/regioes/{id}`: Atualiza as informações de um país específico com base no ID.
- `DELETE /api/regioes/{id}`: Remove um país específico com base no ID.

### Departamento

- `GET /api/departamentos`: Retorna a lista de todos os departamentos cadastrados.
- `GET /api/departamentos/id/{id}`: Retorna informações detalhadas sobre um departamento específico com base no ID.
- `GET /api/departamentos/nome/{nome}`: Retorna informações detalhadas sobre um departamento específico com base no Nome.
- `POST /api/departamentos`: Cria um novo departamento com base nos dados fornecidos.
- `PUT /api/departamentos/{id}`: Atualiza as informações de um departamento específico com base no ID.
- `DELETE /api/departamentos/{id}`: Remove um departamento específico com base no ID.

### Países

- `GET /api/paises`: Retorna a lista de todos os paises cadastrados.
- `GET /api/paises/{id}`: Retorna informações detalhadas sobre um país específico com base no ID.
- `POST /api/paises`: Cria um novo país com base nos dados fornecidos.
- `PUT /api/paises/{id}`: Atualiza as informações de um país específico com base no ID.
- `DELETE /api/paises/{id}`: Remove um país específico com base no ID.

## Configuração

Para executar localmente a API da Empresa Momento, siga estas etapas:

1. Certifique-se de ter o Java Development Kit (JDK) instalado.
2. Clone este repositório para o seu ambiente local.
3. Rode o script momento.sql no seu banco MySQL.
4. Abra o projeto em sua IDE preferida.
5. Atualize o arquivo application.properties com as configurações do seu ambiente.
6. Execute a classe `MomentoApplication` para iniciar a aplicação.
7. Acesse `http://localhost:8080` para interagir com a API localmente.

## Contribuindo

Se você encontrar algum problema ou tiver sugestões para melhorar esta API, sinta-se à vontade para abrir um issue neste repositório. 
Ficaremos felizes em receber contribuições e melhorar continuamente a API.

## Licença

Esta API está licenciada sob a [Licença MIT](https://opensource.org/licenses/MIT).

---

Esperamos que você aproveite a API da Empresa Momento! 

Se tiver alguma dúvida ou precisar de mais informações, não hesite em entrar em contato conosco.
