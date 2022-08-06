#language: es
Característica: cancelacion compra

  Antecedentes:
    Dado que el usuario se encuentra en la pagina
    Cuando ingrese usuario y clave
    Entonces se visualizara la pagina logueada

  Escenario: cancelacion compra de los productos
    Dado que el usuario se encuntre en la barra de busqueda
    Cuando seleccione tres productos al carrito de compra buscado por el navegador
    Y llene los datos de compra
    Y cancele la compra
    Entonces se visualizara el carrito de compras vacio