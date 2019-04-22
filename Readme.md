Observer接口和Observable类让你简单快速的实现观察者模式
2.观察者模式概述
2.1 角色：被观察对象，观察者

2.2 关系： 
1）.被观察对象：观察者 = 1：n 
2）.被观察对象状态发生变化，会通知所有观察者，观察者将做出相应的反应
Observable同样是java.util包下的接口（理所当然的事），该类的成员变量和方法如下：

public class Observable {
    private boolean changed = false;
    private Vector<Observer> obs;
    public Observable(){};
    protected synchronized void setChanged(){};
    protected synchronized void clearChanged(){};
    public synchronized void addObserver(Observer o){};
    public synchronized void deleteObserver(Observer o) {};
    public synchronized void deleteObservers(){};
    public synchronized boolean hasChanged(){};
    public synchronized int countObservers(){};
    public void notifyObservers(){};
    public void notifyObservers(Object arg){};
}
参考：https://www.geeksforgeeks.org/java-util-observable-class-java/
