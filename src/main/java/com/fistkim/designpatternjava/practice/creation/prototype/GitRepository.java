package com.fistkim.designpatternjava.practice.creation.prototype;

public class GitRepository {

    private String userName;

    private String repositoryName;

    public GitRepository() {

    }

    public GitRepository(String userName, String repositoryName) {
        this.userName = userName;
        this.repositoryName = repositoryName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }
}
