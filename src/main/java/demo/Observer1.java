package demo;

import java.util.Observable;
import java.util.Observer;

public class Observer1 implements Observer {

  public void update(Observable o, Object arg) {
    System.out.println("Observer1 被通知");
  }
}

class ObserverWithArg implements Observer {

  public void update(Observable o, Object arg) {
    System.out.println("ObserverWithArg 被通知，参数为："+
        ((Integer)arg).intValue());
  }
}

class BeingObserved extends Observable {

  //setChanged方法被调用时会通知观察者
  void incre() {
    setChanged();
    /**
     * 调用所有观察者的update方法（通知他们本对象已经改变）
     * 重载方法notifyObservers(Object obj) 可以给update方法传参
     */
    notifyObservers();
  }
  //setChanged方法被调用时会通知观察者
  void func1() {
    setChanged();
    System.out.println("Change status with setChanged:" + hasChanged());
    notifyObservers();
  }
  //setChanged方法没有被调用时，不会通知观察者
  void func2() {
    System.out.println("Change status withoutsetChanged :" + hasChanged());
    notifyObservers();
  }

  void func3() {
    setChanged();
    //clearChanged方法清空所有setChanged方法引起的改变
    clearChanged();
    notifyObservers();
  }

  /**
   * 向观察者传递参数
   */
  void passArg() {
    setChanged();
    notifyObservers(new Integer(10));
  }


}