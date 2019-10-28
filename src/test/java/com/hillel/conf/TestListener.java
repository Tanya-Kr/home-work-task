package com.hillel.conf;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.internal.BaseTestMethod;

import java.lang.reflect.Field;

/**
 * Created by alpa on 10/28/19
 */
public class TestListener implements ISuiteListener {

    @Override
    public void onStart(ISuite suite) {
        String userName = System.getProperty("userName");

        if (userName != null && !userName.isEmpty()) {
            suite.getAllMethods().forEach(iTestNGMethod -> {
                String methodName = iTestNGMethod.getMethodName();
                try {
                    BaseTestMethod baseTestMethod = (BaseTestMethod) iTestNGMethod;
                    Field f = baseTestMethod.getClass().getSuperclass().getDeclaredField("m_methodName");
                    f.setAccessible(true);
                    f.set(baseTestMethod, methodName + "-" + userName);
                } catch (NoSuchFieldException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            });
        }
    }

    @Override
    public void onFinish(ISuite suite) {

    }

}
