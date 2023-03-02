public class BigIpad implements IpadInterface{
    private int memorySize;

    public BigIpad(int memory) {
        this.memorySize = memory;
    }

    public double computePrice() {
        return memorySize * 8;
    }

    public String toString() {
        return memorySize + "GB memory,  and costs $" + computePrice();
    }
}