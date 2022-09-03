import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Graph<Item>{

    // Map<Key, Value)
    private Map<String, List<Item>> mapGraph = new HashMap<>();

    public void addEdge(String sourceKey, String destinationKey, boolean direction){
        if(!mapGraph.containsKey(sourceKey)){
            addNode();
        }
        if(!mapGraph.containsKey(destinationKey)){
            addNode();
        }
    }

    public void addNode(){

    }

    public void hasEdge(String sourceKey, String destinationKey){
        if(mapGraph.get(sourceKey).contains(destinationKey)){
            System.out.println("There is an connection between " + sourceKey + " and " + destinationKey);
        }
        else{
            System.out.println("There is no connection between " + sourceKey + " and " + destinationKey);
        }
    }

    public void hasVertex(String sourceKey){
        if(mapGraph.containsKey(sourceKey)){
            System.out.println(sourceKey + " exists");
        }
        else{
            System.out.println(sourceKey + " does not exist");
        }
    }

    //private void 
}