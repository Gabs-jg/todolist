# To-Do List API

Uma API robusta para gestão de tarefas (to-do list), focada em segurança, validação de regras de negócio e boas práticas de deploy com Docker.

## 🚀 Tecnologias
- **Java 21**
- **Spring Boot 3**
- **Spring Data JPA / Hibernate**
- **H2 Database** (Banco de dados em memória para desenvolvimento)
- **Docker** (Containerização com multi-stage build)
- **BCrypt** (Hashing de passwords)

## 🔐 Diferenciais e Segurança
- **Autenticação Basic Auth Customizada:** Filtro de segurança (`OncePerRequestFilter`) que valida as credenciais diretamente no banco de dados.
- **Criptografia:** As passwords dos utilizadores são armazenadas de forma segura utilizando BCrypt.
- **Isolamento de Dados:** Um utilizador autenticado só possui permissão para visualizar, editar ou eliminar as suas próprias tarefas.
- **Validação de Datas:** Lógica de negócio para impedir tarefas com data de início ou término inválidas (retroativas).
- **UUID:** Identificadores únicos universais para aumentar a segurança das URLs da API.

## 📦 Dockerização
O projeto utiliza um **Dockerfile multi-stage**, garantindo que a imagem final contenha apenas o necessário para a execução (Runtime), tornando-a leve e segura.

```bash
# Para rodar via Docker
docker build -t todolist-app .
docker run -p 8080:8080 todolist-app
