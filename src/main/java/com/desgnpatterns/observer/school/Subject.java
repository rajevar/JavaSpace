package com.desgnpatterns.observer.school;

public interface Subject {
    public void attach(ParentObserver observer);
    public void detach(ParentObserver observer);
    public void notifyParents(String name);
}