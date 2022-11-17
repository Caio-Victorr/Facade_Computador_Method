public class Facade {

    private CPU cpu;
    private Memoria memor;
    private HardDrive hd;

    public Facade(){
        this.cpu = new CPU();
        this.memor = new Memoria();
        this.hd = new HardDrive();
    }

    public void start(Computador c){
        this.cpu.start(c);
        this.cpu.execute(c);
        this.memor.free(c);
        this.memor.load(c);
        this.hd.read(c);
        this.hd.write(c);
    }
}
