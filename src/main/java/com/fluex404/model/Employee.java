package com.fluex404.model;

import javax.validation.constraints.Size;

public class Employee {
    private String name;
    @Size(min = 1, message = "required")
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
