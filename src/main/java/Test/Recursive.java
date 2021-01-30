package Test;

import java.lang.reflect.Field;
import java.util.List;

public class Recursive {

    public static<T> void recursive(List<T> responseList,T entity,int count,int level) throws NoSuchFieldException, IllegalAccessException {
        List<T> nextEntity  = responseList;
        while(count!=level){
            for(T parentNode : nextEntity){

                for(Field field : parentNode.getClass().getDeclaredFields()){
                    if(field.getName().equals("rows") && field.getType() == List.class){
                        System.out.println("1");
                    }
                }

                String parentHierarchy = (String)parentNode.getClass().getDeclaredField("hierarchy").get(parentNode);
                String childHierarchy = (String)entity.getClass().getDeclaredField("hierarchy").get(entity);

                List<T> rows = (List<T>) parentNode.getClass().getDeclaredField("rows").get(parentNode);

                if(childHierarchy.contains(parentHierarchy) && count < level-1){
                    nextEntity = rows;
                    count++;
                    break;
                }

                if(childHierarchy.contains(parentHierarchy)){
                    nextEntity = rows;
                    count++;
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
