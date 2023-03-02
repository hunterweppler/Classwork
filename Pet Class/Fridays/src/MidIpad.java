public class MidIpad implements IpadInterface{
    private int memorySize;

    public MidIpad(int memory) {
        this.memorySize = memory;
    }

    public double computePrice() {
        return memorySize * 7;
    }

    public String toString() {
        return memorySize + "GB memory,  and costs $" + computePrice();
    }
}