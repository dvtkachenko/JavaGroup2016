package com.brainacad.module3.lab.lab3_9.lab3_9_2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;

/**
 * Created by diman on 19.04.2017.
 */

// lab3_9_2
public class CalculateProxy implements InvocationHandler {

    Class[] interfaces;
    Object[] delegates;

    CalculateProxy(Class[] interfaces, Object[] delegates) {
        this.interfaces = interfaces;
        this.delegates = delegates;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Class<?> declaredClass = method.getDeclaringClass();

        for (int i = 0; i < interfaces.length; i++) {
            if (declaredClass.isAssignableFrom(interfaces[i])) {
                return method.invoke(delegates[i], args);
            }
        }

        System.out.println("Method cannot be dispatched");
        return null;
    }

    public static Object newInstance(Class obj) {

        Object[] delegators = new Object[] {new CalculateImpl(), new CalculateBitwiseImpl()};
        List<Class<?>> listInterfaces = Arrays.asList(Calculate.class, CalculateBitwise.class);

        if (listInterfaces.contains(obj)) {
            Class[] proxyInterfaces = listInterfaces.toArray(new Class[listInterfaces.size()]);

            return Proxy.newProxyInstance(obj.getClassLoader(),
                    proxyInterfaces,
                    new CalculateProxy(proxyInterfaces, delegators));
        }
        System.out.println("Can not creat object !");
        return null;
    }

}
