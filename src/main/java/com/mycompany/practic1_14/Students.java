/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practic1_14;
import java.util.concurrent.Semaphore;
/**
 *
 * @author Erm
 */
public class Students implements Runnable {
    private Semaphore semaphore;
    private int number;
    
    
    @Override 
    public void run() {
        try {
            System.out.println("Student " + number + " waiting");
            semaphore.acquire();
            System.out.println("Student " + number + " eating");
            Thread.sleep(3000);             
            System.out.println("Student " + number + " exit");
            semaphore.release();
        } catch (InterruptedException ex){
            
        }
    }

    public Students(Semaphore semaphore, int number) {
        this.semaphore = semaphore;
        this.number = number;
    }
}
