package com.ws;

import com.lumber.LumberBaseActivity;
import com.lumber.util.LumberLog;

/**
 * Created by H193409 on 1/26/2018.
 */

public class LumberRequestFactory {
    private static final String TAG = LumberRequestFactory.class.getSimpleName();

    public static final int REQUEST_USER_AUTHTOKEN = 1;

    public static boolean makeLoginRequest(String userName, String password, LumberBaseActivity responseListener) {
        boolean b = false;
        LumberLog.d(TAG, "Making a login request to get auth token");

        getRequestParams(REQUEST_USER_AUTHTOKEN);
        return b;
    }

    private static void getRequestParams(int requestUserAuthtoken) {
    }
}
