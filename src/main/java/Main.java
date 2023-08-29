public class Main {
    public static void main(String[] args) {
        TiendaOnline tienda = new TiendaOnline();

        // Agrego 3 productos a mi arreglo

        Producto producto1 = new Producto("Producto 1", "Descripcion del producto 1", 1000, 5, "Categoria 1");
        Producto producto2 = new Producto("Producto 2", "Descripcion del producto 2", 1500, 8, "Categoria 1");
        Producto producto3 = new Producto("Producto 3", "Descripcion del producto 3", 2000, 3, "Categoria 2");

        tienda.agregarProducto(producto1);
        tienda.agregarProducto(producto2);
        tienda.agregarProducto(producto3);

        //Muestro los productos almacenados

        tienda.mostrarProductos();

        // Busco productos en base a su categoria

        tienda.buscarProducto("Categoria 1");

        //Modifico el producto 2 de mi arreglo

        Producto productoModificado = new Producto("Producto 2", "Nueva descripcion del producto 2", 1900, 10, "Categoria 1");
        tienda.modificarProducto("Producto 2", productoModificado);

        //Muestro los productos para verificar el cambio

        tienda.mostrarProductos();

        //Elimino el producto 1 del arreglo

        tienda.eliminarProducto("Producto 1");

        //Muestro los productos para verificar la eliminacion

        tienda.mostrarProductos();

        //realizo compra del producto 2 de 3 cantidades del stock

        tienda.realizarCompra("Producto 2", 3);

        //vuelvo a mostrar los productos del arreglo

        tienda.mostrarProductos();
    }
}
