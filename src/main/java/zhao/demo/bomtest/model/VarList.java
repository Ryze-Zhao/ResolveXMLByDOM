package zhao.demo.bomtest.model;

import java.io.Serializable;

public class VarList implements Serializable {

    private String name;

    public VarList() {
    }

    public VarList(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "VarList{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
