package com.mycompany.mavenproject1.cor;

/**
 *
 * @author argen
 */

public abstract class Handler {
    protected Handler next;
    
    public void setNext(Handler next){
        this.next = next;
    }
    
    public abstract void handleRequest(Request request);
}
