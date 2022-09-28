package org.pokemon;

public class Player {
    private int xPos;
    private int yPos;

    public Player(int xPos, int yPos){
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public int getXPos() {
        return xPos;
    }
    private void setXPos(int xPos) {
        this.xPos = xPos;
    }
    public int getYPos() {
        return yPos;
    }
    private void setYPos(int yPos) {
        this.yPos = yPos;
    }
    public void moveUp(){
        setYPos(getYPos() + 1);
    }
    public void moveDown(){
        setYPos(getYPos() - 1);
    }
    public void moveLeft(){
        setXPos(getXPos() - 1);
    }
    public void moveRight(){
        setXPos(getXPos() + 1);
    }

    @Override
    public String toString() {
        return "Player{" +
                "xPos=" + xPos +
                ", yPos=" + yPos +
                '}';
    }
}
