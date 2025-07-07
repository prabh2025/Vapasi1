public class Laptop {
    String logo;
    Processor processor;
    Ram ram;
    Hdd hdd;

    Laptop(Processor processor,Ram ram,Hdd hdd,String logo)
    {
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.logo = logo;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "logo='" + logo + '\'' +
                ", processor=" + processor +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }

    public static void main(String[] args) {
        Processor processor = new Processor("Intel i9",6);
        Ram ram = new Ram(16,"DDR4");
        Hdd hdd = new Hdd(2048,"Seagate");

        Laptop laptop = new Laptop(processor,ram,hdd,"Asus");
        System.out.println(laptop);

        System.out.println("Updating the Laptop Specification");

        laptop.getRam().setArchitect("DDR5");
        laptop.getRam().setSize(32);
        laptop.getProcessor().setGeneration("AMDRyzen");

        System.out.println(laptop);

    }
}
