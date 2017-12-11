package com.example.datastructure;

public class LinkedStackTest {

    public static void main(String[] args){

        CustomLinkedStack<String> stack = new CustomLinkedStack<>();
        System.out.println("是否为空:"+stack.empty());
        try {
            stack.push("I");
            stack.push("am");
            stack.push("andy");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("栈长度:"+stack.size());
        System.out.println("栈顶元素:"+stack.peek());
        try {
            System.out.println("移除元素:"+stack.pop());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("栈长度:"+stack.size());
        System.out.println("栈顶元素:"+stack.peek());
    }

}
