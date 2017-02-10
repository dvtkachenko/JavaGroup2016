package com.brainacad.module2_13.lab.test_enum3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Дима on 10.02.2017.
 */
public class TrainSchedule {
    enum DayOfWeek {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

    class Train {
        int number;
        String stationDispatch;
        String stationArrival;
        String timeDispatch;
        String timeArrival;
        DayOfWeek[] day; //

        public Train(int number) {this.number = number;};

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getStationDispatch() {
            return stationDispatch;
        }

        public void setStationDispatch(String stationDispatch) {
            this.stationDispatch = stationDispatch;
        }

        public String getStationArrival() {
            return stationArrival;
        }

        public void setStationArrival(String stationArrival) {
            this.stationArrival = stationArrival;
        }

        public String getTimeDispatch() {
            return timeDispatch;
        }

        public void setTimeDispatch(String timeDispatch) {
            this.timeDispatch = timeDispatch;
        }

        public String getTimeArrival() {
            return timeArrival;
        }

        public void setTimeArrival(String timeArrival) {
            this.timeArrival = timeArrival;
        }

        public DayOfWeek[] getDay() {
            return day;
        }

        public void setDay(DayOfWeek[] day) {
            this.day = day;
        }

        @Override
        public String toString() {
            return "Train{" +
                    "number=" + number +
                    ", stationDispatch='" + stationDispatch + '\'' +
                    ", stationArrival='" + stationArrival + '\'' +
                    ", timeDispatch='" + timeDispatch + '\'' +
                    ", timeArrival='" + timeArrival + '\'' +
                    ", days=" + Arrays.toString(days) +
                    '}';
        }
    }

    private Train[] trains;

    public TrainSchedule(int countTrain) {this.trains = new Train[countTrain];};

    public void addTrain() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add train on schedule on new line (q - quit) : ");
        int count = 0;
        while (scanner.hasNext()) {
            String inputStr = scanner.next();
            if (!inputStr.equals("q")) {
                if (trains[count] == null) {
                    String[] strs = inputStr.split(",");
                    Train train = new Train(Integer.parseInt(strs[0]));
                    DayOfWeek[] days = new DayOfWeek[1];
                    days[0] = DayOfWeek.valueOf(strs[1]);
                    train.setDay(days);
                    train.setStationDispatch(strs[2]);
                    train.setStationArrival(strs[3]);
                    train.setTimeDispatch(strs[4]);
                    train.setTimeArrival(strs[5]);
                    trains[count]=train;
                    count++;
                }
            } else {
                break;
            }
        }
    }

    public void printTrain() {
        for (Train train : trains) {
            System.out.println(train);
        }
    }

    public void searchTrain(String stationDispatch, String stationArrival, DayOfWeek day) {
        for (int i = 0; i < trains.length; i++) {
            if (stationDispatch.equals(trains[i].getStationDispatch()) &&
                stationDispatch.equals(trains[i].getStationArrival())) {
                // внести остальной код с фотографий
            }
        }
    }


}