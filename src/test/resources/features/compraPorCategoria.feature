#language:es
Característica: categoria producto


  Escenario: agregar producto
    Dado que el usuario se encuentra en la categoria infantil
    Cuando seleccione el producto
    Y agregue la cantidad del producto
    Y agregar al carrito de compras
    Entonces se visualizara el producto en el carrito de compras
    Y volvera a la pantalla de inicio