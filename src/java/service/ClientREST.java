/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.ClientDAOLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Client;

/**
 *
 * @author Julian
 */
@Stateless
@Path("/clients")
public class ClientREST {

    @EJB
    private ClientDAOLocal dao;
    
    @GET
    @Path("/findAll")
    @Produces({MediaType.APPLICATION_XML})
    public List<Client> findAll() {
        List<Client> list = dao.getAllClients();
        return list;
    }
}
