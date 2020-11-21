package deqo;

/**
 * Classe représentant une question à choix exclusive.
 */
public class QuestionAChoixExclusif implements QuestionAChoix {
    /**
     * enonce est la question.
     */
    private String enonce;
    /**
     * cette variable est le numero de la bonne Reponse
     */
    private int indiceBonneReponse;

    /**
     * Une question à choix excusive est complètement caractérisé
     * par son énoncé et l'indice de sa bonne réponse.
     * @param question l'énoncé de la question
     * @param indiceBonneReponse l'indice de la bonne réponse
     */
    public QuestionAChoixExclusif(final String question, final int indiceBonneReponse) {
        this.enonce = question;
        this.indiceBonneReponse = indiceBonneReponse;
    }

    /**
     * Récupère l'énoncé de la question.
     * @return l'énoncé de la question
     */
    public String getEnonce() {
        return enonce;
    }

    /**
     * Opération permettant de récupérer le score donné par un choix.
     * @param indiceChoix l'indice du choix
     * @return 100 si l'indice du choix fourni est l'indice de la bonne réponse, 0 autrement
     */
    public float getScoreForIndice(int indiceChoix) {
        if (indiceChoix == indiceBonneReponse) {
            return 100;
        }
        return 0;
    }
}
