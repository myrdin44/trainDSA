package week9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.tree.TreeNode;

public class findModeInBinarySearchTree {
    public int[] findMode(TreeNode root) {
        if (root == null) {
            return new int[0];
        }

        HashMap<Integer, Integer> mapFreq = new HashMap<>();

        traverseAndCount(root, mapFreq);

        int maxFreq = 0;
        for (int freq : mapFreq.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        List<Integer> modes = new ArrayList<>();
        for (int key : mapFreq.keySet()) {
            if (mapFreq.get(key) == maxFreq) {
                modes.add(key);
            }
        }

        int[] result = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            result[i] = modes.get(i);
        }

        return result;

    }

    private void traverseAndCount(TreeNode node, HashMap<Integer, Integer> mapFreq) {
        if (node == null) {
            return;
        }

        mapFreq.put(node.val, mapFreq.getOrDefault(node.val, 0) + 1);

        traverseAndCount(node.left, mapFreq);
        traverseAndCount(node.right, mapFreq);
    }
}
