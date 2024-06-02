# myAPI
Este projeto é uma API desenvolvida em Java usando o framework Spring. A API segue as melhores práticas de design, incluindo a implementação de camadas de proteção como Resource e Service, além de realizar operações básicas de CRUD (Create, Read, Update, Delete).

A estrutura de proteção em camadas atribui responsabilidades distintas para manter o código organizado e de fácil manutenção:

Controller (Resource): Responsável por lidar com as requisições HTTP e retornar as respostas apropriadas.
Service: Contém a lógica de negócios e atua como intermediário entre o controlador e a camada de persistência.
Repository: Interage com o banco de dados para realizar operações CRUD.

Stack Utilizada:
- Java 11
- Spring Boot 2.3.12.RELEASE
- Spring Data JPA
- H2 Database (ou outro banco de dados à sua escolha)
- Maven
