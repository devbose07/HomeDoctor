package com.xmx.homedoctor;

/**
 * Created by The_onE on 2016/2/24.
 */
public class Constants {
    public static final String FILE_DIR = "/HomeNurse/Doctor";
    public static final String DATABASE_DIR = FILE_DIR + "/Database";
    public static final String DATABASE_FILE = DATABASE_DIR + "/database.db";

    public static final long LONGEST_EXIT_TIME = 2000;
    public static final int SPLASH_TIME = 3000;

    public static final int LONGEST_LOAD_TIME = 20;

    public static final long UPDATE_FREQUENCY = 1000;

    public static final long DAY_TIME = 60 * 60 * 24 * 1000;
    public static final long HOUR_TIME = 60 * 60 * 1000;
    public static final long MINUTE_TIME = 60 * 1000;
    public static final long SECOND_TIME = 1000;

    public static final int[] DAYS_OF_MONTH = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static final String[] DAY_OF_WEEK = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};

    public static final int GENERAL_TYPE = 0;
    public static final int DAILY_TYPE = 1;
    public static final int PERIOD_TYPE = 2;

    public static final int EARLIER_TIME = 3 * 1000;

    public static final int MIN_PERIOD = 10 * 1000;

    public static final int GOOD_TYPE = 0;
    public static final int HIGH_TYPE = 1;
    public static final int HIGHEST_TYPE = 2;

    public static final String[] APPOINTMENT_TYPE = {"门诊", "住院"};

    public static final int STATUS_WAITING = 0;
    public static final int STATUS_CANCELED = -1;
    public static final int STATUS_DELETED = -2;
    public static final int STATUS_COMPLETE = 1;
}
