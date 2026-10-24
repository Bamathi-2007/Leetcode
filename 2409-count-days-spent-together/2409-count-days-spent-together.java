class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int aliceAmonth = Integer.parseInt(arriveAlice, 0, 2, 10);
        int aliceAday = Integer.parseInt(arriveAlice, 3, 5, 10);
        int aliceLmonth = Integer.parseInt(leaveAlice, 0, 2, 10);
        int aliceLday = Integer.parseInt(leaveAlice, 3, 5, 10);

        int bobAmonth = Integer.parseInt(arriveBob, 0, 2, 10);
        int bobAday = Integer.parseInt(arriveBob, 3, 5, 10);
        int bobLmonth = Integer.parseInt(leaveBob, 0, 2, 10);
        int bobLday = Integer.parseInt(leaveBob, 3, 5, 10);

        int start1 = getDayOfYear(aliceAmonth, aliceAday, days);
        int end1 = getDayOfYear(aliceLmonth, aliceLday, days);

        int start2 = getDayOfYear(bobAmonth, bobAday, days);
        int end2 = getDayOfYear(bobLmonth, bobLday, days);

        int commonStart = Math.max(start1, start2);
        int commonEnd = Math.min(end1, end2);

        if(commonStart <= commonEnd){
            return commonEnd - commonStart + 1;
        }
        else{
            return 0;
        }
    }

    public int getDayOfYear(int month, int day, int days[]){
        int days_of_year = 0;

        for(int i=0; i<month - 1; i++){
            days_of_year += days[i];
        }

        return days_of_year + day;
    }
}