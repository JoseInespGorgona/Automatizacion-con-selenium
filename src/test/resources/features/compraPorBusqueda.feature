#language: es
Característica: cancelacion compra

  Antecedentes:
    Dado que el usuario se encuentra en la pagina
    Cuando ingrese usuario y clave
    Entonces se visualizara la pagina logueada

    Dado que el usuario se encuentra en la categoria infantil
    Cuando seleccione el producto
    Y agregue la cantidad del producto
    Y agregar al carrito de compras
    Entonces se visualizara el producto en el carrito de compras
    Y volvera a la pantalla de inicio

  Escenario: cancelacion compra de los productos
    Dado que el usuario se encuntre en la barra de busqueda
    Cuando seleccione tres productos al carrito de compra buscado por el navegador
    Y llene los datos de compra
    Y cancele la compra
    Entonces se visualizara el carrito de compras vacio