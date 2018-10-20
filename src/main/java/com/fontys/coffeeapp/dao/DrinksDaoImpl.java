/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fontys.coffeeapp.dao;

import com.fontys.coffeeapp.Drink;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author eskan
 */
public class DrinksDaoImpl implements DrinksDao{
//need to inject the session factory
    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    @Transactional
    public List<Drink> getDrinks() {
        //get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();
        
        //create a query
        Query<Drink> theQuery = currentSession.createQuery("from drink", Drink.class);
        
        // execute the query and get result list
        List<Drink> drinks = theQuery.getResultList();
        
        //return the results
        return drinks;
    }
    
}
