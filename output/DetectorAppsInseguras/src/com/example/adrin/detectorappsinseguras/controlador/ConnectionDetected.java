// 
// Decompiled by Procyon v0.5.30
// 

package com.example.adrin.detectorappsinseguras.controlador;

import java.io.IOException;
import java.net.URL;
import java.net.HttpURLConnection;
import android.net.ConnectivityManager;
import android.content.Context;

public class ConnectionDetected
{
    public static boolean hasActiveInternetConnection(final Context context) {
        return ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo() != null;
    }
    
    public static int isNetworkAvailable(final Context context) {
        if (hasActiveInternetConnection(context)) {
            try {
                final HttpURLConnection httpURLConnection = (HttpURLConnection)new URL("http://www.google.com").openConnection();
                httpURLConnection.setRequestProperty("User-Agent", "Test");
                httpURLConnection.setRequestProperty("Connection", "close");
                httpURLConnection.setConnectTimeout(1500);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == 200) {
                    return 1;
                }
                return 0;
            }
            catch (IOException ex) {
                System.out.println("No internet disponible");
                return -1;
            }
        }
        System.out.println("No internet disponible");
        return -1;
    }
}
