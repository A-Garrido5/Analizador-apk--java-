// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player;

import android.support.v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.google.android.youtube.player.internal.c;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;

public class YouTubePlayerSupportFragment extends Fragment implements e
{
    private final f a;
    private Bundle b;
    private YouTubePlayerView c;
    private String d;
    private d e;
    
    public YouTubePlayerSupportFragment() {
        this.a = new f(this, (byte)0);
    }
    
    private void a() {
        if (this.c != null && this.e != null) {
            this.c.a(this.getActivity(), this, this.d, this.e, this.b);
            this.b = null;
            this.e = null;
        }
    }
    
    public void a(final String s, final d e) {
        this.d = com.google.android.youtube.player.internal.c.a(s, "Developer key cannot be null or empty");
        this.e = e;
        this.a();
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundle2;
        if (bundle != null) {
            bundle2 = bundle.getBundle("YouTubePlayerSupportFragment.KEY_PLAYER_VIEW_STATE");
        }
        else {
            bundle2 = null;
        }
        this.b = bundle2;
    }
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        this.c = new YouTubePlayerView((Context)this.getActivity(), null, 0, this.a);
        this.a();
        return (View)this.c;
    }
    
    @Override
    public void onDestroy() {
        if (this.c != null) {
            final FragmentActivity activity = this.getActivity();
            this.c.a(activity == null || activity.isFinishing());
        }
        super.onDestroy();
    }
    
    @Override
    public void onDestroyView() {
        this.c.b(this.getActivity().isFinishing());
        this.c = null;
        super.onDestroyView();
    }
    
    @Override
    public void onPause() {
        this.c.c();
        super.onPause();
    }
    
    @Override
    public void onResume() {
        super.onResume();
        this.c.b();
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundle2;
        if (this.c != null) {
            bundle2 = this.c.e();
        }
        else {
            bundle2 = this.b;
        }
        bundle.putBundle("YouTubePlayerSupportFragment.KEY_PLAYER_VIEW_STATE", bundle2);
    }
    
    @Override
    public void onStart() {
        super.onStart();
        this.c.a();
    }
    
    @Override
    public void onStop() {
        this.c.d();
        super.onStop();
    }
}
