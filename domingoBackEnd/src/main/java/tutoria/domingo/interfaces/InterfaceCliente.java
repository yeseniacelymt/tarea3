package tutoria.domingo.interfaces;

import org.springframework.data.repository.CrudRepository;
import tutoria.domingo.modelo.Cliente;

public interface InterfaceCliente extends CrudRepository<Cliente,Integer>{
    
}
