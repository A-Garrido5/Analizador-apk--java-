// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import android.util.AttributeSet;
import android.content.Context;
import android.view.animation.Animation;
import android.widget.ProgressBar;
import android.widget.FrameLayout;
import android.view.View;
import android.view.View$OnClickListener;

class h implements View$OnClickListener
{
    final /* synthetic */ CardPreviewView a;
    
    h(final CardPreviewView a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (this.a.a != null) {
            this.a.a.a();
        }
    }
}
