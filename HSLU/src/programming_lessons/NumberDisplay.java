package programming_lessons;

public class NumberDisplay {
    private int limit;
    private int value;
    // Constructor and methods omitted
    public NumberDisplay(int limits){
        this.limit = limits;
    }
    public NumberDisplay(int limits, int value){
        this.limit = limits;
        this.value = value;
    }
    public String getDisplayValue(){
        return (value < 10) ? "0" + value : "" + value;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public void increment(){
        value++;
        if(value == limit){
            value = 0;
        }

    }
    public int getLimit(){
        return limit;
    }
}
