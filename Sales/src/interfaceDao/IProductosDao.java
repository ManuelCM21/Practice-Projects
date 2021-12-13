
package interfaceDao;

import entidades.Producto;
import java.util.ArrayList;

public interface IProductosDao {
    
    public int registrarProducto(Producto p);
    
    public int actualizarRegistroProducto(Producto p);
    
    public int eliminarRegistroProducto(String id);
    
    public ArrayList<Producto> reporteProductos();
    
}
