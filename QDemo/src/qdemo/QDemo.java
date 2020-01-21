/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qdemo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 *
 * @author AJAY
 */
public class QDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1234);
        q.add(124);
        q.offer(23);
        System.out.println(q);
        
        ArrayBlockingQueue<Integer> q1;
        q1 = new ArrayBlockingQueue<>(3);
        
        q1.add(12);
        q1.add(24);
        q1.add(36);
    

        q1.remove();
                q1.offer(48);
        
        System.out.println(q1);
        
        
    }
    
}
