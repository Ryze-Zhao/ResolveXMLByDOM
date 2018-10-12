package zhao.demo.bomtest.model;

import java.io.Serializable;

public class SelParts implements Serializable {

    private String name;

    public SelParts() {
    }

    public SelParts(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SelParts{" +
                "name='" + name + '\'' +
                '}';
    }
}
