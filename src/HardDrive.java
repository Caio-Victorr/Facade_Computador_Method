public class HardDrive {

    public void read(Computador c){
        String s = String.format("HardDrive do Computador (%s) lido com sucesso!", c.getModelo());
        System.out.println(s);
    }

    public void write(Computador c){
        String s = String.format("HardDrive do Computador (%s) escrito com sucesso!", c.getModelo());
        System.out.println(s);
    }
}
