package ReferenceList;

    class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }

    public class InOrder {
        public static void inorderTraversal(TreeNode root) {
            if (root == null) {
                return;
            }
            inorderTraversal(root.left);
            System.out.println(root.val);
            inorderTraversal(root.right);
        }

        public static void main(String[] args) {

            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.right = new TreeNode(3);
            root.left.left = new TreeNode(4);
            root.left.right = new TreeNode(5);
            inorderTraversal(root);
        }
    }

