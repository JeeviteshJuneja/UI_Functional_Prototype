package com.example.ui_functional_prototype;

/**
 * Created by jeevi on 12/6/2017.
 */

public class MySingletonClass {

    private static MySingletonClass instance;

    public static MySingletonClass getInstance() {
        if (instance == null)
            instance = new MySingletonClass();
        return instance;
    }

    private MySingletonClass() {
    }

    private boolean Value;

    public boolean getValue() {
        return Value;
    }

    public void setValue(boolean Value) {
        this.Value = Value;
    }
}