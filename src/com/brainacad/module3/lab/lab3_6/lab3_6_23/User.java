package com.brainacad.module3.lab.lab3_6.lab3_6_23;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by diman on 03.04.2017.
 */

// lab3_6_2, lab3_6_3

public class User {
    private String name;

    private List<PermissionAction> permissions = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public void addPermission(PermissionAction pa) {
        this.permissions.add(pa);
    }

    public List<PermissionAction> getPerrmissions() {
        return this.permissions;
    }
}
