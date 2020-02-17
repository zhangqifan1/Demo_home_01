package com.example.demo_home_01;

import java.util.List;

/**
 * -----------------------------
 * Created by zqf on 2020/2/14.
 * ---------------------------
 */
public class YiQingBean {

    private List<DataBean> data;

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 1
         * date : 2020-02-12
         * confirmedNum : 59882
         * suspectedNum : 13435
         * curesNum : 5915
         * deathsNum : 1368
         * suspectedIncr : 2807
         */

        private int id;
        private String date;
        private int confirmedNum;
        private int suspectedNum;
        private int curesNum;
        private int deathsNum;
        private int suspectedIncr;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public int getConfirmedNum() {
            return confirmedNum;
        }

        public void setConfirmedNum(int confirmedNum) {
            this.confirmedNum = confirmedNum;
        }

        public int getSuspectedNum() {
            return suspectedNum;
        }

        public void setSuspectedNum(int suspectedNum) {
            this.suspectedNum = suspectedNum;
        }

        public int getCuresNum() {
            return curesNum;
        }

        public void setCuresNum(int curesNum) {
            this.curesNum = curesNum;
        }

        public int getDeathsNum() {
            return deathsNum;
        }

        public void setDeathsNum(int deathsNum) {
            this.deathsNum = deathsNum;
        }

        public int getSuspectedIncr() {
            return suspectedIncr;
        }

        public void setSuspectedIncr(int suspectedIncr) {
            this.suspectedIncr = suspectedIncr;
        }
    }
}
