Spring Boot

application.properties: contiene la configuración general de spring

-Inyección de dependencias: avisarle al controller mediante el constructor que depende de un Service, entonces instancia a un Services y todas sus dependencias.

“En el @Controller pudimos agregar un atributo y dejar que Spring realice la inyección de dependencias por nosotros. Spring realizará la inyección de dependencias de todos los objetos que gestione, ya sean @Controller, @Service, @Repository y otros. 
Para indicarle a Spring que realice la inyección de dependencias de una clase, basta con:
1. Agregar un atributo final a la clase que será inyectada 
2. Agregar un constructor que reciba una instancia de dicho atributo, y la setee.  
“


-Model: objetos que irán al template para la vista

-@Service : Las clases de negocio son aquellas que contienen métodos que resuelven el flujo principal del negocio de nuestra aplicación.
-@Controller
-@Autowired : reemplazar constructor

-Thymeleaf: Thymeleaf es una librería de presentación que nos permite generar HTML de forma dinámica. Es decir, el HTML se generá en el servidor, a partir de las plantillas HTML que armemos. 


-Java Persistence API (JPA): conjunto de utilidades de Java (interfaces) para indicarle a una clase que está relacionada con una tabla. 
Técnica de uso ORM (Object Relational Mapping).

Una clase se asocia a una tabla
Cada atributo se asocia a un columna
Cada instancia se asocia a una fila

Hibernate es la implementación más famosa de JPA

@Entity : clase asociada con una tabla en bd, se asume nombre tabla = nombre clase
@Table: indicar nombre tabla diferente
@Id: indica que el atributo es la clave primaria en bd
@GeneratedValue: cómo se generará el valor @id

@Colum manualmente el nombre de la columna

-Repository: clases que se encargan de interactuar con bd (crud)

-JPARepository: spring definirá la interfaz... extends JpaRepository<clase con JPA que gestionará el repository, Integer--tipo atributo anotado con @Id>

Métodos: finAll(), findById(), save(), delete()

@ManyToOne
@JoinColum para indicar nombre de columna diferente
@Query : consultas personalizados

-JPQL: consultas JPA sobre los objetos mapeados
-Nativo