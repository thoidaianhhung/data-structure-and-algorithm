package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyBST myBST = new MyBST();
        Scanner input = new Scanner(System.in);
        while (true) {
            showMenu();
            int choice = Integer.parseInt(input.nextLine());
            if (choice == 0) {
                System.out.println("Good bye, have a nice day!");
                break;
            }
            switch (choice) {
                case 1 -> myBST.insertNodeBST();
                case 2 -> myBST.inOrder();
                case 3 -> myBST.preOrder();
                case 4 -> myBST.postOrder();
                case 5 -> myBST.browseTreeByWidth();
                case 6 -> myBST.searchBSTQueue();
                case 7 -> myBST.searchBSTRecursive();
                case 8 -> myBST.deleteNodeBST();
                case 9 -> myBST.balanceBST();
                case 10 -> System.out.println(myBST.nodeMinValue(myBST.root));
                case 11 -> System.out.println(myBST.nodeMaxValue(myBST.root));
                default -> {
                    System.out.println("Good bye, have a nice day!");
                    System.exit(0);
                }
            }
        }
    }

    public static void showMenu() {
        System.out.println("1. Insert a new node.");
        System.out.println("2. Traversal in order.");
        System.out.println("3. Traversal pre order.");
        System.out.println("4. Traversal post order.");
        System.out.println("5. Traversal tree by width.");
        System.out.println("6. Tìm kiếm trong BST sử dụng Queue.");
        System.out.println("7. Tìm kiếm trong BST sử dụng Recursive.");
        System.out.println("8. Xoá 1 node trong BST.");
        System.out.println("9. Chuyển đổi 1 BST bình thường sang BST cân bằng.");
        System.out.println("10. Tìm node có giá trị min trong BST.");
        System.out.println("11. Tìm node có giá trị max trong BST.");
        System.out.print("Your choice: ");
    }
}
