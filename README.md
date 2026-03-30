# Workshop Spring Boot com MongoDB

Este projeto é uma API RESTful desenvolvida durante um workshop para demonstrar a integração entre o framework **Spring Boot** e o banco de dados NoSQL **MongoDB**. A aplicação simula o backend de uma rede social, com funcionalidades de utilizadores, posts e comentários.

## 🚀 Tecnologias
- **Java 17**
- **Spring Boot 3**
- **Spring Data MongoDB** (Persistência e Mapeamento Objeto-Documento)
- **MongoDB** (Banco de dados orientado a documentos)
- **Maven** (Gestão de dependências)

## 🛠️ Funcionalidades
- **Arquitetura em Camadas:** Implementação seguindo os padrões Resource, Service e Repository.
- **CRUD Completo:** Gestão de utilizadores (inserir, atualizar, listar e eliminar).
- **Associações Complexas:** Uso de `@DBRef` para referências entre posts e utilizadores, e objetos aninhados (DTOs) para comentários.
- **Consultas Personalizadas:** Pesquisas de posts por título utilizando queries personalizadas com **Regex** (case insensitive).
- **Tratamento de Exceções:** Manipulador global de erros para respostas HTTP padronizadas.

## 🏁 Como executar
1. Certifique-se de ter o MongoDB instalado e a correr localmente.
2. Clone o repositório: `git clone https://github.com/Gabs-jg/workshop-spring-boot-mongodb.git`
3. Execute o projeto via Maven ou na sua IDE favorita.
