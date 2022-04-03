package com.fistkim.designpatternjava.practice.creation2.prototype;

public class PrototypeClient {
    public static void main(String[] args) throws CloneNotSupportedException {

        GitRepository gitRepository = new GitRepository("designPatternJava");
        GitIssue gitIssue1 = new GitIssue(gitRepository, "로그인버그");
        GitIssue gitIssue2 = gitIssue1.clone();
        gitIssue2.setContents("로그인버그");

        System.out.println(gitIssue1 == gitIssue2); // false
        System.out.println(gitIssue1.equals(gitIssue2));

    }
}
