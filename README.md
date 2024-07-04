# Projeto Java - Spring Boot 3 - JPA

# Sobre o projeto

Esse projeto foi feito com base nas aulas do curso do professor [Nélio Alves](https://github.com/acenelio "Perfil do Nélio Alves no github") em seu curso da Udemy <b>Java COMPLETO Programação Orientada a Objetos + Projetos</b>.</br>


- Durante as aulas aprendi sobre o uso do framework <b>Spring Boot</b> integrado com <b>JPA</b> implementado por <b>Hibernate</b>. 
- Pude conhecer a utilização de banco de dados <b>PostgreSQL</b>. 
- Também coloquei em prática conceitos de <b>programação orientada a objetos</b> e exercitei meus conhecimentos da linguagem <b>Java</b>.
- Ao final do projeto fui ensinado sobre como fazer deploy da aplicação pelo <b>Heroku</b> e aproveitei para aprender também sobre <b>AWS</b> 
</br>
A aplicação consiste em um CRUD relacionado a entidade <b>user</b> do banco de dados local.

## Endpoints

### POST  /users
Inserção de um User

Parametro:
- Body: Objeto User 


<div align="center">
 
![Endpoint Get](https://github.com/SouzaDiegoCl/workshop-springboot3-jpa/blob/main/assets/endpoint_users_post.png) 

</div>

<hr>

### GET  /users

Acesso ao arrays de objetos User
<div align="center">
 
![Endpoint Get](https://github.com/SouzaDiegoCl/workshop-springboot3-jpa/blob/main/assets/endpoint_users_get.png) 

</div>

<hr>

### PUT  /users/{id}
Update de um User existente


Parametro:
- Id do User
- Body: Objeto User

<div align="center">
 
![Endpoint Update](https://github.com/SouzaDiegoCl/workshop-springboot3-jpa/blob/main/assets/endpoint_users_update.png) 

</div>

<hr>

### DELETE  /users/{id}
Deletar User existente
<div align="center">
 
![Endpoint Delete](https://github.com/SouzaDiegoCl/workshop-springboot3-jpa/blob/main/assets/endpoint_users_delete.png) 

</div>

<hr>

## Modelo conceitual
Modelo conceitual apresentado pelo professor para execução do projeto
<div align="center">
 
![Modelo Conceitual](https://github.com/SouzaDiegoCl/workshop-springboot3-jpa/blob/main/assets/modelo_conceitual.png) 

</div>

<hr>

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot 
- JPA / Hibernate
- Maven

## Implantação em produção (Teste para aprendizado em duas plataformas)
- Heroku
- AWS Cloud - EC2


# Como executar o projeto

## Back end
Pré-requisitos: Java 17

```bash
# clonar repositório
git clone https://github.com/SouzaDiegoCl/workshop-springboot3-jpa.git

# entrar na pasta do projeto
cd workshop-springboot3-jpa

# executar o projeto
./mvnw spring-boot:run

# acessar local database:
localhost:8080/users
```

# Autor
 [Diego Baltazar de Souza Claudio](https://github.com/SouzaDiegoCl)

www.linkedin.com/in/diegosouzaperfil
