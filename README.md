**Sistema de Contenidos Audiovisuales (POO)**

**Descripción del Proyecto**

**Este proyecto fue desarrollado en Java como parte de la asignatura de Programación Orientada a Objetos.**

**Su objetivo es modelar diferentes tipos de contenidos audiovisuales aplicando conceptos como herencia, polimorfismo y relaciones entre clases.**

**El sistema permite crear y mostrar información de distintos tipos de contenido como:**

**•	Películas**

**•	Series de TV**

**•	Documentales**

**•	Contenido en Streaming**

**•	Anime**

**Objetivos**

**•	Aplicar conceptos de Programación Orientada a Objetos.**

**•	Implementar herencia mediante una clase abstracta.**

**•	Utilizar polimorfismo para manejar diferentes tipos de contenido.**

**•	Integrar relaciones entre clases (asociación).**

**Estructura del Proyecto**

&#x20;**Clase Base**

**•	ContenidoAudiovisual (abstracta)**

&#x20;**Subclases**

**•	Pelicula**

**•	SerieDeTV**

**•	Documental**

**•	Streaming ✅ (agregada)**

**•	Anime ✅ (agregada)**

&#x20;**Clases adicionales**

**•	Actor**

**•	Temporada**

**•	Investigador**

**Relaciones Implementadas**

**•	Streaming → Investigador (Asociación)**

**•	Anime → Actor (Relación)**

**•	Anime → Temporada (Relación)**

**Estas relaciones permiten enriquecer la información mostrada de cada contenido audiovisual.**

**Funcionalidades**

**•	Creación de objetos de diferentes tipos de contenido.**

**•	Uso de un arreglo de tipo ContenidoAudiovisual.**

**•	Aplicación de polimorfismo mediante el método mostrarDetalles().**

**•	Visualización de información en consola.**

**Ejecución del Proyecto**

**Requisitos**

**•	Java JDK 8 o superior**

**•	Eclipse o cualquier IDE compatible**

**Pasos**

**1.	Clonar el repositorio:**

**git clone https://github.com/tu-usuario/tu-repositorio.git**

**2.	Abrir el proyecto en Eclipse.**

**3.	Ejecutar la clase:**

**PruebaAudioVisual.java**

**Ejemplo de Salida**

**Detalles del Streaming:**

**ID: 3**

**Título: Cosmos**

**Duración: 45**

**Género: Science**

**Plataforma: Netflix**

**Idioma: Inglés**

**Original: Sí**

&#x20;  **• Investigador: Carl Sagan | Astronomía (NASA)**

**Estructura de Carpetas**

**src/**

&#x20;**├── poo/**

&#x20;**│    └── PruebaAudioVisual.java**

&#x20;**└── uni1a/**

&#x20;     **├── ContenidoAudiovisual.java**

&#x20;     **├── Pelicula.java**

&#x20;     **├── SerieDeTV.java**

&#x20;     **├── Documental.java**

&#x20;     **├── Streaming.java**

&#x20;     **├── Anime.java**

&#x20;     **├── Actor.java**

&#x20;     **├── Temporada.java**

&#x20;     **└── Investigador.java**

**Autor**

**•	José Hernán Carrión patiño**

**Notas**

**Este proyecto forma parte de una práctica académica enfocada en el uso de Programación Orientada a Objetos en Java.**





