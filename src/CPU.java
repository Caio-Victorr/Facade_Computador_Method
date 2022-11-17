public class CPU {

    public void start(Computador c){
        String s = String.format("CPU do Computador (%s) iniciado com sucesso!", c.getModelo());
        System.out.println(s);
    }

    public void execute(Computador c){
        String s = String.format("CPU do Computador (%s) executado com sucesso!", c.getModelo());
        System.out.println(s);
    }
}
