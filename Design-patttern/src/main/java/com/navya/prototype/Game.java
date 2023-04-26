package com.navya.prototype;

public class Game implements Cloneable{


    private int id;
    private String name;

    private Memebership memebership;


    //deep clone

    @Override
    protected Game clone() throws CloneNotSupportedException {
        Game game = (Game) super.clone();
        game.setMemebership(new Memebership());
        return game;
    }
    Game() {

    }
    // one more way of doing deep copy using a copy constructor.
    Game (Game game) {
        this.id = game.id;
        this.name = game.name;
        this.memebership = new Memebership();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Memebership getMemebership() {
        return memebership;
    }

    public void setMemebership(Memebership memebership) {
        this.memebership = memebership;
    }


    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", memebership=" + memebership +
                '}';
    }
}

