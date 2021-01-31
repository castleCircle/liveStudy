package Test;

import java.util.LinkedList;
import java.util.List;
import static Test.Recursive.*;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Entity entity = new Entity("1","\\1",1);
        Entity entity1 = new Entity("2","\\1\\2",2);
        Entity entity2 = new Entity("3","\\1\\3",2);
        Entity entity3 = new Entity("4","\\1\\2\\4",3);
        Entity entity4 = new Entity("5","\\1\\5",2);
        Entity entity5 = new Entity("6","\\6",1);

        List<Entity> list = new LinkedList<>();
        list.add(entity);
        list.add(entity1);
        list.add(entity2);
        list.add(entity3);
        list.add(entity4);
        list.add(entity5);

        List<Entity> list1 = new LinkedList<>();
        for(Entity en : list){
            if(en.getLevel() == 1){
                list1.add(en);
            }else{
                Entity root = list1.get(list1.size()-1);
                recursive(list1,root.getRows(),en,en.getLevel());
            }
        }

        System.out.println(list1);

    }
}






















//
//package Test;
//
//        import java.util.LinkedList;
//        import java.util.List;
//        import static Test.Recursive.*;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Entity entity = new Entity("1","\\1",1);
//        Entity entity1 = new Entity("2","\\1\\2",2);
//        Entity entity2 = new Entity("3","\\1\\3",2);
//        Entity entity3 = new Entity("4","\\1\\2\\4",3);
//        Entity entity4 = new Entity("5","\\1\\5",2);
//        Entity entity5 = new Entity("6","\\6",1);
//
//        List<Entity> list = new LinkedList<>();
//        list.add(entity);
//        list.add(entity1);
//        list.add(entity2);
//        list.add(entity3);
//        list.add(entity4);
//        list.add(entity5);
//
//        List<Entity> list1 = new LinkedList<>();
//        for(Entity en : list){
//            if(en.getLevel() == 1){
//                list1.add(en);
//            }else{
//                Entity root = list1.get(list1.size()-1);
//                recursive(root.getRows(),en,2,en.getLevel());
//            }
//        }
//
//        System.out.println(list1);
//
//    }
//}

