package com.github.robstoecklein.examples.lombok;

import java.util.Objects;

public class DataBeanOldSchool {

    private boolean isEnabled;
    private Integer age;
    private String firstName;

    public DataBeanOldSchool() {
    }

    public DataBeanOldSchool(final boolean isEnabled, final Integer age, final String firstName) {
        this.isEnabled = isEnabled;
        this.age = age;
        this.firstName = firstName;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(final boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(final Integer age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        final DataBeanOldSchool that = (DataBeanOldSchool) obj;

        if (isEnabled != that.isEnabled) {
            return false;
        }
        if (!Objects.equals(age, that.age)) {
            return false;
        }
        return Objects.equals(firstName, that.firstName);
    }

    @Override
    public int hashCode() {
        int result = (isEnabled ? 1 : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DataBeanStandard(" +
                "isEnabled=" + isEnabled +
                ", age=" + age +
                ", firstName=" + firstName +
                ')';
    }
}
