package com;

import java.util.Stack;

public class NChildTree {

    public static void main(String[] args) {
        String str = "1(2(5)(6))(3(7))(4(8)(9)(10))";

        createNChildTree(str);

    }

    private static void createNChildTree(String str) {
        TreeNode rootNode = new TreeNode(str.charAt(0));
        createSubNodes(str, rootNode);
    }

    private static void createSubNodes(String str, TreeNode rootNode) {
        int size =0;
        for (int i = 1; i< str.length(); i = i+size)
        {

            Stack<Character> stack = createSubTreeStack(str, i);
            size = stack.size();
            buildChileNodes(rootNode, stack);

        }
    }

    private static void buildChileNodes(TreeNode rootNode, Stack<Character> stack) {
        while (!stack.isEmpty())
        {
            Character c = stack.pop();
            if (c=='(')
//                createSubTreeStack(rootNode, stack)
                continue;
            TreeNode treeNode = new TreeNode(c);
            rootNode.appenInChildNodes(treeNode);
        }
    }

    private static Stack<Character> createSubTreeStack(String str, int i) {
        Stack<Character> stack = new Stack<>();
        if (str.charAt(i) == '(')
        {
            int count = 1;
            //push until
            for (int j = i; j < str.length(); j++)
            {
                if (str.charAt(j) == '(')
                    count++;

                stack.push(str.charAt(j));

                if (str.charAt(j) == ')' )
                {
                    count --;

                    if (count ==1)
                        break;
                }

            }
        }
        return stack;
    }
}
