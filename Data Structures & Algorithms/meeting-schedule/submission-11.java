/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals == null || intervals.isEmpty()) return true;

        Collections.sort(intervals, Comparator.comparingInt(i -> i.start));
        int s = intervals.get(0).start, l = intervals.get(0).end;

        for(int i = 1 ; i < intervals.size(); i++){
            if(intervals.get(i).start >= s && intervals.get(i).start < l ){
                return false;
            }
            s = intervals.get(i).start;
            l = intervals.get(i).end;
        }
        return true;
    }
}
