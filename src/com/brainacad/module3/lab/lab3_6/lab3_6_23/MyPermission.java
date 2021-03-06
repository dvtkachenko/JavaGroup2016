package com.brainacad.module3.lab.lab3_6.lab3_6_23;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by diman on 03.04.2017.
 */

// lab3_6_2, lab3_6_3

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyPermission {
    PermissionAction value();
}
