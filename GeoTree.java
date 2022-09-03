import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }

    public void appMarriage(Person wife, Person husband) {
        tree.add(new Node(wife, Relationship.wife, husband));
        tree.add(new Node(husband, Relationship.husband, wife));
    }

    public void appBrother(Person brother1, Person brother2) {
        tree.add(new Node(brother1, Relationship.brother, brother2));
        tree.add(new Node(brother2, Relationship.brother, brother1));
    }

    public void appSister(Person sister1, Person sister2) {
        tree.add(new Node(sister1, Relationship.sister, sister2));
        tree.add(new Node(sister2, Relationship.sister, sister1));
    }

}
