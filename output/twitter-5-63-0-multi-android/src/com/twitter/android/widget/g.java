// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.android.util.AppRatingPromptHelper$AppRatingEvent;
import android.os.Handler;

class g implements j
{
    final /* synthetic */ f a;
    
    g(final f a) {
        this.a = a;
    }
    
    @Override
    public void a(final int n) {
        new Handler().postDelayed((Runnable)new h(this, n), 200L);
        AppRatingPromptHelper$AppRatingEvent appRatingPromptHelper$AppRatingEvent = null;
        switch (n) {
            default: {
                appRatingPromptHelper$AppRatingEvent = null;
                break;
            }
            case 1: {
                appRatingPromptHelper$AppRatingEvent = AppRatingPromptHelper$AppRatingEvent.f;
                break;
            }
            case 2: {
                appRatingPromptHelper$AppRatingEvent = AppRatingPromptHelper$AppRatingEvent.g;
                break;
            }
            case 3: {
                appRatingPromptHelper$AppRatingEvent = AppRatingPromptHelper$AppRatingEvent.h;
                break;
            }
            case 4: {
                appRatingPromptHelper$AppRatingEvent = AppRatingPromptHelper$AppRatingEvent.i;
                break;
            }
            case 5: {
                appRatingPromptHelper$AppRatingEvent = AppRatingPromptHelper$AppRatingEvent.j;
                break;
            }
        }
        if (appRatingPromptHelper$AppRatingEvent != null) {
            this.a.a(appRatingPromptHelper$AppRatingEvent);
        }
    }
}
