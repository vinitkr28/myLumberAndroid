package com.lumber.util;

import android.util.Log;

/**
 * Created by H193409 on 12/28/2017.
 */

public class LumberLog {

    public static final int OFF = 0;
    public static final int V = 1;
    public static final int D = 2;
    public static final int I = 3;
    public static final int W = 4;
    public static final int E = 5;

    public static final int Lumber_UI = 10;
    public static final int Lumber_RF = 11;
    public static final int Lumber_DB = 12;

    private static int loggerLevel = 0;

    private static String lumberLogTag = "#LumberLog#:- ";

    public static void d(String tag, String msg) {
        if (loggerLevel >= D) {
            Log.d(tag, lumberLogTag + msg);
        }
    }

    public static void i(String tag, String msg) {
        if (loggerLevel >= I) {
            Log.i(tag, lumberLogTag + msg);
        }
    }

    public static void e(String tag, String msg) {
        if (loggerLevel >= E) {
            Log.e(tag, lumberLogTag + msg);
        }
    }

    public static void e(String tag, String msg, Throwable tr) {
        if (loggerLevel >= E) {
            Log.e(tag, lumberLogTag + msg, tr);
        }
    }

    public static void v(String tag, String msg) {
        if (loggerLevel >= V) {
            Log.v(tag, lumberLogTag + msg);
        }
    }

    public static void w(String tag, String msg) {
        if (loggerLevel >= W) {
            Log.w(tag, lumberLogTag + msg);
        }
    }

    public static void setLoggerLevel(int level) {
        loggerLevel = level;
    }

    /*public static String getLoggerLevel() {
        String strLoggerLevel = null;
        switch (loggerLevel){
            case OFF :strLoggerLevel = "OFF";
            break;
            case V :strLoggerLevel = "V";
            break;
            case D :strLoggerLevel = "D";
            break;
            case I :strLoggerLevel = "I";
            break;
            case W :strLoggerLevel = "W";
            break;
            case E :strLoggerLevel = "E";
            break;
        }
        return strLoggerLevel;
    }*/

    public static int getLoggerLevel(){
        return loggerLevel;
    }
}
