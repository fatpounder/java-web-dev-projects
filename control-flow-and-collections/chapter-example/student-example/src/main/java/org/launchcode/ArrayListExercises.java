package org.launchcode;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class ArrayListExercises {
        public static int sumEven (ArrayList < Integer > arr) {
            int total = 0;
            for (int integer : arr) {
                if (integer % 2 == 0) {
                    total += integer;
                }
            }
            return total;

    }
}
