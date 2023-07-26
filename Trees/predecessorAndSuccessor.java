package DSAsheetByArsh.Trees;

public class predecessorAndSuccessor {
            Node suc;
            Node pre;
            predecessorAndSuccessor(Node suc, Node pre) {
                this.suc = suc;
                this.pre = pre;
            }
    public void findPreSuc(Node root, int key)
    {
        if(root==null) return;
        if(root.data>key){
            if(suc==null){
                suc=root;
            }
            else{
                if(root.data<suc.data){
                    suc=root;
                }
            }
            findPreSuc(root.left, key);
        }
        else if(root.data<key){
            if(pre==null){
                pre=root;
            }
            else{
                if(root.data>pre.data){
                    pre=root;
                }
            }
            findPreSuc(root.right, key);
        }
        else{
            findPreSuc(root.left, key);
            findPreSuc(root.right, key);
        }
    }
}