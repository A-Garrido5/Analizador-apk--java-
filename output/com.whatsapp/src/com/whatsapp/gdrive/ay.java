// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import android.view.View;
import android.widget.TextView;

class ay implements Runnable
{
    final String a;
    final GoogleDriveActivity b;
    
    ay(final GoogleDriveActivity b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        final TextView textView = (TextView)this.b.findViewById(2131755179);
        final View viewById = this.b.findViewById(2131755178);
        if (!this.b.isFinishing()) {
            textView.setText((CharSequence)this.a);
            viewById.setVisibility(8);
        }
    }
}
