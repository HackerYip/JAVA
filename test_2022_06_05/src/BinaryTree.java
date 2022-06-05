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

        /**
         * 子问题思路：
         *
         * @param root
         * @return
         */
        public List<Character> preorderTraversal(TreeNode root) {
            List<Character> ret = new ArrayList<>();
            if (root == null) return ret;
            ret.add(root.val);

            List<Character> leftTree = preorderTraversal(root.left);
            ret.addAll(leftTree);

            List<Character> rightTree = preorderTraversal(root.right);
            ret.addAll(rightTree);

            return ret;
        }


        // 中序遍历
        void inOrder(TreeNode root) {
            if (root == null) return;
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }

        public List<Character> inorderTraversal(TreeNode root) {
            List<Character> ret = new ArrayList<>();
            if (root == null) return ret;

            List<Character> leftTree = inorderTraversal(root.left);
            ret.addAll(leftTree);


            ret.add(root.val);


            List<Character> rightTree = inorderTraversal(root.right);
            ret.addAll(rightTree);

            return ret;
        }

        // 后序遍历
        void postOrder(TreeNode root) {
            if (root == null) return;
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val + " ");

        }

        public List<Character> postorderTraversal(TreeNode root) {
            List<Character> ret = new ArrayList<>();
            if (root == null) return ret;

            List<Character> leftTree = postorderTraversal(root.left);
            ret.addAll(leftTree);

            List<Character> rightTree = postorderTraversal(root.right);
            ret.addAll(rightTree);

            ret.add(root.val);

            return ret;

        }


        public static int nodeSize;

        /**
         * 获取树中节点的个数：遍历思路
         */
        void size(TreeNode root) {
            if (root == null) return;
            nodeSize++;
            size(root.left);
            size(root.right);
        }
    }

}
