// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.client.bn;
import android.os.Bundle;
import android.widget.Button;

public class EditProfileCropActivity extends CropActivity
{
    private Button f;
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        final bn a = super.a(bundle, bn);
        a.c(2130968708);
        return a;
    }
    
    @Override
    public void a(final boolean b) {
        super.a(b);
        if (b) {
            this.f.setEnabled(true);
            this.d.setCropAspectRatio(3.0f);
        }
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        super.b(bundle, bn);
        (this.f = (Button)this.findViewById(2131886624)).setEnabled(this.c.a());
    }
}
