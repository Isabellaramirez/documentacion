# language: es
  #Autor Isabella
Característica:Agregar un producto al carrito y eliminarlo
  Como usuario de saucedemo autenticado
  Quiero poder agregar productos y poderlos eliminar de mi carrito
  Para comprobar que todo esta en orden

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de Saucedemo
    Cuando ingrese las credenciales correctas (username y password)
      | username | password |
      |standard_user| secret_sauce |

  @AgregarYeliminar
  Escenario: Agregar productos al carrito exitosamente
    Cuando Selecciona el producto de la lista lo agrega al carrito navega al carrito para eliminar el producto escogido
    Entonces el usuario podra visualizar el carrito vacio

