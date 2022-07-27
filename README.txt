README:
El presente proyecto requirió la utilización de archivos .fxml generados a partir del software 
Scene Builder. Los archivos .fxml son:

	- base.fxml 		: Archivo que contiene el lienzo base de tipo BorderPane de la aplicación.
	- carrito.fxml		: Archivo que contiene el lienzo donde se visualiza el pedido y su
			 	 respectivo total. El lienzo es de tipo Pane.
	- listo.fxml		: Archivo que contiene el lienzo cierre de la aplicación. El lienzo es de
				  tipo Pane.
	- menu.fxml		: Archivo que contiene el lienzo con la escena principal de la aplicación
				  donde se muestran los productos disponibles.
	- personalizacion.fxml	: Archivo que contiene el lienzo capaz de mostrar la imagen de referencia 
				  del producto y permitir al usuario personalizar el tamaño de su orden.

Para la correcta ejecución del movimiento entre escenas, existe una clase que controle cada archivo .fxml.
	
	- Clase BaseController.java, es la encargada de controlar y responder a acciones del usuario 
	  correspondiente a el archivo base.fxml.

	- Clase CarritoController.java, es la encargada de controlar y responder a acciones del usuario 
	  correspondiente a el archivo carrito.fxml.

	- Clase ListoController.java, es la encargada de controlar y responder a acciones del usuario 
	  correspondiente a el archivo listo.fxml.

	- Clase MenuController.java, es la encargada de controlar y responder a acciones del usuario 
	  correspondiente a el archivo menu.fxml.

	- Clase PersonalizacionContoller.java, es la encargada de controlar y responder a acciones del 
	  usuario correspondiente a el archivo personalizacion.fxml.

Existe además otras clases, la clase Main, la clase Cafes y la clase Controller.

	- Clase Main.java es la encargada de construir una instancia de Controller.
	- Clase Cafes.java es la encargada de todos los atributos y métodos de cada café.
	- Clase Controller.java es la encargada de realizar la comunicación entre las distintas clases 
	  XController para un correcto movimiento entre Panes.

Para una correcta implementación del proyecto compilar y ejecutar en software IntelliJ. 


Nombres de programadores: 	- Matias Valenzuela	rol: 201821015-3
				- Diego Sepulveda	rol: 201704156-0
				- Britney Sandon	rol: 201821060-9
				- Jorge Álvarez 	rol: 201721065-6


Fecha: 27/07/2022.

