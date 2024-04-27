package timingtest;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
public class TimeSLList {
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
        timeGetLast();
    }

    public static void timeGetLast() {
        // TODO: YOUR CODE HERE
        AList<Double> times = new AList<>();
        AList<Integer> Ns = new AList<>();
        AList<Integer> Ops = new AList<>();
        for(int i = 1000; i <= 128000; i = i * 2){
            SLList<Integer> lst = new SLList<>();
            for(int j = 0; j < i; j++){
                lst.addLast(j);
            }
            Stopwatch sw = new Stopwatch();
            for(int j=0; j<10000; j++){
                lst.getLast();
            }
            double timeInSeconds = sw.elapsedTime();
            Ns.addLast(i);
            Ops.addLast(10000);
            times.addLast(timeInSeconds);
        }
        printTimingTable(Ns, times, Ops);
    }

}
