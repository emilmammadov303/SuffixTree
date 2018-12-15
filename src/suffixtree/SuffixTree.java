package suffixtree;

public class SuffixTree {
    
    
    public static void main(String args[]){
        /*Node root = new Node();
        Node dene = new Node("deneme");
        Node dene2 = new Node("deneme2");
        root.addChild(dene);
        dene.addChild(dene2);
        
        
        System.out.println(root.children.children.currentValue);*/
        
        
        String kel = "bananas";
        int len = kel.length();
        String[] array = new String[len];
        
        for(int i=0;i<len;i++){
            array[i] = kel.substring(i,len);
        }
        
        
        Node[] nodeArray = new Node[len+1];
        for(int i=0;i<len+1;i++){
            nodeArray[i] = new Node();
        }
        
        nodeArray[0].setValue("*");
        for(int i=0;i<len;i++){
            nodeArray[i+1].setValue(array[i]);
        }
        
        boolean control = false;
        nodeArray[0].addChild(nodeArray[1]);
        for(int i=2;i<len+1;i++){
            control = false;
            for(int j=1;j<i;j++){
                if(nodeArray[i].getValue().charAt(0) == nodeArray[j].getValue().charAt(0)){
                    nodeArray[j].addChild(nodeArray[i]);
                    control = true;
                    break;
                }  
            }
            if(control == false){
                nodeArray[0].addChild(nodeArray[i]);
                
            }
                       
        } 
        
        
        for(int i=0;i<nodeArray.length;i++){
            System.out.println(i + ". value = " + nodeArray[i].getValue());
        }
            
        
        
    }
    
}
