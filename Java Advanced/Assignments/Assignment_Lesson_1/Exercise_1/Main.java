package Assignments.Assignment_Lesson_1.Exercise_1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        GroupRepository groupRepository = new GroupRepository();
        // a) createGroups
        groupRepository.createGroups("HelloWorld");

        // b) getAllGroups
        List<Group> groups = groupRepository.getAllGroups();
        for(Group group : groups){
            System.out.println("ID: " + group.getId() + ", Name: " + group.getName());
        }

        // c) getGroupById
        Group group = groupRepository.getGroupById(3);
        if(group != null){
            System.out.println("ID: " + group.getId() + ", Name: " + group.getName());
        }
        else{
            System.out.println("Cannot find group with id = 3");
        }

        // d) getGroupByName
        Group group1 = groupRepository.getGroupByName("HelloWorld");
        if(group1 != null){
            System.out.println("ID: " + group1.getId() + ", Name: " + group1.getName());
        }
        else{
            System.out.println("Cannot find group with name = HelloWorld");
        }

        // e) updateGroup
        groupRepository.updateGroup(3, "HienGroup");

        // f) deleteGroup
        groupRepository.deleteGroup(3);

        // g) isGroupExistById
        boolean result = groupRepository.isGroupExistById(3);
        if(result){
            System.out.println("Group exissted!");
        }
        else{
            System.out.println("Group does not existed!");
        }

        // h) isGroupExistByName
        boolean result1 = groupRepository.isGroupExistByName("HienGroup");
        if(result1){
            System.out.println("Group existed!");
        }
        else{
            System.out.println("Group does not existed");
        }
    }
}
