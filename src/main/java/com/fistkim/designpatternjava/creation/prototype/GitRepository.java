package com.fistkim.designpatternjava.creation.prototype;

public class GitRepository {

    private String user;

    private String name;

    public GitRepository() {
    }

    public GitRepository(String user, String name) {
        this.user = user;
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public String getName() {
        return name;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setName(String name) {
        this.name = name;
    }

}
