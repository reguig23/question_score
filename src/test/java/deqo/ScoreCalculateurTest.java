package deqo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ScoreCalculateurTest {
    private QuestionAChoixMultiple QCM;
    private ScoreCalculateur Calculator;
    @Before
    public void setUp() throws Exception {
        QCM =  new QuestionAChoixMultiple("q1",new ArrayList<Integer>(Arrays.asList(2,3,5)));
        Calculator = new ScoreCalculateur();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void calculeScoreZero() {
        ArrayList<Integer> reponse = new ArrayList<Integer>();
        reponse.add(1);
        reponse.add(4);
        float score =Calculator.calculeScore(reponse,QCM);
        assertTrue(score==0);

    }
    @Test
    public void calculeScore(){
        ArrayList<Integer> reponse = new ArrayList<Integer>();
        reponse.add(2);
        reponse.add(3);
        float score =Calculator.calculeScore(reponse,QCM);
        double result= 2.0*100.0/3.0;
        assertEquals(null,score,result,0.01);

    }
    @Test
    public void calculeScoreCent(){
        ArrayList<Integer> reponse = new ArrayList<Integer>();
        reponse.add(2);
        reponse.add(3);
        reponse.add(5);
        float score =Calculator.calculeScore(reponse,QCM);
        assertTrue(score==100);

    }
}