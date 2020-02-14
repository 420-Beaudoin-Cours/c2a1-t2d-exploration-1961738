public class TableauxExploration {

    public static void initTen(int[][] tab){
        int nbligne = tab.length;
        int nbColonne = tab[0].length;

        for (int i = 0; i < nbligne; i++) {
            for (int j = 0; j < nbColonne; j++) {
                tab[i][j] = 10;
            }
        }
    }

    public static void initDiagonaleTen(int[][] tab) {
        int nbligne = tab.length;
        int nbColonne = tab[0].length;

        for (int i = 0; i < nbligne; i++) {
            for (int j = 0; j < nbColonne; j++) {
                tab[i][i] = 10;
            }
        }
    }

    public static void initPosition(String[][] tab) {
        int nbligne = tab.length;
        int nbColonne = tab[0].length;

        for (int i = 0; i < nbligne; i++) {
            for (int j = 0; j < nbColonne; j++) {
                tab[i][j] = i + ":" + j;
            }
        }
    }


    public static boolean isTabCarre(int[][] tab) {
        int nbLignes = tab.length;
        int nbColonne = tab[0].length;
        boolean carré = false;

        if (nbLignes == nbColonne)
            carré = true;

        return carré;
    }


    public static boolean isTabDimEgal(int[][] tab1, int[][] tab2) {
        int nbLignes1 = tab1.length;
        int nbColonne1 = tab1[0].length;
        int nbLignes2 = tab2.length;
        int nbColonne2 = tab2[0].length;
        boolean egal = false;

        if (nbColonne1 == nbColonne2 && nbLignes1 == nbLignes2)
            egal = true;
        return egal;
    }

    public static int[][] getSommeMatrices(int[][] matrice1, int[][] matrice2) {
        int nbLignes1 = matrice1.length;
        int nbColonne1 = matrice1[0].length;
        int[][] sommeMatrice = new int[matrice1.length][matrice1[0].length];

        for (int i = 0; i < nbLignes1; i++)
            for (int j = 0; j < nbColonne1; j++)
              sommeMatrice[i][j] = matrice1[i][j] + matrice2[i][j];

            return sommeMatrice;
    }
}
