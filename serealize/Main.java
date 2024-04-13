package serealize;

public class Main {

  class A {

    private String a;

    public void setA(String a) {
      this.a = a;
    }
  }

  void method() {
    // 匿名クラス
    new A() {
      {
        setA("a");
      }
    };

    // ローカルクラス
    class B extends A {

      {
        setA("a");
      }
    }
  }
}
