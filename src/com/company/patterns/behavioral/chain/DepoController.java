package com.company.patterns.behavioral.chain;

public abstract class DepoController {
    private Priority priority;
    private DepoController nextDepo;

    public DepoController(Priority priority) {
        this.priority = priority;
    }

    public void setNextDepo(DepoController nextDepo) {
        this.nextDepo = nextDepo;
    }

    public void getMessage(String message, Priority level) {
        if (level.ordinal() >= priority.ordinal()) {
            write(message);
        }
        if (nextDepo != null) {
            nextDepo.getMessage(message, level);
        }
    }

    public abstract void write(String message);
}
