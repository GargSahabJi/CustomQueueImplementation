/*
* Class name: Main
*
* Version info: jdk 1.8
*
* Copyright notice:
* 
* Author info: Arpit Garg
*
* Creation date: 13/Mar/2021
*
* Last updated By: Arpit Garg
*
* Last updated Date: 13/Mar/2021
*
* Description: Main class of Queue
*/
package com.nagarro.customqueueimplementation.main;

import java.util.Scanner;

import com.nagarro.customqueueimplementation.exception.IllegalStateException;
import com.nagarro.customqueueimplementation.service.CustomQueue;
import com.nagarro.customqueueimplementation.utils.InputValidationUtil;

public class Main {
    private static final String DELETED_VALUE = "Deleted Value ";
    private static final String SIZE_OF_QUEUE = "Size of Queue ";
    private static final String PEEK_VALUE = "Peek Value ";
    private static final String ENTER_VALUE_TO_BE_SEARCH = "Enter value to be search";
    private static final String _2_DEQUEUE = "2- Dequeue";
    private static final String _1_ENQUEUE = "1- Enqueue";
    private static final String WELCOME = "Welcome!....";
    private static final String ENTER_ELEMENT_TO_BE_ADDED = "Enter Element to be added";
    private static final String SELECT_OPERATION_TO_BE_PERFORM = "Select Operation to be perform...";
    private static final String _4_CONATINS = "4- conatins";
    private static final String _3_PEEK = "3- peek";
    private static final String _5_SIZE = "5- Size";
    private static final String _6_REVERSE = "6- Reverse";
    private static final String _7_ITERATOR = "7- Iterator";
    private static final String _8_TRAVERSE = "8- Traverse";
    private static final String PRESS_Y_FOR_CONTINUE = "Press 'y' for continue...";
    private static final String WRONG_CHOICE = "Wrong Choice!";
    static Scanner scan = new Scanner(System.in);

    /**
     * @param args
     */
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();
        char ch;
        System.out.println(WELCOME);
        do {
            System.out.println(SELECT_OPERATION_TO_BE_PERFORM);
            System.out.println(SELECT_OPERATION_TO_BE_PERFORM);
            System.out.println(_1_ENQUEUE);
            System.out.println(_2_DEQUEUE);
            System.out.println(_3_PEEK);
            System.out.println(_4_CONATINS);
            System.out.println(_5_SIZE);
            System.out.println(_6_REVERSE);
            System.out.println(_7_ITERATOR);
            System.out.println(_8_TRAVERSE);
            int choice = scan.nextInt();
            choiceAction(choice, queue);
            System.out.println(PRESS_Y_FOR_CONTINUE);
            ch = scan.next().charAt(0);
        } while (ch == 'y');
    }

    /**
     * provide different operations for user
     * 
     * @param choice
     * @param queue
     */
    private static void choiceAction(int choice, CustomQueue queue) {
        switch (choice) {
        case 1:
            System.out.println(ENTER_ELEMENT_TO_BE_ADDED);
            String valueToBeAdd = scan.next();
            int value = new InputValidationUtil().inputValidation(valueToBeAdd);
            queue.enqueue(value);
            break;

        case 2:
            System.out.println(DELETED_VALUE + queue.dequeue());
            break;

        case 3:
            System.out.println(PEEK_VALUE + queue.peek());
            break;

        case 4:
            System.out.println(ENTER_VALUE_TO_BE_SEARCH);
            String valueToBeSearch = scan.next();
            int searchValue = new InputValidationUtil().inputValidation(valueToBeSearch);
            System.out.println(queue.contains(searchValue));
            break;

        case 5:
            System.out.println(SIZE_OF_QUEUE + queue.size());
            break;

        case 6:
            queue.reverse();
            System.out.println(queue.toString());
            break;

        case 7:
            System.out.println(queue.toString());
            break;

        case 8:
            queue.traverse();
            break;

        default:
            new IllegalStateException(WRONG_CHOICE);
        }
    }

}
