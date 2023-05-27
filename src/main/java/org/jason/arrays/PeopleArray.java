package org.jason.arrays;

import org.jason.test.testNo4;
public class PeopleArray {
    private testNo4[][] people;

    public PeopleArray(int group, int seat) {
        people = new testNo4[group][seat];
    }

    public testNo4[][] getPeople() {
        return people;
    }

    public void setPeople(testNo4[][] people) {
        this.people = people;
    }
}
