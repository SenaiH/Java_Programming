package day_21_MultiDimensionalArray;

import java.util.Arrays;

public class MultidimensionalArrayPractice {
    public static void main(String[] args) {

        String[] group1 = {"Lucy", "Umran", "Sumeye", "Abidullah"}; //4names;
        String[] group2 = {"Madiyar", "Khashayar", "Rayhane"}; //3 names;
        String[] group3 = {"Alena", "Evgeniya", "Shukur", "Hasan", "Bilal"}; //5 names;
        String[] group4 = {"Adelina", "Ali"}; //2 names;

        String [][] groupName = {group1,group2,group3,group4};

//        for (String[] each : groupName) {
//            System.out.println(Arrays.toString(each));
//
//            for (String each1 : each) {
//                System.out.println(each1);
//            }
//        }

        for (int i = 0; i < groupName.length; i++) {
            String[] eachGroup = groupName[i];
            System.out.println(Arrays.toString(eachGroup));

            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);
            }

        }


        System.out.println("-----------------------------------------------------------");

        for (String[] eachGroup : groupName) {
            System.out.println(Arrays.toString(eachGroup) );
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
        }


        System.out.println("-----------------------------------------------------------");

        for (int i = groupName.length - 1; i >= 0; i--) {

            String[] eachGroup = groupName[i];
            System.out.println(Arrays.toString(eachGroup));

            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }

        }


        System.out.println("-----------------------------------------------------------");

        System.out.println(groupName);

        System.out.println( Arrays.toString(groupName)); // toString() ==> for single dimensional arrays ONLY

        System.out.println( Arrays.deepToString(groupName) ); // deepToString() ==> for multi-dimensional dimensional arrays ONLY

    }

}
