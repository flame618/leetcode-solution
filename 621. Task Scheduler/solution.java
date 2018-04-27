class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] times = new int[26];
        for(int i = 0; i < tasks.length; i++)
        {
            int cur = tasks[i] - 'A';
            times[cur]++;
        }
        Arrays.sort(times); //排序后按任务出现次数高低排序，出现次数高的放在右边
        int max = times[25], maxcnt = 0;
        while(25 - maxcnt >= 0 && times[25 - maxcnt] == max) maxcnt++;  //计算跟出现次数最高的次数有相同次数对应的任务有几种
        return Math.max(tasks.length, (n + 1) * (max - 1) + maxcnt);//如果最大次数对应任务放完以后中间留的空位足够放下剩下的所有任务取右边值，如果放不下，则不会有空位留下，那就取任务总个数出来。
    }
}
