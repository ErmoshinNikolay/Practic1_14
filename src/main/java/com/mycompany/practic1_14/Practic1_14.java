/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practic1_14;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Erm
 */
public class Practic1_14 {

    public static void main(String[] args) {
         System.out.println("Практическая работа 1.14 Ермошин РИБО-03-22");
         Semaphore semaphore = new Semaphore(2);
          for (int i = 1; i < 8; i++) {
            Thread studentThread = new Thread(new Students(semaphore, i));
            studentThread.start();
          }
                 
    }
}
