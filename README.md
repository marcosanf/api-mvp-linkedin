<img src="https://blog.cloudrail.com/wp-content/uploads/2016/03/LinkedIn.png" alt="Linkedin Logo">

# MVP Linkedin API
<p align="justify">O <b>Linkedin</b> é a maior plataforma profissional do mundo. Com esta API, você conseguirá implementar algumas das funcionalidade presentes nele e criar a sua própria rede social. Show de bola, né? Nossa API é capaz de <b<criar usuários</b>, <b>publicações (posts)</b> e de quebra você pode <b>anunciar novos jobs</b> e reter talentos para empresas que utilizem a sua rede social. Nosso trabalho ainda não terminou, e você pode fazer parte colaborando conosco, é só enviar o seu pull request, aproveite!</p>

## Deploy
> Status: Em desenvolvimento :warning:

## Stack da aplicação :books:
- [Java 11](https://codesandbox.io/)
- [Maven](https://maven.apache.org/)
- [Spring Framework](https://spring.io/projects/spring-framework)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Swagger](https://swagger.io/)
- [Postgres SQL](https://www.postgresql.org/)

## Levantando a aplicação :rocket:

Levantar o **SPRING-BOOT**:
```
mvn spring-boot:run
```

## Documentação API

**Swagger**: http://localhost:8080/swagger-ui.html


## Features
> Usuário
- [x] Endpoint para criação de um usuário
- [ ] Endpoint para buscar um usuário através de um Id
> Post
- [x] Endpoint para criação de um post
- [x] Enpoint para listar todos os posts
- [ ] Endpoint para editar um post
- [ ] Endpoint para excluir um post
> Job
- [x] Endpoint para criar um job
- [x] Endpoint para listar todos os jobs
