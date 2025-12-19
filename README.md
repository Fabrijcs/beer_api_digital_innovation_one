<h2>Digital Innovation: Expert class - Desenvolvimento de testes unitários para validar uma API REST de gerenciamento de estoques de cerveja.</h2>

Nesta live coding, vamos aprender a testar, unitariamente, uma API REST para o gerenciamento de estoques de cerveja. Vamos desenvolver testes unitários para validar o nosso sistema de gerenciamento de estoques de cerveja, e também apresentar os principais conceitos e vantagens de criar testes unitários com JUnit e Mockito. Além disso, vamos também mostrar como desenvolver funcionalidades da nossa API através da prática do TDD.

Durante a sessão, serão abordados os seguintes tópicos:

* Baixar um projeto através do Git para desenolver nossos testes unitários. 
* Apresentação conceitual sobre testes: a pirâmide dos tipos de testes, e também a importância de cada tipo de teste durante o ciclo de desenvolvimento.
* Foco nos testes unitários: mostrar o porque é importante o desenvolvimento destes tipos de testes como parte do ciclo de desenvolvimento de software.
* Principais frameworks para testes unitários em Java: JUnit, Mockito e Hamcrest. 
* Desenvolvimento de testes unitários para validação de funcionalides básicas: criação, listagem, consulta por nome e exclusão de cervejas.
* TDD: apresentação e exemplo prático em 2 funcionaliades importantes: incremento e decremento do número de cervejas no estoque.

Para executar o projeto no terminal, digite o seguinte comando:

```shell script
mvn spring-boot:run 
```

Para executar a suíte de testes desenvolvida durante a live coding, basta executar o seguinte comando:

```shell script
mvn clean test
```

Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

```
http://localhost:8080/api/v1/beers
```

São necessários os seguintes pré-requisitos para a execução do projeto desenvolvido durante a aula:

* Java 14 ou versões superiores.
* Maven 3.6.3 ou versões superiores.
* Intellj IDEA Community Edition ou sua IDE favorita.
* Controle de versão GIT instalado na sua máquina.
* Muita vontade de aprender e compartilhar conhecimento :)

Abaixo, seguem links bem bacanas, sobre tópicos mencionados durante a aula:

* [SDKMan! para gerenciamento e instalação do Java e Maven](https://sdkman.io/)
* [Referência do Intellij IDEA Community, para download](https://www.jetbrains.com/idea/download)
* [Palheta de atalhos de comandos do Intellij](https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf)
* [Site oficial do Spring](https://spring.io/)
* [Site oficial JUnit 5](https://junit.org/junit5/docs/current/user-guide/)
* [Site oficial Mockito](https://site.mockito.org/)
* [Site oficial Hamcrest](http://hamcrest.org/JavaHamcrest/)
* [Referências - testes em geral com o Spring Boot](https://www.baeldung.com/spring-boot-testing)
* [Referência para o padrão arquitetural REST](https://restfulapi.net/)
* [Referência pirâmide de testes - Martin Fowler](https://martinfowler.com/articles/practical-test-pyramid.html#TheImportanceOftestAutomation)

[Neste link](https://drive.google.com/file/d/1KPh19mvyKirorOI-UsEYHKkmZpet3Ks6/view?usp=sharing), seguem os slides apresentados como o roteiro utilizado para o desenvolvimento do projeto da nossa sessão.


# Beer Stock API - Digital Innovation One

## 👨‍💻 Desenvolvido por: Fabrício José

### 🍺 Sobre o Projeto
Este projeto foi desenvolvido durante a Expert Class da DIO, focada no desenvolvimento de testes unitários para validar uma API REST de gerenciamento de estoques de cerveja.

### 🚀 Meus Desafios e Superações
Durante a execução deste projeto, enfrentei e resolvi os seguintes desafios técnicos para garantir que a aplicação rodasse em um ambiente moderno:

1. **Migração para Java 17**: Atualizei o projeto original (que usava versões anteriores) para o JDK 17, ajustando as propriedades do Maven.
2. **Correção de Dependências (POM.xml)**: Resolvi erros críticos de sintaxe XML e conflitos de versões de bibliotecas como Lombok e MapStruct.
3. **Incompatibilidade do Swagger**: Identifiquei e resolvi um erro de compilação causado pela biblioteca Springfox (Swagger), que é incompatível com o `Predicate` do Java moderno. Optei por remover a dependência para priorizar um Build estável e funcional.
4. **Refatoração de Interfaces**: Limpei as anotações legadas da interface `BeerControllerDocs`, garantindo que o projeto compilasse sem erros de pacotes inexistentes.
5. **Garantia de Testes (TDD)**: Executei com sucesso a suíte de 13 testes unitários para garantir a integridade das regras de negócio (incremento, decremento e estoque máximo).

### 🛠️ Tecnologias Utilizadas
* Java 17 / Spring Boot 2.7.18
* Maven (Build Tool)
* JUnit 5 / Mockito / Hamcrest (Testes)
* Banco de Dados H2 (Em memória)

---

### 📋 Como Executar o Projeto
1. **Compilar e limpar:**
   ```bash
   ./mvnw clean compile -DskipTests

2. **Executar a API:**
   ```bash
   ./mvnw spring-boot:run -DskipTests

3. **Rodar os Testes:**
   ```bash
   ./mvnw clean test

A API estará disponível em: http://localhost:8080/api/v1/beers