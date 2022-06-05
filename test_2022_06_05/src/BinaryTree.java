public class BinaryTree {


    /**
     * @Author 12629
     * @Description：
     */
    public class BinaryTree {

        static class TreeNode {
            public char val;
            public TreeNode left;//左孩子的引用
            public TreeNode right;//右孩子的引用

            public TreeNode(char val) {
                this.val = val;
            }
        }

        //public TreeNode root;

        /**
         * 创建一棵二叉树 返回这棵树的根节点
         *
         * @return
         */
        public TreeNode createTree() {

            TreeNode A = new TreeNode('A');
            TreeNode B = new TreeNode('B');
            TreeNode C = new TreeNode('C');
            TreeNode D = new TreeNode('D');
            TreeNode E = new TreeNode('E');
            TreeNode F = new TreeNode('F');
            TreeNode G = new TreeNode('G');
            TreeNode H = new TreeNode('H');

            A.left = B;
            A.right = C;
            B.left = D;
            B.right = E;
            C.left = F;
            C.right = G;
            //E.right = H;
            return A;
        }

        // 前序遍历
        public void preOrder(TreeNode root) {
            if (root == null) return;
            System.out.print(root.val + " ");
            preOrder(root.left);
            preOrder(root.right);
        }


    /*
    遍历子路：
    List<Character> ret = new ArrayList<>();
    public List<Character> preorderTraversal(TreeNode root) {
        if(root == null) return ret;
        ret.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return ret;
    }*/


}
