import java.util.ArrayList;
import java.util.List;

class TiendaOnline {
    private List<Producto> productos;

    public TiendaOnline() {
        productos = new ArrayList<>();
    }

    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos disponibles en la tienda.");
        } else {
            System.out.println("Productos disponibles:");
            for (Producto producto : productos) {
                System.out.println("Nombre: " + producto.getNombre());
                System.out.println("Descripcion: " + producto.getDescripcion());
                System.out.println("Precio: " + producto.getPrecio());
                System.out.println("Stock: " + producto.getStock());
                System.out.println("Categoria: " + producto.getCategoria());
                System.out.println();
            }
        }
    }

    public void buscarProducto(String busqueda) {
        boolean encontrado = false;
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(busqueda) || producto.getCategoria().equalsIgnoreCase(busqueda)) {
                System.out.println("Nombre: " + producto.getNombre());
                System.out.println("Descripcion: " + producto.getDescripcion());
                System.out.println("Precio: " + producto.getPrecio());
                System.out.println("Stock: " + producto.getStock());
                System.out.println("Categoria: " + producto.getCategoria());
                System.out.println();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ningun producto con el nombre o categoría especificados.");
        }
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("El producto ha sido agregado exitosamente.");
    }

    public void modificarProducto(String nombre, Producto productoModificado) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                productos.set(i, productoModificado);
                System.out.println("El producto ha sido modificado exitosamente.");
                return;
            }
        }
        System.out.println("No se encontro ningún producto con el nombre especificado.");
    }

    public void eliminarProducto(String nombre) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                productos.remove(i);
                System.out.println("El producto ha sido eliminado exitosamente.");
                return;
            }
        }
        System.out.println("No se encontro ningún producto con el nombre especificado.");
    }

    public void realizarCompra(String nombre, int cantidad) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                if (producto.getStock() >= cantidad) {
                    int stockActualizado = producto.getStock() - cantidad;
                    producto.setStock(stockActualizado);
                    System.out.println("La compra ha sido realizada exitosamente.");
                    return;
                } else {
                    System.out.println("No hay suficiente stock disponible para realizar la compra.");
                    return;
                }
            }
        }
        System.out.println("No se encontro ningun producto con el nombre especificado.");
    }
}
