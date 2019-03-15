package org.woodworks.java.supertest;

public abstract class Animal {
    private boolean life;

    public Animal(){
        System.out.println("called");
        life = false;
    }

    public Animal(boolean life){
        this.life = life;
    }

    public boolean isLife() {
        return life;
    }

    public void setLife(boolean life) {
        this.life = life;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "life=" + life +
                '}';
    }
}
