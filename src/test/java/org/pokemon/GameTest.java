package org.pokemon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void noMovementShouldEqualOnePokemonCatched(){
        Game game = new Game("");
        assertEquals(1, game.start());
    }

    @Test
    void upAndDownMovementShouldEqualTwoPokemonsCatched(){
        Game game = new Game("nsnsns");
        assertEquals(2, game.start());
    }

    @Test
    void downAndUpMovementShouldEqualTwoPokemonsCatched(){
        Game game = new Game("snsnsn");
        assertEquals(2, game.start());
    }

    @Test
    void leftAndRightMovementShouldEqualTwoPokemonsCatched(){
        Game game = new Game("oeoeoe");
        assertEquals(2, game.start());
    }

    @Test
    void rightAndLeftMovementShouldEqualTwoPokemonsCatched(){
        Game game = new Game("eoeoeo");
        assertEquals(2, game.start());
    }

    @Test
    void fullCircleMovementSouldEqualFourPokemonsCatched(){
        Game game = new Game("nosenose");
        assertEquals(4, game.start());
    }

    @Test
    void inputShouldBeCaseInsensitive(){
        Game game = new Game("nosenose");
        Game game2 = new Game("NOSENOSE");
        assertEquals(game.start(), game2.start());
    }

    @Test
    void sameDirectionMovementShouldBeEqualToTheNumberOfMovementsPlusOne(){
        int numberOfMovements = (int) (Math.random() * 10000);

        char[] possibleChar = {'n', 'o', 's', 'e'};
        int randomCharIndex = (int) Math.ceil(Math.random() * possibleChar.length);

        char movementDirection = 'a';
        switch (randomCharIndex) {
            case 1:
                movementDirection = 'n';
                break;
            case 2:
                movementDirection = 'o';
            break;
            case 3:
                movementDirection = 's';
                break;
            case 4:
                movementDirection = 'e';
                break;
        }

        String input = "";
        for(int i = 0; i < numberOfMovements; i++){
            input += movementDirection;
        }

        Game game = new Game(input);

        int result = game.start();

        assertEquals(input.length() + 1, result);
    }
}