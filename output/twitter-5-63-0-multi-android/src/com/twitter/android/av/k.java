// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import com.twitter.library.av.model.Partner;
import android.view.View;
import android.content.res.Configuration;
import com.twitter.library.av.playback.AVPlayer;
import com.twitter.library.av.l;
import com.twitter.library.av.control.b;
import com.twitter.android.widget.bw;
import android.view.View$OnClickListener;

public interface k extends View$OnClickListener, bw, b, l
{
    void a(final AVPlayer p0, final Configuration p1);
    
    View getContentView();
    
    void setOnDockListener(final com.twitter.android.av.l p0);
    
    void setPartner(final Partner p0);
}
