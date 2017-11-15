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
public class OfficeManager extends LoginAccount {

    private AccountType accountType;
    
    public OfficeManager(Person p, String aUserName, String aPassword) {
        super(p, aUserName, aPassword);
        accountType = AccountType.OFFICE_MANAGER;
    }

    @Override
    public AccountType getType() {
        return accountType;
    }
    
}
