package org.pokemon;

import java.util.ArrayList;

public class Game {
    private String input;
    private Player player;
    private ArrayList<Integer> visitedPositions = new ArrayList<>();

    public Game(String input) {
        this.input = input;
    }

    public int start() {
        init();
        movePlayer();

        int catchedPokemons = visitedPositions.size() / 2;

        if(catchedPokemons == 1){
            System.out.println("Ash has catched " + catchedPokemons + " Pokemon.");
        } else {
            System.out.println("Ash has catched " + catchedPokemons + " Pokemons.");
        }
        return catchedPokemons;
    }
    private void init() {
        player = new Player(generatePosition(), generatePosition());
        storePosition(player.getXPos(), player.getYPos());
    }
    private int generatePosition() {
        return (int) (Math.random() * Integer.MAX_VALUE);
    }
    private void movePlayer() {
        for (int i = 0; i < input.length(); i++) {
            switch (input.toUpperCase().charAt(i)) {
                case 'N':
                    player.moveUp();
                    break;
                case 'S':
                    player.moveDown();
                    break;
                case 'O':
                    player.moveLeft();
                    break;
                case 'E':
                    player.moveRight();
                    break;
            }
            storePosition(player.getXPos(), player.getYPos());
        }
    }
    private void storePosition(int xPos, int yPos) {
        if(!hasCatched(xPos, yPos)){
            visitedPositions.add(xPos);
            visitedPositions.add(yPos);
        }
    }
    private void seeStoredPositions() {
        for (int i = 0; i < visitedPositions.size(); i += 2) {
            System.out.println("x: " + visitedPositions.get(i) + ", y: " + visitedPositions.get(i + 1));
        }
    }
    private boolean hasCatched(int xPos, int yPos){
        for (int i = 0; i < visitedPositions.size(); i += 2) {
            if(xPos == visitedPositions.get(i) && yPos == visitedPositions.get(i + 1)){
                return true;
            }
        }
        return false;
    }
}

