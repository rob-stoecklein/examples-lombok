package com.github.robstoecklein.examples.lombok;

import java.util.Collection;
import java.util.Set;

/**
 * https://projectlombok.org/features/Builder
 */
@SuppressWarnings("ALL")
public class Builder_Vanilla {

    private long created;
    private String name;
    private int age;
    private Set<String> occupations;

    Builder_Vanilla(String name, int age, Set<String> occupations) {
        this.name = name;
        this.age = age;
        this.occupations = occupations;
    }

    private static long $default$created() {
        return System.currentTimeMillis();
    }

    public static BuilderExampleBuilder builder() {
        return new BuilderExampleBuilder();
    }

    public static class BuilderExampleBuilder {

        private long created;
        private boolean created$set;
        private String name;
        private int age;
        private java.util.ArrayList<String> occupations;

        BuilderExampleBuilder() {
        }

        public BuilderExampleBuilder created(long created) {
            this.created = created;
            this.created$set = true;
            return this;
        }

        public BuilderExampleBuilder name(String name) {
            this.name = name;
            return this;
        }

        public BuilderExampleBuilder age(int age) {
            this.age = age;
            return this;
        }

        public BuilderExampleBuilder occupation(String occupation) {
            if (this.occupations == null) {
                this.occupations = new java.util.ArrayList<String>();
            }

            this.occupations.add(occupation);
            return this;
        }

        public BuilderExampleBuilder occupations(Collection<? extends String> occupations) {
            if (this.occupations == null) {
                this.occupations = new java.util.ArrayList<String>();
            }

            this.occupations.addAll(occupations);
            return this;
        }

        public BuilderExampleBuilder clearOccupations() {
            if (this.occupations != null) {
                this.occupations.clear();
            }

            return this;
        }

        public Builder_Vanilla build() {
            // complicated switch statement to produce a compact properly sized immutable set omitted.
            //Set<String> occupations = ...;
            //return new Builder_Vanilla(created$set ? created : Builder_Vanilla.$default$created(), name, age, occupations);
            return null; //FIXME
        }

        @Override
        public String toString() {
            return "BuilderExample.BuilderExampleBuilder(created = " + this.created + ", name = " + this.name + ", age = " + this.age
                    + ", occupations = " + this.occupations + ")";
        }
    }
}
