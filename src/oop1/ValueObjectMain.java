package oop1;

import com.sun.jdi.Value;

public class ValueObjectMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        valueData.add();
        valueData.add();
        valueData.add();
        System.out.println("Final value: " + valueData.value);

    }
}
