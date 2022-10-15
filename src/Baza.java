
class Baza {

    private char[] tab = new char[100]; /* ... */

    private Baza(){}
    public static IPolaczenie getPolaczenie() {

        return Polaczenie.getInstance();

    }

    private static class Polaczenie implements IPolaczenie {

        private Baza baza;
        private static int kolejnosc = 0;
        private static Polaczenie[] polaczenia = null;

        private Polaczenie (Baza baza) {
            this.baza = baza;
        }
        public static IPolaczenie getInstance() {
            if(polaczenia == null){
                Baza baza = new Baza();
                polaczenia = new Polaczenie[] {new Polaczenie(baza),new Polaczenie(baza),new Polaczenie(baza)};
            }
            kolejnosc = (kolejnosc + 1) % polaczenia.length;
            return polaczenia[kolejnosc];
        }

        public char get(int indeks) {
            return baza.tab[indeks];
        }

        public void set(int indeks, char c) {
            baza.tab[indeks] = c;
        }

        public int length() {
            return baza.tab.length;
        }

    }

}
