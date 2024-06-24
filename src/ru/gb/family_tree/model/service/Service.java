package ru.gb.family_tree.model.service;

import ru.gb.family_tree.model.human.Gender;
import ru.gb.family_tree.model.human.Human;
import ru.gb.family_tree.model.tree.FamTreeItem;
import ru.gb.family_tree.model.tree.FamilyTree;

import java.time.LocalDate;

public class Service {
    private FamilyTree familyTreeList;

    public Service(){
        familyTreeList = new FamilyTree<>();
    }


    public FamTreeItem createElement(String firstName, String lastName, LocalDate dob, LocalDate dod, Gender gender) {
        FamTreeItem element = new Human(firstName, lastName, dob, dod, gender);
        return element;
    }

    public FamTreeItem createElement(String firstName, String lastName, LocalDate dob, LocalDate dod, Gender gender, Human father, Human mother) {
        FamTreeItem element = new Human(firstName, lastName, dob, dod, gender, father, mother);
        return element;
    }

    public FamTreeItem createElement(String firstName, String lastName, LocalDate dob, LocalDate dod, Gender gender, Human father, Human mother, Human... children) {
        FamTreeItem element = new Human(firstName, lastName, dob, dod, gender, father, mother, children);
        return element;
    }




    public void addHumansInFamTree(FamTreeItem... humans) {
        familyTreeList.addHumansInFamTree(humans);
    }

    public void removeHumansFromFamTree(FamTreeItem... humans) {
        familyTreeList.removeHumansFromFamTree(humans);
    }


    public FamTreeItem findHuman(String firstName) {
        return familyTreeList.findHuman(firstName);
    }



    public void sortByFirstName(){
        familyTreeList.sortByFirstName();
    }

    public void sortById(){
        familyTreeList.sortById();
    }

    public void sortByGender(){
        familyTreeList.sortByGender();
    }

    public void sortByDob(){
        familyTreeList.sortByDob();
    }

    public void sortByDod(){
        familyTreeList.sortByDod();
    }
}