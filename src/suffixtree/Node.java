package suffixtree;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Node {

    private String currentValue;
    //public Node children;
    public ArrayList<Node> children = new ArrayList<Node>();

    public String getValue() {
        return this.currentValue;
    }
    
    public void setValue(String value) {
        this.currentValue = value;
    }

    public void addChild(Node c) {
        this.children.add(c);
    }

    public Node getChild(Node c) {
        return c;
    }

    
}
