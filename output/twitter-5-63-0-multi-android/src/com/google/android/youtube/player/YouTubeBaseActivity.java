// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player;

import android.os.Bundle;
import android.app.Activity;

public class YouTubeBaseActivity extends Activity
{
    private b a;
    private YouTubePlayerView b;
    private int c;
    private Bundle d;
    
    final j a() {
        return this.a;
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.a = new b(this, (byte)0);
        Bundle bundle2;
        if (bundle != null) {
            bundle2 = bundle.getBundle("YouTubeBaseActivity.KEY_PLAYER_VIEW_STATE");
        }
        else {
            bundle2 = null;
        }
        this.d = bundle2;
    }
    
    protected void onDestroy() {
        if (this.b != null) {
            this.b.a(this.isFinishing());
        }
        super.onDestroy();
    }
    
    protected void onPause() {
        this.c = 1;
        if (this.b != null) {
            this.b.c();
        }
        super.onPause();
    }
    
    protected void onResume() {
        super.onResume();
        this.c = 2;
        if (this.b != null) {
            this.b.b();
        }
    }
    
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundle2;
        if (this.b != null) {
            bundle2 = this.b.e();
        }
        else {
            bundle2 = this.d;
        }
        bundle.putBundle("YouTubeBaseActivity.KEY_PLAYER_VIEW_STATE", bundle2);
    }
    
    protected void onStart() {
        super.onStart();
        this.c = 1;
        if (this.b != null) {
            this.b.a();
        }
    }
    
    protected void onStop() {
        this.c = 0;
        if (this.b != null) {
            this.b.d();
        }
        super.onStop();
    }
}
