package model;

import java.io.Serializable;

public class Soda implements Serializable {

    // 1. long id
    // 2. string name
    // 3. int quantity
    // TODO: Create all properties, with correct access type (public/protected/private)
    private long id;
    private String name;
    private String size;


    // TODO: Create a zero-argument constructor
    public Soda() {}

    // TODO: Create a constructor with all properties except the ID
    public Soda(String name, int size) {
        this.name = name;
        setSize(size);
    }

    // TODO: Create all getters & setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        switch(size) {
            case 1:
                this.size = "Small";
                break;
            case 2:
                this.size = "Medium";
                break;
            case 3:
                this.size = "SuperSize";
                break;
            default:
                this.size =  "Huh?";
        }
    }

    public String getSize() {
        return size;
    }

//    public void setSize(int size) {
//        this.size = size;
//    }
}
