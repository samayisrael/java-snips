

public class Main {
    public static void main(String[] args) {

       Tree treeOne = new Tree(10, 30, TreeType.MAPLE);
       System.out.println(treeOne.treeType);

       Tree myOakTree = new Tree(110, 20, TreeType.OAK);

       treeOne.grow();
       System.out.println("New height "+treeOne.heightFt);

       myOakTree.announceTallTree();
       Tree.announceTree();

       System.out.println(Tree.TRUNK_COLOR);

    }
}
