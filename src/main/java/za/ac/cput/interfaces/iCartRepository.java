package za.ac.cput.interfaces;

/* iCartRepository.java
Interface for the Cart Repository
Author: David Henriques Garrancho (221475982)
Date: 20 March 2023
*/

import za.ac.cput.domain.Cart;

import java.util.Set;

public interface iCartRepository {
    public Set<Cart> getAll();
}