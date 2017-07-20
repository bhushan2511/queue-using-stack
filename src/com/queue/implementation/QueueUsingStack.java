package com.queue.implementation;

import java.util.NoSuchElementException;
import java.util.Stack;

public class QueueUsingStack {
    
    Stack<Integer> queue=new Stack<Integer>();
   
    
    //The complexity of this enqueue is O(n)
    public void enqueue(int ele) {
        queue.push(ele);
    }
    
  //The complexity of this dequeue is O(n)
    public int dequeue() {             
        if(queue.isEmpty()) {
            throw new NoSuchElementException("Queue is empty"); 
        }
        
        Stack<Integer> tempQueue=new Stack<Integer>();
        int firstEle=0;
        int size=queue.size();
        
        for(int i=0;i<size;i++) {
            tempQueue.push(queue.pop());
        }
              
        firstEle=tempQueue.pop();
        size=tempQueue.size();
        
        for(int i=0;i<size;i++) {
            queue.push(tempQueue.pop());
        }
        
        return firstEle;
    }    

}
