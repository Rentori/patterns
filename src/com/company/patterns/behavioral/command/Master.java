package com.company.patterns.behavioral.command;

import com.company.patterns.behavioral.command.commands.Command;

public class Master {
    Command laptop;
    Command smartphone;
    Command headphones;
    Command pc;

    public Master(Command laptop, Command smartphone, Command headphones, Command pc) {
        this.laptop = laptop;
        this.smartphone = smartphone;
        this.headphones = headphones;
        this.pc = pc;
    }

    public void repareLaptop() {
        laptop.execute();
    }

    public void repareSmartphone() {
        smartphone.execute();
    }

    public void repareHeadphones() {
        headphones.execute();
    }

    public void reparePC() {
        pc.execute();
    }
}
