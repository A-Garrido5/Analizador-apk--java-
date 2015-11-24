// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.util.Map;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.api.z;
import com.twitter.library.client.az;
import com.twitter.android.widget.MessagePreference;
import android.os.Bundle;
import java.util.Iterator;
import com.twitter.android.widget.UserCheckBoxPreference;
import com.twitter.library.api.TwitterUser;
import java.util.ArrayList;
import android.widget.Toast;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import com.twitter.android.client.x;
import com.twitter.library.platform.PushService;
import java.util.HashMap;
import android.content.Intent;
import android.preference.Preference;
import com.twitter.library.client.Session;
import android.preference.PreferenceCategory;
import android.preference.CheckBoxPreference;
import android.preference.Preference$OnPreferenceChangeListener;
import com.twitter.android.client.TwitterPreferenceActivity;
import android.content.Context;
import android.os.AsyncTask;

class wz extends AsyncTask
{
    final /* synthetic */ TweetSettingsActivity a;
    
    private wz(final TweetSettingsActivity a) {
        this.a = a;
    }
    
    protected Void a(final Void... array) {
        TweetSettingsActivity.a((Context)this.a, this.a.c.e(), this.a.j);
        return null;
    }
}
