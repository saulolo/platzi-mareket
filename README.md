# Platzi Market 🛒

_Saul Echeverri_   
_Edición: 2024_

![Portada del Proyecto](https://github.com/saulolo/platzi-market/blob/main/src/main/resources/static/PlatziMarket.webp)

## Descripción 📄
Platzi Market es una API RESTful para la gestión de un mercado virtual. Este proyecto fue desarrollado utilizando Java, Spring Boot y PostgreSQL.

Este repositorio es de carácter **Educativo** con fines de estudio sobre la iniciación del aprendizaje del lenguaje
de **Java** con **Spring Boot**.


## Tabla de Contenidos 📚
- [Instalación](#instalación-)
- [Uso](#uso-)
- [Estructura del Proyecto](#estructura-del-proyecto-)
- [Características](#características-)
- [Contribuciones](#contribuciones-)
- [Autor](#autor-)
- [Licencia](#licencia-)
- [Expresiones de Gratitud ](#expresiones-de-gratitud-)
- [Créditos y Contactos](#créditos-y-contactos-)


## Instalación 🛠️

### Prerrequisitos ✅
Este proyecto requiere ciertos pre-requisitos para su ejecución:

#### Java Development Kit (JDK)
_Debes tener instalado Java Development Kit (JDK) en tu sistema. Este proyecto requiere JDK 21 o una versión superior.
Puedes descargar y configurar JDK desde el sitio oficial de Oracle o OpenJDK:_

- [Oracle JDK](https://www.oracle.com/java/technologies/downloads/)
- [OpenJDK](https://openjdk.java.net/)

#### Git
_Git es necesario para clonar el repositorio del proyecto y gestionar versiones del código fuente. Puedes descargar Git
desde:_

- [git-scm.com](https://git-scm.com/)

#### PostgreSQL
_Se utiliza PostgreSQL como sistema de gestión de bases de datos. Asegúrate de tener PostgreSQL instalado y configurado
para poder ejecutar el proyecto._
- [postgresql.org](https://www.postgresql.org/)

#### Spring Boot
_Spring Boot es utilizado como framework para la construcción de aplicaciones Java. Más información en:_
- [spring.io/projects/spring-boot](https://spring.io/projects/spring-boot)

#### Maven
_Maven es una herramienta de gestión y comprensión de proyectos utilizada en la construcción del proyecto. Puedes descargar Maven desde:_
- [maven.apache.org](https://maven.apache.org/)

#### IDE (Entorno de Desarrollo Integrado)
_Un IDE facilita el desarrollo de aplicaciones. Puedes elegir entre:_
- **IntelliJ IDEA:** [jetbrains.com/idea](https://www.jetbrains.com/idea/)
- **Eclipse:** [eclipse.org](https://www.eclipse.org/)
- **Visual Studio Code:** [code.visualstudio.com](https://code.visualstudio.com/)

#### Herramientas para Pruebas de API
_Para probar y desarrollar tus API REST, puedes usar herramientas como Postman o Insomnia._
- **Postman:** [postman.com](https://www.postman.com/)
- **Insomnia:** [insomnia.rest](https://insomnia.rest/)

#### Docker
_Si deseas contenedorar tu aplicación, Docker puede ser útil para crear imágenes y contenedores para despliegue._
- **Docker:** [docker.com](https://www.docker.com/)

#### Heroku/AWS/Azure
_Para despliegue en la nube, puedes considerar utilizar:_
- **Heroku:** [heroku.com](https://www.heroku.com/)
- **AWS:** [aws.amazon.com](https://aws.amazon.com/)
- **Azure:** [azure.microsoft.com](https://azure.microsoft.com/)


### Pasos para la Instalación 📥
Antes de comenzar, asegúrate de tener los siguientes requisitos previos en tu sistema:

- Debes tener instalado Java Development Kit (JDK) en tu sistema.
  Para verificar si Java está instalado, puedes abrir una terminal y ejecutar el siguiente comando:

   ```shell
   java -version

A continuación, se describen los pasos para configurar y ejecutar este proyecto Java en tu entorno de desarrollo.
 
1. Clona el repositorio
   ```sh
   git clone https://github.com/tu_usuario/platzi-market.git
**Nota:**  Asegúrate de que tu sistema tenga configuradas las variables de entorno JAVA_HOME y PATH para que apunten a tu instalación de JDK.

_Configuración de Variables de Entorno:_
Este proyecto utiliza variables de entorno para la configuración de la base de datos. Deberás configurar las siguientes variables de entorno en tu sistema:

- `DATABASE_URL`: La URL de tu base de datos PostgreSQL.
- `DATABASE_USERNAME`: El nombre de usuario de tu base de datos.
- `DATABASE_PASSWORD`: La contraseña de tu base de datos.

Puedes configurar estas variables de entorno en tu sistema operativo o en tu IDE si lo soporta. También puedes crear un archivo `.env` en la raíz de tu proyecto y definir las variables de entorno allí. Asegúrate de no subir este archivo a tu repositorio de código para proteger tus credenciales de base de datos.

2. Navega al directorio del proyecto
   ```sh
   cd platzi-market
   
3. Configura la base de datos en el archivo application.properties
   ```sh
   spring.datasource.url=jdbc:postgresql://localhost:5432/platzi_market
   spring.datasource.username=tu_usuario
   spring.datasource.password=tu_contraseña
   
4. Instala las dependencias
   ```sh
   mvn install
   
5. Ejecuta la aplicación
   ```sh
   mvn spring-boot:run

## Uso 🚀
Para probar los endpoints de la API, puedes usar herramientas como Postman o Insomnia.

### Ejemplo de Petición 📋
1. Obtener todos los productos
   ```sh
   GET http://localhost:8090/platzi-market/api/products/all
2. Obtener producto por ID
   ```sh
   GET http://localhost:8090/platzi-market/api/products/{productId}


## Estructura del Proyecto 📁
La estructura del proyecto es la siguiente:
   ```md
    platzi-market/
    │
    ├── src/
    │   ├── main/
    │   │   ├── java/
    │   │   │   └── com/
    │   │   │       └── platzi/
    │   │   │           └── market/
    │   │   │               ├── domain/
    │   │   │               │   └── repository/
    │   │   │               ├── persistence/
    │   │   │               │   ├── crud/
    │   │   │               │   ├── entity/
    │   │   │               │   └── mapper/
    │   │   │               └── web/
    │   │   │                   └── controller/
    │   │   └── resources/
    │   │       └── application.properties
    │   └── test/
    └── pom.xml

   ```

### Descripción de los Directorios Principales 📂
- `domain`: Contiene las entidades del dominio.
- `persistence`: Contiene los repositorios y la lógica de acceso a datos.
- `service`: Contiene la lógica de negocio.
- `web`: Contiene los controladores de la API.


## Características 🌟
- Gestión de productos
- Gestión de categorías
- Gestión de clientes
- Gestión de compras


## Contribuciones 🤝
¡Gracias por tu interés en contribuir a este proyecto! Aquí hay algunas reglas y pautas para enviar contribuciones:

### Reglas para Enviar Solicitudes de Extracción (Pull Requests) 🔀

1. Antes de enviar una solicitud de extracción, asegúrate de que tu código esté bien probado y sea compatible con la rama principal.
2. Sigue un estilo de código consistente.
3. Si tu contribución agrega nuevas características, proporciona documentación clara sobre cómo utilizar esas características.
4. Haz un fork del proyecto.
5. Crea una nueva rama (`git checkout -b feature/AmazingFeature`).
6. Realiza tus cambios (`git commit -m 'Add some AmazingFeature'`).
7. Haz push a la rama (`git push origin feature/AmazingFeature`).
8. Abre un Pull Request.

### Informar Problemas 🐞
Si encuentras errores o problemas en el proyecto, por favor, abre un issue para informarme. Proporciona detalles claros 
sobre el problema, incluyendo pasos para reproducirlo.

### Comunicación 💬
Me encanta escuchar tus ideas y responder tus preguntas. Siempre puedes [contactarme](https://www.linkedin.com/in/saul-echeverri-duque/) para discutir el proyecto o plantear cualquier pregunta que tengas.

¡Espero que te unas a mi comunidad de contribuyentes y espero tus valiosas contribuciones!

### ¿Dónde obtener ayuda? 🆘
Si tienes preguntas o necesitas ayuda durante el proceso de contribución, no dudes en [contactarme](https://www.linkedin.com/in/saul-echeverri-duque/) o abrir un issue para obtener asistencia.

¡Espero trabajar contigo en este proyecto y agradecemos tu ayuda para mejorarlo!


## Autor ✒️
¡Hola! Soy **Saul Echeverri 👨**, el creador y desarrollador de este proyecto. Permíteme compartir un poco sobre 
mi formación y experiencia:

### Formación Académica 📚
- 🎓 Graduado en Tecnología en Análisis y Desarrollo de Software e Ingenieria de Alimentos de profesión por la
  Universidad de Antioquia y el SENA en Colombia.

### Trayectoria Profesional 💼
- 👨‍💻 Cuento con casi dos años de experiencia laboral (a Hoy Julio de 2024) en el campo del desarrollo de software.
- 🌟 Durante mi trayectoria, he tenido el privilegio de trabajar en diversos proyectos tecnológicos, donde he aplicado mis conocimientos en programación y análisis.
- 🏢 Actualmente, formo parte de [Cidenet](https://cidenet.com.co/), una empresa de software en Medellín, Colombia, donde sigo creciendo profesionalmente y contribuyendo al mundo de la tecnología.

### Pasión por la Programación 🚀
- 💻 Mi viaje en el mundo de la programación comenzó en el 2021, y desde entonces, he estado inmerso en el emocionante universo del desarrollo de software.
- 📚 Uno de mis mayores intereses y áreas de enfoque es Java, y este proyecto es el resultado de mi deseo de compartir conocimientos y experiencias relacionadas con este lenguaje.
- 🤝 Estoy emocionado de colaborar y aprender junto a otros entusiastas de Java.

Estoy agradecido por la oportunidad de compartir este proyecto contigo y espero que te sea útil en tu propio camino de aprendizaje y desarrollo. Si tienes alguna pregunta, sugerencia o simplemente quieres charlar sobre tecnología, no dudes en ponerte en contacto conmigo. ¡Disfruta explorando el mundo de Java!


## Licencia 📜
Este proyecto, platzi-market, es desarrollado por **Saul Echeverri**, en el cual se construye una aplicación de gestión 
de un mercado virtual.
El proyecto se basa en el **"Curso de Java Spring"** de Alejandro Ramírez de la plataforma platzi y se desarrolla con 
fines 
educativos y de aprendizaje del lenguaje de Java con Spring Boot.
La utilización del código y los contenidos de este proyecto se realiza de forma libre pero en concordancia con los 
derechos de uso permitidos por el autor.

**Nota Importante**: Este proyecto no se distribuye bajo una licencia de código abierto estándar, ya que está 
destinado principalmente para fines personales y educativos. Si deseas utilizar o distribuir el contenido de este 
proyecto más allá de los fines permitidos por Saul Echeverri, asegúrate de obtener los permisos necesarios.

Es importante respetar los derechos de autor y las restricciones legales asociadas con el contenido desarrollado por
**Saul Echeverri**.


## Expresiones de Gratitud  🎁
Quiero expresar mi más sincero agradecimiento a [Alejandro Ramírez](https://platzi.com/profes/soyalejoramirez/), 
autor del "Curso de Java Spring", cuya obra ha sido la fuente de inspiración y aprendizaje fundamental para este 
proyecto. Su dedicación a la enseñanza y la claridad de su contenido han sido invaluables para mí durante la 
creación de este proyecto y mi aprendisaje continuo.

Tambien quiero expresar mi más sincero agradecimiento a todos los que han contribuido a este proyecto, ya sea con 
código, ideas, reportes de errores, o simplemente utilizando y compartiendo el proyecto.

Si encuentras este proyecto útil y te gustaría expresar tu gratitud de alguna manera, aquí hay algunas opciones:

* Comenta a otros sobre este proyecto 📢: Comparte este proyecto con tus amigos, colegas o en tus redes sociales para que otros también puedan beneficiarse de él.

* Invita una cerveza 🍺 o un café ☕ a alguien del equipo: Siéntete libre de mostrar tu aprecio por el esfuerzo del autor o del único miembro del equipo (yo) comprándoles una bebida virtual.

* Da las gracias públicamente 🤓: Puedes expresar tu agradecimiento públicamente en el repositorio del proyecto, en los comentarios, o incluso en tu blog personal si lo deseas.

* **Dona a través de una cuenta bancaria** 💰: Si prefieres hacer una donación en efectivo o mediante transferencia bancaria, puedes hacerlo a la siguiente cuenta de ahorros en Bancolombia: 2301-5881-151. Tu generosidad será muy apreciada y contribuirá al mantenimiento y mejora de este proyecto.

¡Gracias por ser parte de este viaje de aprendizaje y desarrollo!


---
## Créditos y Contactos ✉️

Este proyecto fue desarrollado con ❤️ por [Saul Echeverri](https://github.com/saulolo) 😊.
Proyecto Link: [https://github.com/saulolo/platzi-market](https://github.com/saulolo/platzi-market)

Si tienes preguntas, comentarios o sugerencias, no dudes en ponerte en contacto conmigo:

- GitHub: [Saul Echeverri](https://github.com/saulolo) 🌐
- Correo Electrónico: saulolo@gmail.com 📧
- LinkedIn: [Saul Echeverri](https://www.linkedin.com/in/saul-echeverri-duque/) 💼
- Telefono: (+57) 318 211 0955 📞

_¡Gracias por ser parte de este proyecto!_ 😊
