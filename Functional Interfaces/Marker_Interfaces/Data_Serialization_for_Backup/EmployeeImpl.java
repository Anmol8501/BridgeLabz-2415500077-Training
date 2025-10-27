package Marker_Interfaces.Data_Serialization_for_Backup;

import java.io.Serializable;

public class EmployeeImpl implements Serializable{
    private String name;
    private int id;

    public EmployeeImpl(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return name + " (" + id + ")";
    }
}
