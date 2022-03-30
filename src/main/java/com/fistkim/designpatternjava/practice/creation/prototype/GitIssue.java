package com.fistkim.designpatternjava.practice.creation.prototype;

import java.util.Objects;

public class GitIssue implements Cloneable {

    private GitRepository gitRepository;

    private String contents;

    public GitIssue() {
    }

    public GitIssue(GitRepository gitRepository, String contents) {
        this.gitRepository = gitRepository;
        this.contents = contents;
    }

    public GitRepository getGitRepository() {
        return gitRepository;
    }

    public void setGitRepository(GitRepository gitRepository) {
        this.gitRepository = gitRepository;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GitIssue)) return false;
        GitIssue gitIssue = (GitIssue) o;
        return Objects.equals(getGitRepository(), gitIssue.getGitRepository()) && Objects.equals(getContents(), gitIssue.getContents());
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
