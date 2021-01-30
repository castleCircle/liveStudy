package Test;

import java.util.LinkedList;
import java.util.List;

public class Entity {

    String menuNo;
    String hierarchy;
    int level;

    public Entity(String menuNo, String hierarchy, int level) {
        this.menuNo = menuNo;
        this.hierarchy = hierarchy;
        this.level = level;
    }

    List<Entity> rows = new LinkedList<>();

    public String getMenuNo() {
        return menuNo;
    }

    public void setMenuNo(String menuNo) {
        this.menuNo = menuNo;
    }

    public String getHierarchy() {
        return hierarchy;
    }

    public void setHierarchy(String hierarchy) {
        this.hierarchy = hierarchy;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<Entity> getRows() {
        return rows;
    }

    public void setRows(List<Entity> rows) {
        this.rows = rows;
    }
}
