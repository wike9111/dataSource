package com.example.datastructure;

/***
 * 测试数组栈
 */
public class ArrayStackTest {

    public static void main(String[] args){

        CustomArrayStack<String> stack = new CustomArrayStack<>(10);
        System.out.println("是否为空:"+stack.empty());
        try {
            stack.push("I");
            stack.push("am");
            stack.push("andy");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("栈顶元素:"+stack.size());
        System.out.println("栈顶元素:"+stack.peek());
        try {
            System.out.println("移除元素:"+stack.pop());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("栈顶元素:"+stack.size());
        System.out.println("栈顶元素:"+stack.peek());
    }
}
