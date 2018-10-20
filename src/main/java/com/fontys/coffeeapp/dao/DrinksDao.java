/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fontys.coffeeapp.dao;

import com.fontys.coffeeapp.Drink;
import java.util.List;

/**
 *
 * @author eskan
 */
public interface DrinksDao {
    public List<Drink> getDrinks();
}
