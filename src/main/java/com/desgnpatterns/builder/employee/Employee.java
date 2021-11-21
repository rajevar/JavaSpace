package com.desgnpatterns.builder.employee;

public class Employee {

    public static class Builder {

        private String name;
        private int age;
        private String department;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public Employee build() {
            return new Employee(name, age, department);
        }
    }

    private final String name;
    private final int age;
    private final String department;

    private Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public static void main(String[] args) {
        Builder builder = new Employee.Builder();

        Employee employee = builder.setName("baeldung")
                .setAge(10)
                .setDepartment("Builder Pattern")
                .build();
    }
}
