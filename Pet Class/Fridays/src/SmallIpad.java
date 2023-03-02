public class SmallIpad implements IpadInterface{
    private int memorySize;

    public SmallIpad(int memory) {
        this.memorySize = memory;
    }

    public double computePrice() {
        return memorySize * 5;
    }

    public String toString() {
        return memorySize + "GB memory,  and costs $" + computePrice();
    }
}