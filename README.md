# ws-biblioteca
Aplicativo web que expoem serviço JAX-WS (SOAP, WSDL) para busca de livros em uma bilbioteca

Dependência:
Por causa da classe Livro e do DAO já existentes, usando o mesmo BD, foi adicionado referencia aos .class do projeto jsf-biblioteca - https://github.com/Tudumanu/jsf-biblioteca

Libs adicionadas manualmente:

* Hibernate 5.0.9
 * hibernate-release-5.0.9.Final/lib/jpa
 * hibernate-release-5.0.9.Final/lib/required (core)
 
* JDBC-Driver
 * postgresql-9.4-1201.jdbc4

Foi adicionado como provided a lib do tomcat 8