import java.awt.*;

public class Tree {

    private double heightFt;
    private double trunkDiameterInches;
    private TreeType treeType;
    protected static Color TRUNK_COLOR = new Color(102, 51, 0);

    public Tree(double heightFt, double trunkDiameterInches, TreeType treeType) {
      this.heightFt = heightFt;
      this.trunkDiameterInches = trunkDiameterInches;
      this.treeType = treeType;
    }

    public double getHeightFt() {
      return this.heightFt;
    }

    public double getTrunkDiameterInches() {
      return this.trunkDiameterInches;
    }

    public TreeType getTreeType(){
      return this.treeType;
    }


    public void setTrunkDiameterInches(double inches) {
      this.trunkDiameterInches = inches
    }

    public void grow() {
      this.heightFt = this.heightFt + 10;
      this.trunkDiameterInches = this.trunkDiameterInches + 1;
    }

    public static void announceTree(){
      System.out.println("Look out for that "+TRUNK_COLOR+" tree!");
    }

    public void announceTallTree() {
      if (this.heightFt > 100) {
        System.out.println("That is a tall "+this.treeType+" Tree!");

      }

    }


}
