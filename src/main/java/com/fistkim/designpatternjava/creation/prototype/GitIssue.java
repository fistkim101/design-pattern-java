package com.fistkim.designpatternjava.creation.prototype;

import java.util.Objects;

public class GitIssue implements Cloneable {

    private String kind;

    private String contents;

    private GitRepository gitRepository;

    public GitIssue() {

    }

    public GitIssue(String kind, String contents, GitRepository gitRepository) {
        this.kind = kind;
        this.contents = contents;
        this.gitRepository = gitRepository;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public GitRepository getGitRepository() {
        return gitRepository;
    }

    public void setGitRepository(GitRepository gitRepository) {
        this.gitRepository = gitRepository;
    }

    public String getUrl() {
        return "https://" + this.gitRepository.getUser() + "/github.com/" + this.gitRepository.getName() + "/" + this.contents;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        // return super.clone(); // shallow copy

        GitRepository gitRepository = new GitRepository(this.gitRepository.getUser(), this.gitRepository.getName());
        GitIssue gitIssue = new GitIssue();
        gitIssue.setGitRepository(gitRepository);
        gitIssue.setKind(this.kind);
        gitIssue.setContents(this.contents);

        return gitIssue;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GitIssue gitIssue = (GitIssue) o;
        return Objects.equals(kind, gitIssue.kind) && Objects.equals(contents, gitIssue.contents) && Objects.equals(gitRepository, gitIssue.gitRepository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, contents, gitRepository);
    }
}
