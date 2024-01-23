package timingtest;
import afu.org.checkerframework.checker.igj.qual.I;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Stopwatch;
import org.checkerframework.checker.units.qual.A;

/**
 * Created by hug.
 */
public class TimeAList {
    private static void printTimingTable(AList<Integer> Ns, AList<Double> times, AList<Integer> opCounts) {
        System.out.printf("%12s %12s %12s %12s\n", "N", "time (s)", "# ops", "microsec/op");
        System.out.printf("------------------------------------------------------------\n");
        for (int i = 0; i < Ns.size(); i += 1) {
            int N = Ns.get(i);
            double time = times.get(i);
            int opCount = opCounts.get(i);
            double timePerOp = time / opCount * 1e6;
            System.out.printf("%12d %12.2f %12d %12.2f\n", N, time, opCount, timePerOp);
        }
    }

    public static void main(String[] args) {
        timeAListConstruction();
    }

    public static void timeAListConstruction() {
        // TODO: YOUR CODE HERE
        AList<Integer> N = new AList<>();
        AList<Integer> Ns = new AList<>();
        AList<Double> times = new AList<>();
        AList<Integer> opCounts = new AList<>();

        Stopwatch sw = new Stopwatch();
        int op = 0;
        int pow = 0;
        for(int i = 1 ; i <= 128000; i++ ) {
            N.addLast(i);
            op++;
            if (N.size() == Math.pow(2, pow) * 1000) {
                Ns.addLast(N.size());
                times.addLast(sw.elapsedTime());
                opCounts.addLast(op);
                pow++;
            }
        }
        printTimingTable(Ns,times,opCounts);
    }
}
