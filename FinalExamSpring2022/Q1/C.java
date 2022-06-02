package FinalExamSpring2022.Q1;

class A {
    private static int m = 10;

  void method1(int t) {
        System.out.println(t);
    }

    static void method2() {
        //access m here
        System.out.println(m);

    }
}

class B extends A {
   final void method1(int t) {//making final so if B class inherits by other class method1 won't override
        System.out.println(t);
    }
}
 public final class C extends A {//by using final keyword , making sure class C can't be inherited
   void method1(int t) {
        System.out.println(t);
    }
}
