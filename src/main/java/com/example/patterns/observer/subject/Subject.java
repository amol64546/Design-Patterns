package com.example.patterns.observer.subject;

import com.example.patterns.observer.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
