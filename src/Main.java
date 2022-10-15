

public class Main {

    public static void main(String[] args) {
        IPolaczenie pol1 = Baza.getPolaczenie();
        IPolaczenie pol2 = Baza.getPolaczenie();
        IPolaczenie pol3 = Baza.getPolaczenie();
        IPolaczenie pol4 = Baza.getPolaczenie();

        pol1.set(1, 'q');
        pol2.set(2, 'w');
        pol3.set(3, 'e');
        System.out.println(pol2.get(1));
        System.out.println(pol3.get(2));
        System.out.println(pol1.get(3));
        System.out.println(pol4.get(3));
        if(pol1 == pol4) System.out.println("polaczenia sa identyczne: "+ pol1.toString() + " oraz " + pol4.toString());
        if(pol1 == pol3) System.out.println("polaczenia sa identyczne");
    }

}
