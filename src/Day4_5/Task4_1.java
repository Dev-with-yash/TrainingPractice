package Day4_5;


import java.util.LinkedList;

class CustomStack<T>{
    public LinkedList<T> stack;
    public CustomStack(){
        stack = new LinkedList<>();
    }
    public T pop() throws  Exception{
        if (stack.isEmpty()){
            throw new Exception("queue is Empty");
        }
        return stack.removeLast();
    }
    public void push(T item){
        stack.addLast(item);
    }

    public T peek() throws Exception{
        if (stack.isEmpty()){
            throw  new Exception("queue is Empty");
        }
        return stack.getLast();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }




}
public class Task4_1 {
    public static void main(String[] args) throws Exception {
        CustomStack<String> stringstack = new CustomStack<>();
        stringstack.push("string1");
        stringstack.push("string2");
        System.out.println(stringstack.peek());
        while (!stringstack.isEmpty()){
            System.out.println(stringstack.pop());
        }
        System.out.println(stringstack.isEmpty());
    }
}

