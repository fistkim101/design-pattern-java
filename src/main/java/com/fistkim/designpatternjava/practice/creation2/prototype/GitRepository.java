package com.fistkim.designpatternjava.practice.creation2.prototype;

public class GitRepository {

    private String name;

    public GitRepository(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
