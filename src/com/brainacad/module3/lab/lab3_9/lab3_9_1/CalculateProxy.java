package com.brainacad.module3.lab.lab3_9.lab3_9_1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * Created by diman on 19.04.2017.
 */

// lab3_9_1
public class CalculateProxy implements InvocationHandler {
    private Object objCalc;

    private CalculateProxy(Object objCalc) {
        this.objCalc = objCalc;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println(proxy.getClass().getCanonicalName());
        System.out.println("Invoke method " + method.getName() + " with arguments " + Arrays.toString(args));

        Object result = method.invoke(objCalc, args);

        System.out.println("Result of invoking method " + method.getName() + " " + result.toString());

        return result;

    }

    public static Object newInstance(Object obj) {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                new CalculateProxy(obj));
    }

    public static void main(String[] args) {

        Calculate proxiedCalculate = (Calculate) newInstance(new CalculateImpl());

        System.out.println("Call methods using the proxy");
        proxiedCalculate.multiplication(3, 7);
        proxiedCalculate.division(24, 6);

    }
}
