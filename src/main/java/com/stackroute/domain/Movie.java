package com.stackroute.domain;

public class Movie extends Actor {
    private Actor actor;

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
        System.out.println("this is movie actor");
    }
    public void name()
    {
        System.out.print(actor.getName());
    }

}
