/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Client;

/**
 *
 * @author Julian
 */
@Stateless
public class ClientDAO implements ClientDAOLocal {
    @PersistenceContext
    private EntityManager em;
    
    @Override
    public void addClient(Client c){
        try{
            em.persist(c);
        }catch (Exception ex){
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex.getMessage());
        }
    }
    
    @Override
    public void editClient(Client c){
        try{
            em.merge(c);
        }catch (Exception ex){
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex.getMessage());
        }
    }
    
    @Override
    public Client getClientById(Integer id){
        Client answer = null;
        try{
            answer = em.find(Client.class, id);
        }catch (Exception ex){
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex.getMessage());
        }
        return answer;
    }

    @Override
    public List<Client> getAllClients() {
        return em.createNamedQuery("Client.getAll").getResultList();
    }
    
    
}
