// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Message;
import java.lang.ref.WeakReference;
import android.os.Handler;

class or extends Handler
{
    private final WeakReference a;
    
    public or(final ProfileActivity profileActivity) {
        this.a = new WeakReference((T)profileActivity);
    }
    
    public void handleMessage(final Message message) {
        final ProfileActivity profileActivity = (ProfileActivity)this.a.get();
        if (profileActivity != null) {
            switch (message.what) {
                case 2: {
                    profileActivity.a(message.arg1, message.arg2);
                }
            }
        }
    }
}
