/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;
import java.io.Serializable;
/**
 *
 * @author andyluong
 */
public class WarehouseManager extends LoginAccount, Serializable {
    
    public WarehouseManager(Person p, String aUserName, String aPassword) {
        super(p, aUserName, aPassword);
    }
    
}
