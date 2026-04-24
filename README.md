# Labo01: Introducción a la Arquitectura N-Capas con Spring Boot

Este proyecto corresponde al primer laboratorio de la asignatura, enfocado en comprender los fundamentos de la arquitectura N-Capas y el manejo de contenedores de objetos utilizando **Spring Boot**.

## 🎯 Objetivo del Laboratorio
El objetivo principal es implementar una aplicación básica siguiendo buenas prácticas de arquitectura, logrando los siguientes hitos:
* Crear y configurar un proyecto Spring Boot desde cero.
* Comprender la configuración mediante `application.yml`.
* Entender la inversión de control (IoC) y el uso de Beans en lugar de la palabra reservada `new`.
* Implementar una estructura de capas (Entidad -> DAO -> Servicio).
* Gestión de datos en memoria para verificar la comunicación entre capas.

## 🛠 Tecnologías Utilizadas
* **Framework:** Spring Boot
* **Lenguaje:** Java
* **Gestor de dependencias:** Maven
* **Entorno de desarrollo:** IntelliJ IDEA 

## 📂 Estructura del Proyecto
El proyecto sigue una arquitectura organizada en capas:
* **domain.entities:** Representa el modelo de negocio.
* * **utils:** Contienen los datos quemados de los pokemon
* **repository:** Responsable del acceso a datos
* **Services:** Contiene la lógica de negocio, gestionado por el contenedor de Spring como Beans.

## ⚙️ Configuración
El archivo `application.yml` es utilizado para definir las propiedades básicas de la aplicación:
```yaml
server:
  port: 8080
spring:
  application:
    name: Labo01_Pokemon
