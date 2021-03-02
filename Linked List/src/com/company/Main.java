package com.company;

import java.util.Scanner;

public class Main {

    public static void showMenu() {
        System.out.println("1. Insert in head.");
        System.out.println("2. Insert in last.");
        System.out.println("3. Traverse nodes in linked list.");
        System.out.println("4. Sort nodes in Linked list.");
        System.out.println("5. Insert node in sort linked list.");
        System.out.println("6. Search node in linked list.");
        System.out.println("7. Delete node in linked list.");
        System.out.println("8. Delete a linked list node at a given position.");
    }

    public static void main(String[] args) {

        MyList myList = new MyList();
        Scanner input = new Scanner(System.in);
        while (true) {
            showMenu();
            System.out.print("Your choice: ");
            int choice = Integer.parseInt(input.nextLine());
            if (choice == 0) {
                System.out.println("Good bye, have a nice day!");
                break;
            }
            switch (choice) {
                case 1 -> {
                    System.out.print("Import integer element: ");
                    int n = Integer.parseInt(input.nextLine());
                    myList.appendHead(n);
                }
                case 2 -> {
                    System.out.print("Import integer element: ");
                    int n = Integer.parseInt(input.nextLine());
                    myList.appendLast(n);
                }
                case 3 -> myList.printLinkedList();
                case 4 -> {
                    Node n = myList.head;
                    while (n.next != null) {
                        n = n.next;
                    }
                    myList.sortLinkedList(myList.head, n);
                    myList.printLinkedList();
                }
                case 5 -> {
                    Node n = myList.head;
                    while (n.next != null) {
                        n = n.next;
                    }
                    myList.sortLinkedList(myList.head, n);
                    System.out.print("Import element integer: ");
                    int x = Integer.parseInt(input.nextLine());
                    Node newNode = myList.newNode(x);
                    myList.insertSortLinkedList(newNode);
                    myList.printLinkedList();
                }
                case 6 -> {
                    System.out.print("Import integer element: ");
                    int x = Integer.parseInt(input.nextLine());
                    int number = myList.searchLinkedList(myList.head, x);
                    if (number != 0) {
                        System.out.print("Result: " + number);
                        System.out.println();
                    } else {
                        System.out.println("No result.");
                    }
                }
                case 7 -> {
                    System.out.println("Import element you want to delete: ");
                    int number = Integer.parseInt(input.nextLine());
                    myList.deleteNode(number);
                    myList.printLinkedList();
                }
                case 8 -> {
                    System.out.println("Import position you want to delete: ");
                    int number = Integer.parseInt(input.nextLine());
                    myList.deleteNodePosition(number);
                    myList.printLinkedList();
                }
                default -> System.exit(0);

            }
        }
    }
}
