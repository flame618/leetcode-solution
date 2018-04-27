/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> res = new ArrayList<>();
        if(intervals.size() == 0) return res;
        Collections.sort(intervals, new Comparator<Interval>()
                         {
                             public int compare(Interval a, Interval b)
                             {
                                 return a.start - b.start;
                             }
                         });
        int j = 0;
        res.add(intervals.get(0));
        for(int i = 1; i < intervals.size(); i++)
        {
            if(intervals.get(i).start <= res.get(j).end)
            {
                res.get(j).end = Math.max(intervals.get(i).end, res.get(j).end);
            }
            else
            {
                res.add(intervals.get(i));
                j++;
            }
        }
        return res;
    }
}
