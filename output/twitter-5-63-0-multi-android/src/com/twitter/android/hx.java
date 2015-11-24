// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.View;
import android.support.v4.content.LocalBroadcastManager;
import android.content.IntentFilter;
import android.support.v4.app.Fragment;
import com.twitter.library.scribe.TwitterScribeLog;
import android.app.Activity;
import com.twitter.android.client.bn;
import android.widget.Button;
import java.text.NumberFormat;
import com.twitter.android.client.c;
import android.os.Parcelable;
import com.twitter.android.client.TwitterListFragment;
import android.os.Bundle;
import android.view.View$OnClickListener;
import com.twitter.android.client.TwitterFragmentActivity;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class hx extends BroadcastReceiver
{
    final /* synthetic */ FollowActivity a;
    
    private hx(final FollowActivity a) {
        this.a = a;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        final String action = intent.getAction();
        int n = 0;
        Label_0039: {
            switch (action.hashCode()) {
                case 338932095: {
                    if (action.equals("registration_success_broadcast")) {
                        n = 0;
                        break Label_0039;
                    }
                    break;
                }
                case 180360391: {
                    if (action.equals("upload_success_broadcast")) {
                        n = 1;
                        break Label_0039;
                    }
                    break;
                }
            }
            n = -1;
        }
        switch (n) {
            default: {}
            case 0: {
                this.a.f.B();
            }
            case 1: {
                this.a.G().b(false);
                this.a.f.b(intent.getIntExtra("page", -1), intent.getIntExtra("pages", -1), intent.getBooleanExtra("lookup_complete", false));
            }
        }
    }
}
