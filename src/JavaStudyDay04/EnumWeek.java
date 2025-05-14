package JavaStudyDay04;

import java.util.Calendar;

public class EnumWeek {
    public static void main(String[] args) {
        Week today = null;

        String[] array = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};

        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);

        System.out.println("week = " + week);

/*        switch (week) {
            case 1:
                today = week.SUNDAY;
                break;

            case 2:
                today = week.MONDAY;break;
            case 3:
                today = week.TUESDAY;break;
            case 4:
                today = week.WEDNESDAY;break;
            case 5:
                today = week.THURSDAY;break;
            case 6:
                today = week.FRIDAY;break;
            case 7:
                today = week.SATURDAY;break;*/
        }
        System.out.println("오늘 요일은 " + array[week-1]);

    }
}
