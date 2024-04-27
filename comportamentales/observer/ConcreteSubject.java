package observer;

import java.util.*;

class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();
  
    private String state;
  
    public String getState() {
      return state;
    }
  
    public void setState(String state) {
      this.state = state;
      notifyObservers();
    }
  
    @Override
    public void registerObserver(Observer observer) {
      observers.add(observer);
    }
  
    @Override
    public void removeObserver(Observer observer) {
      observers.remove(observer);
    }
  
    @Override
    public void notifyObservers() {
      for (Observer observer : observers) {
        observer.update(this);
      }
    }
  }
  