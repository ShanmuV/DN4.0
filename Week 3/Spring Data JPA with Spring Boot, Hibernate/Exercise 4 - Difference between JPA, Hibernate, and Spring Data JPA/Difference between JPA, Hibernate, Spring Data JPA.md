# Difference between JPA, Hibernate, Spring Data JPA

## JPA - Java Persistence API

- It is an Application Programming Interface, which only consists of the Specification, or in Java terms, it is just an Interface.
- It also contains Annotation tags such as `@Entity`, `@Column`, `@Id`, etc.
- JPA alone cant work. It needs an Implementation.

## Hibernate

- Hibernate is a Java Implementation of the JPA.
- It is one of the popular Implementation of JPA, because it provides everything defined in JPA and more like Caching, and custom queries
- We can use Hibernate in its own without any problem, but it has a lot of boiler plate code and could be messy.

## Spring Data JPA

- Spring Data JPA is a wrapper to any JPA implementation like Hibernate.
- It takes the JPA implementation and wraps it up with code such that we can use minimal amount of code to use hibernate.
- With the help of spring, we do not need to implement any function ourselves, we can just extend the interface into another and Spring will take care the rest for us.

## In Table format

|         JPA          |            Hibernate             |          Spring Data JPA          |
| :------------------: | :------------------------------: | :-------------------------------: |
|  Just an Interface   |      Implementation of JPA       | Wrapper of Implementation of JPA  |
| Provides Annotations |     Provides actual methods      |     Reduces Boiler plate code     |
|   Cant work alone    | Can work alone, but can be messy | Best practice, as it reduces code |
