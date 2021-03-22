package com.test.coverage;

public class App
{
    public boolean execute(Object object) {
        try {
            Bean bean = (Bean) object;
            if (isEmpty(bean.getMessage())) {
                return false;
            } else {
                return true;
            }
        } finally {
            System.out.println("done");
        }
    }

    public static boolean isEmpty(String message) {
        return message == null || message.trim().length() == 0;
    }
}
