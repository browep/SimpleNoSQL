package com.colintmiller.simplenosql.toolbox;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

/**
 * Created by pbrower on 6/12/15.
 */
public class ExceptionUtils {
    private static final String TAG = ExceptionUtils.class.getCanonicalName();

    /**
     * Created by pbrower on 6/12/15.
     */
    public interface SilentExceptionHandler {
        void handleSilentException(Exception e);
    }

    public static void handleSilentException(Context context, Exception e) {
        if (context instanceof SilentExceptionHandler) {
            ((SilentExceptionHandler) context).handleSilentException(e);
        }
        else if(context instanceof Activity) {
            ((SilentExceptionHandler) ((Activity) context).getApplication()).handleSilentException(e);
        } else {
            Log.e(TAG, "was not able to handle silently with: " + context, new Throwable());
        }
    }
}
