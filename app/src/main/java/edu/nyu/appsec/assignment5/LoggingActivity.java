/**
 * mrh583 - Commenting this file out. I cannot figure out what this file does. I see no way
 * to invoke this activity directly. Either case, it implies it is a LoggingActivity, but it does
 * not seem to do any logging. It inherits from AppCompatActivity which isn't specifically a
 * logging activity. In Android Studio debugger i cannot get this onCreate to hit a breakpoint.
 * So i am removing this as it is extraneos/dead code. If it does get called, it looks like it
 * would change the webview to the activity_logging layout.
 */
/**
package edu.nyu.appsec.assignment5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoggingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logging);
    }
}
*/