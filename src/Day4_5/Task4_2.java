package Day4_5;

import java.util.LinkedList;

class CustomQueue<T>{
    private LinkedList<T> queue;
    public CustomQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(T item){
        queue.addLast(item);
    }
    public T dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is Empty");
        }
        return queue.removeFirst();
    }
    public T peek(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is Empty");
        }
        return queue.getFirst();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }


}

public class Task4_2{
    public static void main(String[] args) {
       CustomQueue<String> stringQueue = new CustomQueue<>();
       stringQueue.enqueue("yaswanth");
       stringQueue.enqueue("ponduru");
       stringQueue.enqueue("srikakulam");

       while(!stringQueue.isEmpty()){
           System.out.println(stringQueue.dequeue());
       }

        System.out.println(stringQueue.isEmpty());
    }
}