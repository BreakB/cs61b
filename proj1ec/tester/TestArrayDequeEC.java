package tester;

import static org.junit.Assert.*;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;
import student.StudentArrayDeque;


public class TestArrayDequeEC {
    @Test
    public void randomizedTest() {
        StudentArrayDeque<Integer> broken = new StudentArrayDeque<>();
        ArrayDequeSolution<Integer> correct = new ArrayDequeSolution<>();

        int N = 5000;
        String msg = "\n";
        for (int i = 0; i < N; i += 1) {
            int operationNumber = StdRandom.uniform(0, 4);
            if (operationNumber == 0) {
                // addLast
                int randVal = StdRandom.uniform(0, 100);
                correct.addLast(randVal);
                broken.addLast(randVal);
                msg += "addFirst(" + randVal + ")\n";
            } else if (operationNumber == 1) {
                // addFirst
                int randVal = StdRandom.uniform(0, 100);
                correct.addFirst(randVal);
                broken.addFirst(randVal);
                msg += "addLast(" + randVal + ")\n";
            } else if (!correct.isEmpty() && !broken.isEmpty() && operationNumber == 2) {
                // removeFirst
                msg += "removeFirst()\n";
                assertEquals(msg,correct.removeFirst(), broken.removeFirst());
            } else if (!correct.isEmpty() && !broken.isEmpty() && operationNumber == 3) {
                // removeLast
                msg += "removeLast()\n";
                assertEquals(msg,correct.removeLast(), broken.removeLast());
            }
        }
    }
}
