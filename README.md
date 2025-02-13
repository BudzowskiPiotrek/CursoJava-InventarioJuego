# CursoJava - InventarioJuego
Desarrolla un programa que modele el inventario de un personaje en un juego de rol. El inventario almacenará diferentes tipos de objetos, cada uno con atributos específicos según su categoría
(arma, poción, material).

Crea una clase Objeto con los siguientes atributos:
• nombre (String): Nombre del objeto. // categoria (String): Categoría del objeto (puede ser "Arma", "Poción" o "Material"), aunque hay un tipo de clases especifica para controlar este
tipo de atributos ahora mismo lo haremos de forma manual comprobando que el valor introducido es Arma, Pocion o Material y en el caso de que no sea ninguna de estos por defecto
será Material. // peso (float): Peso del objeto. // descripcion (String): Breve descripción del objeto.

Agrega métodos en la clase Objeto para:
• Mostrar los detalles del objeto (mostrarDetalles): Imprime todos los atributos del objeto de forma legible.

Crea una clase Inventario que contenga un array de objetos Objeto (50 objetos). Esta clase debe incluir:
• Agregar objeto: Permite añadir un objeto al inventario.
• Eliminar objeto: Elimina un objeto del inventario por su nombre.
• Listar objetos: Muestra una lista de todos los objetos del inventario, indicando su nombre, categoría y peso.
• Filtrar objetos por categoría: Devuelve todos los objetos de una categoría específica.
• Calcular peso total: Suma el peso de todos los objetos en el inventario y lo devuelve.

En el main:
• Permite al usuario agregar objetos al inventario, especificando sus atributos (nombre, categoría, peso, descripción).
• Implementa un menú con opciones para:
• Agregar un nuevo objeto.
• Eliminar un objeto por su nombre.
• Listar todos los objetos.
• Consultar los objetos por categoría.
• Mostrar el peso total del inventario.
• salir del programa.
