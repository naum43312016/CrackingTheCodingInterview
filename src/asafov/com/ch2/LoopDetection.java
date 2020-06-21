package asafov.com.ch2;

import java.util.*;

public class LoopDetection {
    public LinkedListNode getLoop(LinkedListNode list){
        Map<Integer, List<LinkedListNode>> map = new HashMap<>();
        while (list!=null){
            if (map.containsKey(list.data)){
                List<LinkedListNode> arr = map.get(list.data);
                for (int i=0;i<arr.size();i++){
                    if (list==arr.get(i)){
                        return list;
                    }
                }
                arr.add(list);
            }else {
                List<LinkedListNode> arr = new ArrayList<>();
                arr.add(list);
                map.put(list.data,arr);
            }
            list=list.next;
        }
        return null;
    }
}
