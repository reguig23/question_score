package deqo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionAChoixExclusifTest {
    private  QuestionAChoixExclusif QCE ;
    @Before
    public void setUp() throws Exception {
        String question = "Quelle est la capital de la Chine";
        int bonneReponse = 3;
        QCE = new QuestionAChoixExclusif(question,bonneReponse);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getEnonce() {
        String resultat = QCE.getEnonce();
        String enonce = "Quelle est la capital de la Chine";

        assertTrue(resultat==enonce);

    }

    @Test
    public void getScoreForIndice() {
       float Bonnereponse = QCE.getScoreForIndice(3);

        assertTrue(Bonnereponse==100);
    }
}