/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

/**
 *
 * @author andyluong
 */
public abstract class Observer {
    
    protected Subject subject;
    
    /**
     * Changed message
     * @param message Text input
     */
    public abstract void messageChanged(String message);
    
    
}
