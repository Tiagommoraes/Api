## 🛠️ API de Produtos - Spring Boot

Esta é uma API REST desenvolvida em Java com Spring Boot, com funcionalidades de CRUD (Create, Read, Update, Delete) para gerenciar produtos. A aplicação também inclui um endpoint de saudação com uso de service, demonstrando boas práticas de separação de camadas.

### 📌 Funcionalidades

✅ Cadastrar produtos

🔍 Listar todos os produtos

📄 Consultar produto por ID

✏️ Atualizar produto existente

🗑️ Deletar produto

👋 Endpoint de saudação personalizada (/hello)


### 🚀 Tecnologias Utilizadas

Java 17+

Spring Boot

Spring Web

Spring Data JPA

H2 Database

Lombok

Maven


### ⚙️ Como Executar

Clone o repositório:

bash
Copiar
Editar
git clone https://github.com/seu-usuario/seu-repo.git
Abra o projeto no VS Code (ou outro IDE Java).

Execute a aplicação:

bash
Copiar
Editar
./mvnw spring-boot:run
Acesse no navegador:

API: http://localhost:8080

Console do banco H2 (se habilitado): http://localhost:8080/h2-console

🔗 Endpoints da API

### 👋 HelloController

Método	Rota	Descrição
GET	/hello	Retorna Hello World! ou com nome via query param
Exemplo:
GET /hello?name=Lucas → "Hello Lucas!"

### 📦 ProdutoController

Método	Rota	Descrição
GET	/produtos	Lista todos os produtos
GET	/produtos/{id}	Retorna um produto por ID
POST	/produtos	Cria um novo produto
PUT	/produtos/{id}	Atualiza um produto existente
DELETE	/produtos/{id}	Remove um produto
Exemplo de corpo JSON para POST/PUT:

json
Copiar
Editar
{
  "name": "Smartphone",
  "description": "Celular Android com 128GB"
}

### 🗃️ Modelo da Entidade Produto

java
Copiar
Editar
public class Produto {
    private Long id;
    private String name;
    private String description;
}

### 🧠 Organização em Camadas
controller – Lida com as requisições HTTP.

service – Lógica de negócio.

repository – Integração com o banco de dados.

model – Representação da entidade Produto.

### 🗄️ Banco de Dados

Banco H2 com persistência local (resources/db/bancoDeDados.mv.db)

Gerenciado automaticamente pelo Spring Data JPA

### 📂 Estrutura do Projeto
bash
Copiar
Editar
src/
└── main/
    ├── java/com/example/demo/
    │   ├── controller/
    │   │   ├── HelloController.java
    │   │   └── ProdutoController.java
    │   ├── model/Produto.java
    │   ├── repository/ProdutoRepository.java
    │   ├── service/
    │   │   ├── HelloService.java
    │   │   └── ProdutoService.java
    │   └── DemoApplication.java
    └── resources/
        ├── db/bancoDeDados.mv.db
        ├── application.yml
        
### ✨ Possíveis Melhorias Futuras

Validações com Bean Validation (@NotNull, @Size, etc)

Documentação Swagger/OpenAPI

Autenticação com Spring Security

Testes unitários e de integração

