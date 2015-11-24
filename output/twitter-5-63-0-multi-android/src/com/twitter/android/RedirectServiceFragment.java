// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import org.apache.http.client.HttpClient;
import android.net.Uri;
import org.apache.http.impl.client.DefaultHttpClient;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.Fragment;

public class RedirectServiceFragment extends Fragment
{
    private pi a;
    
    @Override
    public void onAttach(final Activity activity) {
        super.onAttach(activity);
        this.a = (pi)activity;
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setRetainInstance(true);
        final Bundle arguments = this.getArguments();
        new ph(this.a, (HttpClient)new DefaultHttpClient(), Uri.parse(arguments.getString("redirect_uri")), arguments.getBoolean("wait_for_response")).execute((Object[])new Void[0]);
    }
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        return layoutInflater.inflate(2130969008, viewGroup, false);
    }
    
    @Override
    public void onDetach() {
        super.onDetach();
        this.a = null;
    }
}
