package com.github.robstoecklein.examples.lombok;

/**
 * https://projectlombok.org/features/GetterSetter
 */
@SuppressWarnings("ALL")
public class GetterSetter_Vanilla {

    private int age = 10;

    private String name;

    @Override
    public String toString() {
        return String.format("%s (age: %d)", name, age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    protected void setName(String name) {
        this.name = name;
    }
}
