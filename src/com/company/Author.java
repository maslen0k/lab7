package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Author<T> {
    private T name;
    private ArrayList<T> steeh = new ArrayList<>();
    private ArrayList<T> strokee = new ArrayList<>();

    public Author() { }

    public Author(T name, ArrayList<T> steeh, ArrayList<T> strokee) {
        this.name = name;
        this.steeh = steeh;
        this.strokee = strokee;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public ArrayList<T> getSteeh() {
        return steeh;
    }

    public void addSteeh(T steeh) {
        this.steeh.add(steeh);
    }

    public void addStrokee(T[] strokee) {
        this.strokee.addAll(Arrays.asList(strokee));
    }

    public ArrayList<T> sortStrokee() {
        ArrayList<T> sortedList = this.getSteeh();
        sortedList.sort((obj1, obj2) -> SortByLength.sortByStringLength((String)obj1, (String)obj2));
        return sortedList;
    }
}
