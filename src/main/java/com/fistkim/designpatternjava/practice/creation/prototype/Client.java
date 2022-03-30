package com.fistkim.designpatternjava.practice.creation.prototype;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        GitRepository gitRepository = new GitRepository("fistkim", "design-pattern");
        GitIssue gitIssue1 = new GitIssue(gitRepository, "로그인버그");
        // GitIssue gitIssue2 = new GitIssue(gitRepository, "로로그아웃버그그인아웃");
        GitIssue gitIssue2 = (GitIssue) gitIssue1.clone();
        gitIssue2.setContents("로그아웃버그");

        System.out.println(gitIssue1 == gitIssue2); // false
        System.out.println(gitIssue1.equals(gitIssue2)); // false

    }

}
