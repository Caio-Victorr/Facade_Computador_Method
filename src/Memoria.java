public class Memoria {

    public void load(Computador c){
        String s = String.format("Memoria do Computador (%s) carregado com sucesso!", c.getModelo());
        System.out.println(s);
    }

    public void free(Computador c){
        String s = String.format("Memoria do Computador (%s) liberado com sucesso!", c.getModelo());
        System.out.println(s);
    }
}
