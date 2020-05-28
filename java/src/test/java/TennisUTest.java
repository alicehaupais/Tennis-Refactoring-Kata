import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TennisUTest {

    Player player1;
    Player player2;
    TennisGame3 game;

    @Before
    void setUp(){
        player1 = new Player("player1");
        player2 = new Player("player2");
        game = new TennisGame3(player1, player2);
    }

    @Test
    public void game_when_initialized(){
        //given
        String expectedLabelScore = "Love-All";

        //when
        String result = game.getLabelScore();

        //then
        assertEquals(expectedLabelScore, result);
    }
}
