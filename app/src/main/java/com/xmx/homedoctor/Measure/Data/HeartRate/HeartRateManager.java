package com.xmx.homedoctor.Measure.Data.HeartRate;

import com.xmx.homedoctor.Tools.Data.Sync.BaseSyncEntityManager;

import java.util.Date;
import java.util.List;

/**
 * Created by The_onE on 2016/6/10.
 */
public class HeartRateManager extends BaseSyncEntityManager<HeartRate> {
    private static HeartRateManager instance;

    public synchronized static HeartRateManager getInstance() {
        if (null == instance) {
            instance = new HeartRateManager();
        }
        return instance;
    }

    private HeartRateManager() {
        setTableName("HeartRate");
        setEntityTemplate(new HeartRate());
    }

    public HeartRate selectByDate(String id, int year, int month, int day) {
        List<HeartRate> list = getSQLManager().selectByCondition("Time", false,
                "Year = " + year, "Month = " + month,
                "Day = " + day, "Patient = '" + id + "'");
        if (list.size() > 0) {
            return list.get(0);
        } else {
            return null;
        }
    }

    public HeartRate selectToday(String id) {
        Date time = new Date();
        return selectByDate(id, time.getYear() + 1900, time.getMonth() + 1, time.getDate());
    }
}
