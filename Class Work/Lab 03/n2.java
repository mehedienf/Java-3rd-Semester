class SuperClass {
    int data1;
    SuperClass(int data1) {
        this.data1 = data1;
    }
    int getData1() {
        return data1;
    }
    void setData1(int data1) {
        this.data1 = data1;
    }
}
class SubClass extends SuperClass {
    int data2;
    SubClass(int data1, int data2) {
        super(data1);
        this.data2 = data2;
    }
    int getData2() {
        return data2;
    }
    void setData2(int data2) {
        this.data2 = data2;
    }
    String checkCondition() {
        if (data1 == 10 && data2 == 15) {
            return "Condition True!";
        }
        else {
            return "Condition False!";
        }
    }
}
public class n2 {
    public static void main(String[] args) {
        SubClass subClass = new SubClass(10, 15);
        System.out.println(subClass.checkCondition());
    }
}
