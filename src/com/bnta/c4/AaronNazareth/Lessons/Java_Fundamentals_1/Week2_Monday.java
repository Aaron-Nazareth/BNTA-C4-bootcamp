package com.bnta.c4.AaronNazareth.Lessons.Java_Fundamentals_1;

public class Week2_Monday {
    public static void main(String[] args) {
//        String [] names = {"Aaron", "Wendy", "Will"};
//        names[2] = "William";
//        names[1] = null;
//        System.out.println(Arrays.toString(names));

//        for (int i = 0; i <= 10; i++) {
//            // Start at 0 and increment by 1 as far as 10
//            System.out.println(i);
//        }

//        String [] names = {"Aaron", "Wendy", "Will"};
//
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }
//        // However, there is a neater way of doing this
//        for (String name : names) {
//            System.out.println(name);
//        }

        String [] names = {"Aaron", "Wendy", "Will", "Linda"};

//        for (String name : names) {
//            boolean findingWill = name.equals("Will");
//            if (findingWill) {
//                continue;   // Loop will skip past index that satisfies conditions
//            }
//            System.out.println(name);
//        }

        for (String name : names) {
            boolean findingWill = name.equals("Will");
            if (findingWill) {
                break;   // Loop will end at index that satisfies conditions
            }
            System.out.println(name);
        }
    }
}
