package com.company.patterns.behavioral.mediator;

public class WebsiteRunner {
    public static void main(String[] args) {
        Website website = new WebsiteImpl();
        Administrator administrator = new AdministratorImpl(website, "Viktor");

        User user1 = new UserImpl(website, "Nikolay");
        User user2 = new UserImpl(website, "Dmitry");
        User user3 = new UserImpl(website, "Egor");

        user1.sendReport("problem with payment button");
        user2.sendReport("problem with website images");
        user3.sendReport("bug with page scrolling");

        administrator.getReport();
    }
}
