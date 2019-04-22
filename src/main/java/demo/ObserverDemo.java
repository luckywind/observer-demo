package demo;

public class ObserverDemo {

  public static void main(String[] args) {
    BeingObserved beingObserved = new BeingObserved();
    Observer1 observer1 = new Observer1();
    beingObserved.addObserver(observer1);
//    beingObserved.incre();  //Observer1 is added
//    beingObserved.func1();
//    beingObserved.func2();
//    beingObserved.func3(); //不会有任何输出

    ObserverWithArg observerWithArg = new ObserverWithArg();
    beingObserved.addObserver(observerWithArg);
    beingObserved.passArg();
    System.out.println("观察者个数："+beingObserved.countObservers());
    //删除指定observer
    beingObserved.deleteObserver(observer1);
    System.out.println("观察者个数：" + beingObserved.countObservers());
    //删除所有observer
    beingObserved.deleteObservers();
    System.out.println("观察者个数：" + beingObserved.countObservers());
  }

}
