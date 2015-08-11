package com.example.richellevital.welovesung_jaetoo;

/**
 * Created by richellevital on 8/10/15.
 */
import android.app.Activity;
import android.os.Bundle;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.richellevital.welovesung_jaetoo.Content;

public class App extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println( "Sending POST to GCM" );

        String apiKey = "APA91bHbypzdfX4r5Wp4gTX8fEVCMSRJIzwXnbjY_gUzJTONSuMYI3p4c6c4QiSErFm6w90GGAaFHjpoRBe_-CErZPwuG78pIp27vB-RukI3fHy7zwoSFU8QEEueSnxqV8kbLzUiVvYpwe50JRsNymeE7UejRY1urA";
        Content content = createContent();

        POST2GCM.post(apiKey, content);
    }

    public static Content createContent(){

        Content c = new Content();

        c.addRegId("APA91bHbypzdfX4r5Wp4gTX8fEVCMSRJIzwXnbjY_gUzJTONSuMYI3p4c6c4QiSErFm6w90GGAaFHjpoRBe_-CErZPwuG78pIp27vB-RukI3fHy7zwoSFU8QEEueSnxqV8kbLzUiVvYpwe50JRsNymeE7UejRY1urA");
        c.createData("Test Title", "Test Message");

        return c;
    }
}
