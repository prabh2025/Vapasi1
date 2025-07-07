public class Ram {
    private int size;
    private String architect;

    public Ram(int size, String architect) {
        this.size = size;
        this.architect = architect;
    }

    public int getSize() {

        return size;
    }

    public void setSize(int size) {

        this.size = size;
    }

    public String getArchitect() {
        return architect;
    }

    public void setArchitect(String architect) {

        this.architect = architect;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "size=" + size +
                ", architect='" + architect + '\'' +
                '}';
    }
}
