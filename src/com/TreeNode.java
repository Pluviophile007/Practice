package com;

import java.util.List;

public class TreeNode {
    List<TreeNode> subNodes;
    Character value;

    public TreeNode(Character c) {
        this.value  = c;
    }

    public TreeNode() {
    }

    public Character getValue() {
        return value;
    }

    public void setValue(Character value) {
        this.value = value;
    }

    public void appenInChildNodes(TreeNode treeNode) {
        subNodes.add(treeNode);
    }
}
