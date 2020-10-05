package com.dipak.algo.algorithms;

import java.util.Stack;

public class JavaStack {
    public void execute(){
        Stack<Integer> myStack = new Stack<Integer>();
        stack_push(myStack,10);
        stack_pop(myStack,4);
        stack_peek(myStack);
        stack_search(myStack,2);
    }

    private void stack_push(Stack<Integer> stack, int howMany){
        for (int i=0;i<howMany;i++){
            stack.push(i+1);
        }
    }
    private void stack_pop(Stack<Integer> stack,int howMany) {
        for(int i=0;i<howMany;i++){
            Integer poppedVal = (Integer)stack.pop();
            System.out.println("popped : "+poppedVal);
        }
    }
    private void stack_peek(Stack<Integer> stack){
        Integer peekedVal = (Integer)stack.peek();
        System.out.println("peeked Value : "+peekedVal);
    }
    private void stack_search(Stack<Integer> stack, int element){
        int pos = stack.search(element);
        if(pos==-1)
            System.out.println("not found");
        else
            System.out.println("found as position : "+pos);
    }
}
