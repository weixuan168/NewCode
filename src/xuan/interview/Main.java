package xuan.interview;

import sun.nio.ch.ThreadPool;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static int halfSearch(List<Integer> list,int key)
    {
        int max,min,mid;
        max=list.size()-1;
        min=0;
        while(min<=max)
        {
            mid=(max+min)>>1;
            int tmp=list.get(mid);
            if(tmp>key)
                max=mid-1;
            else if(tmp<key)
                min=mid+1;
            else return mid;
        }
        return min;

    }
    public static void main(String[] args) {
//        ThreadPoolExecutor;
//        Executors;
//        ExecutorService;
//        TreeMap;
//        ReentrantLock;
//        Timer;
//        Callable;
//        Future;
//        Runnable;
//        FutureTask;
//        LocalDate;
//        Date;
        Scanner in = new Scanner(System.in);
        int jobNum = in.nextInt();
        int peopleNum = in.nextInt();
        Map<Integer, Integer> job = new HashMap<>();
        Map<Integer, Integer> job1 = new HashMap<>();
        int[] people = new int[peopleNum];
        int[] jobds = new int[jobNum];
        int[] jobps = new int[jobNum];
        for (int i = 0; i < jobNum; i++) {
            jobds[i] = in.nextInt();
            jobps[i] = in.nextInt();
            job.put(jobds[i], jobps[i]);
            job1.put(jobps[i], jobds[i]);
        }
        for(int i=0;i<peopleNum;i++) {
            people[i] = in.nextInt();
        }
        Arrays.sort(jobds);
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<jobNum;i++) {
            list.add(jobds[i]);
        }
        for(int i=0;i<peopleNum;i++) {
            int d = halfSearch(list, people[i]);
            if (people[i]==jobds[d]&&job.containsKey(jobds[d])) {
                System.out.println(job.get(jobds[d]));
            } else {
                System.out.println(job.get(jobds[d - 1]));
            }
        }
    }
}
