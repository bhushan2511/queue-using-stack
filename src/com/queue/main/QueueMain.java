package com.queue.main;

import com.queue.implementation.QueueUsingStack;

public class QueueMain {

    public static void main(String[] args) {
        QueueUsingStack queueImpl= new QueueUsingStack();
        
        queueImpl.enqueue(3);
        queueImpl.enqueue(4);
        queueImpl.enqueue(5);
        queueImpl.enqueue(6);
        queueImpl.enqueue(8);

        
        try {
            System.out.println( queueImpl.dequeue());
            System.out.println( queueImpl.dequeue());
            System.out.println( queueImpl.dequeue());
            System.out.println( queueImpl.dequeue());
            System.out.println( queueImpl.dequeue());           
            
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }      

    }

}
