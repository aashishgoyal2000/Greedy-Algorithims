import java.util.*;

class ActivitySelection {
    static class Activity implements Comparable<Activity> {
        int start;
        int end;
        Activity(int start, int end) {
            this.start = start;
            this.end = end;
        }
        @Override
        public int compareTo(Activity a) {
            if (this.end > a.end) return 1;
            else if (this.end < a.end) return -1;
            else {
                if (this.start > a.start) return 1;
            }
            return -1;
        }
    }
    
    public static int countActivity(ArrayList<Activity> al) {
        int count = 1;
        Activity start = al.get(0);
        for (int i = 1; i < al.size(); i++) {
            if (al.get(i).start >= start.end) {
                start = al.get(i);
                count++;
            }
            else {
                continue;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {

            int n = sc.nextInt();
            ArrayList<Activity> al = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                al.add(new Activity(sc.nextInt(), sc.nextInt()));
            }

            Collections.sort(al);
            // for (int i = 0; i < n; i++) {
            //     System.out.println(al.get(i).start + " " + al.get(i).end);
            // }
            System.out.println(countActivity(al));
            t--;
        }
    }
}