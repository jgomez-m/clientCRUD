package dao;

import java.util.List;
import javax.ejb.Local;
import model.Client;

/**
 *
 * @author Julian
 */
@Local
public interface ClientDAOLocal {
    public void addClient(Client c);
    
    public void editClient(Client c);
    
    public Client getClientById(Integer id);

    public List<Client> getAllClients();
}
