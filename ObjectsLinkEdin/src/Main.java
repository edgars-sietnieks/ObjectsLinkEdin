public class Main {
    public static void main(String[] args) {
        Tree myFavoriteOakTree = new Tree(120, 12, TreeType.OAK);
        System.out.println(myFavoriteOakTree.treeType);
        Tree myFavoriteMapleTree = new Tree(90,30, TreeType.MAPLE);

        if(myFavoriteOakTree.heightFt > 100){
            System.out.println("That's a tall tree!");
        }
    }
}
