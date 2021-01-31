package Test;

import java.util.List;

public class Recursive {

    public static<T> void recursive(List<T> parentList,List<T> responseList,T entity,int level) throws NoSuchFieldException, IllegalAccessException {
        List<T> nextEntity  = responseList;
        
        int startLevel = 2;
        
        while(startLevel != level){
            for(T parentNode : nextEntity){

                String parentHierarchy = (String)parentNode.getClass().getDeclaredField("hierarchy").get(parentNode);
                String childHierarchy = (String)entity.getClass().getDeclaredField("hierarchy").get(entity);

                List<T> rows = (List<T>) parentNode.getClass().getDeclaredField("rows").get(parentNode);

                if(childHierarchy.contains(parentHierarchy) && startLevel < level-1){
                    nextEntity = rows;
                    startLevel++;
                    break;
                }

                if(childHierarchy.contains(parentHierarchy)){
                    nextEntity = rows;
                    startLevel++;
                    break;
                }
            }
        }
        nextEntity.add(entity);
    }

}







//
//
//
//
//package Test;
//
//        import java.util.List;
//
//public class Recursive {
//
//    public static<T> void recursive(List<T> responseList,T entity,int count,int level){
//        List<T> nextEntity  = responseList;
//        while(count!=level){
//            for(T en : nextEntity){
//                if(entity.getHierarchy().contains(en.getHierarchy()) && count < level-1){
//                    nextEntity = en.getRows();
//                    count++;
//                    break;
//                }
//
//                if(entity.getHierarchy().contains(en.getHierarchy())){
//                    nextEntity = en.getRows();
//                    count++;
//                    break;
//                }
//            }
//        }
//        nextEntity.add(entity);
//    }
//
//}
