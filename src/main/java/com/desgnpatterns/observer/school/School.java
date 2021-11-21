package com.desgnpatterns.observer.school;

import java.util.ArrayList;
import java.util.List;

public final class School implements Subject {
    public static void main(final String[] args) {

        final School school = new School();
        final ParentObserver anxiousParent = new AnxiousParentObserver();
        final ParentObserver patientParent = new PatientParentObserver();

        // Uisng Lambdas.
        final ParentObserver anxiousP = name -> System.out.println("Oh No, again a test: " + name);


        final ParentObserver patientP = (name) -> {
            System.out.println("Lets prepare for the next test: " + name);
        };


        school.attach(anxiousParent);
        school.attach(patientParent);
        school.attach(anxiousP);
        school.attach(patientP);

        school.notifyParents("Maths - Monday");
        school.notifyParents("Science - Friday");
    }

    private final List<ParentObserver> parents = new ArrayList();

    @Override
    public void notifyParents(final String name) {
        for (final ParentObserver parent : this.parents) {
            parent.observeTestDate(name);
        }
    }

    @Override
    public void attach(final ParentObserver parent) {
        this.parents.add(parent);
    }

    @Override
    public void detach(final ParentObserver parent) {
        this.parents.remove(parent);
    }
}
