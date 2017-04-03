package com.brainacad.module3.lab.lab3_6.lab3_6_23;

import java.io.File;

/**
 * Created by diman on 03.04.2017.
 */

// lab3_6_2, lab3_6_3

public class Action {
    private File file;

    @MyPermission(PermissionAction.USER_READ)
    public void read() {

    }

    @MyPermission(PermissionAction.USER_READ)
    public void write() {

    }

    private void readFile() {

    }

    private void writeFile() {

    }
}
