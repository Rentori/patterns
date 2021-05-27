package com.company.patterns.behavioral.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression windowsUser = new TerminalExpression("windows");
        Expression linuxUser = new TerminalExpression("linux");

        System.out.println(new AndExpression(windowsUser, linuxUser).interpret("windows"));
        System.out.println(new AndExpression(windowsUser, windowsUser).interpret("windows"));
        System.out.println(new OrExpression(windowsUser, linuxUser).interpret("windows"));
    }
}
