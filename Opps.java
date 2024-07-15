public class Opps {
    public static void main(String[] args) {
        // Student s1 = new Student();
        // s1.calc(50, 50, 60);
        // System.out.println("Percentage:" + s1.per());
        pen p1 = new pen();
        p1.setColour("Blue");
        System.out.println(p1.color);
        p1.Tip(4);
        System.out.println(p1.Tip); 
    }
}

class pen {
    String color;
    int tip;

    void setColour(String newColor) {
        color = newColor;
    }

    void steTip(int newTip) {
        Tip = newTip;
    }
}

class Student {
    int age;
    float per;

    void calc(int java, int C, int HTML) {
        per = (java + C + HTML) / 3f;
    }

    float per() {
        return per;
    }
}
