package com.fistkim.designpatternjava.creation.prototype;

public class GitIssue {

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

}
