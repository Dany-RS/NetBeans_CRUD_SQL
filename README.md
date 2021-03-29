# NetBeans_CRUD_SQL

Se trata de un proyecto sencillo que consta de un formulario diseñado con NetBeans, en donde se puede visualizar los datos de la tabla Alumnos y además se pueden realizar diferentes
operaciones con los datos, como:
- Añadir nuevos alumnos.
- Actualizar los ya existentes.
- Eliminarlos de forma lógica no física, mediante un campo que indica si está activo o no.
- Limpiar el formulario.

La BBDD está diseñada en Microsoft SQL Server, se ha creado una BBDD ESCUELA que contiene la tabla ALUMNOS con los campos:
- id: int autoincremental y campo KEY
- matricula: varchar(10)
- nombre: varchar(50)
- edad: int
- sexo: char(1)
- email: varchar(50)
- activo: int (este campo solo tendrá 2 valores, 0 para inactivos y 1 para activos)

Según se arrancla la App, se muestran los datos de la BBDD si los hubiera y esta se va refrescando automáticamente según se van añadiendo, modificando o eliminando alumnos.
Para modificar los datos de la tabla se selecciona sobre la fila de la tabla que se quiere modificar y los datos pasan al formulario automáticamente para que se modifiquen.
La baja es lógica, por lo que no se eliminan los alumnos físicamente de la tabla. Siguen estando en la BBDD con el campo: activo=0, por lo que son recuperables.
No se hacen validaciones de formato, porque es un ejercicio para conocer como desarrollar apps en NetBeans con conexión a una BBDD.
