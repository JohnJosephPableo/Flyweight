
public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.plantTree(1, 2, "Oak", "Green", "Smooth");
        forest.plantTree(3, 4, "Pine", "Brown", "Rough");
        forest.plantTree(5, 6, "Oak", "Green", "Smooth");


        forest.draw("Canvas");
    }
}
