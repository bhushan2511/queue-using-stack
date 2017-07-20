package com.queue.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.queue.implementation.QueueUsingStack;

public class QueueUsingStackTest {

    @Test(expected = RuntimeException.class)
    public void dequeueWhenQueueIsEmpty() {
        QueueUsingStack queueImpl = new QueueUsingStack();       
        assertEquals(0,queueImpl.dequeue());

    }

    @Test
    public void dequeueElementCheck() {
        QueueUsingStack queueImpl = new QueueUsingStack();

        queueImpl.enqueue(3);
        queueImpl.enqueue(4);
        queueImpl.enqueue(5);
        
        assertEquals(3,queueImpl.dequeue());
        assertEquals(4,queueImpl.dequeue());
        assertEquals(5,queueImpl.dequeue());       
    }
    
    

}
