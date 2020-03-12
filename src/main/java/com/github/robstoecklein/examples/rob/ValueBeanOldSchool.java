package com.github.robstoecklein.examples.rob;

import java.util.Objects;

public class ValueBeanOldSchool {

    private final String firstName;
    private final String lastName;
    private final int age;

    public ValueBeanOldSchool(final String firstName, final String lastName, final int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        final ValueBeanOldSchool that = (ValueBeanOldSchool) obj;

        if (age != that.age) {
            return false;
        }
        if (!Objects.equals(firstName, that.firstName)) {
            return false;
        }
        return Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "ValueBeanOldSchool(" +
                "firstName=" + firstName +
                ", lastName=" + lastName +
                ", age=" + age +
                ')';
    }
}
