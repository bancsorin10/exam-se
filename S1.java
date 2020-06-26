
public class S1 {
    public static void main(String[] args) {
    }
}

interface C {
}

class B implements C {
    private D d;
    private long t;

    public void x() {}
}

class A {
    public void metB(B b) {}
}

class E {
    private B b;
    private F f;

    public void metG(int i) {}
}

class F {
    public void metA() {}
}

class G {
    private E e;
}

class D {
}
