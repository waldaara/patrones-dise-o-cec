package com.mycompany.mavenproject1.cor;

/**
 *
 * @author argen
 */
public class Client {
    public static void main(String[] args) {
        
        Handler h1 = new clientSupportDep();
        Handler h2 = new techDep();
        Handler h3 = new inventoryManager();
        Handler h4 = new storeManager();
        
        h1.setNext(h2);
        h2.setNext(h3);
        h3.setNext(h4);
        
        h1.handleRequest(new Request());
    }
}
