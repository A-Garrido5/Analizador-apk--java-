// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import com.whatsapp.alm;
import com.whatsapp.util.cq;
import android.text.Editable;
import android.widget.TextView;
import android.text.TextWatcher;

class r implements TextWatcher
{
    final CameraActivity a;
    final TextView b;
    private int c;
    
    r(final CameraActivity a, final TextView b) {
        this.a = a;
        this.b = b;
    }
    
    public void afterTextChanged(final Editable editable) {
        final boolean m = CameraActivity.m;
        final String string = editable.toString();
        cq.a(editable, CameraActivity.i(this.a).getContext());
        final int codePointCount = string.codePointCount(0, string.length());
        Label_0082: {
            if (160 - codePointCount < 30) {
                this.b.setVisibility(0);
                this.b.setText((CharSequence)Integer.toString(160 - codePointCount));
                if (!m) {
                    break Label_0082;
                }
            }
            this.b.setVisibility(8);
        }
        if (codePointCount >= 160 && this.c == 0) {
            this.c = CameraActivity.i(this.a).getInputType();
            if (this.c == 0) {
                return;
            }
            CameraActivity.i(this.a).setInputType(0x80000 | this.c);
            CameraActivity.i(this.a).setText((CharSequence)string);
            CameraActivity.i(this.a).setSelection(string.length());
            if (!m) {
                return;
            }
        }
        if (this.c != 0) {
            CameraActivity.i(this.a).setInputType(this.c);
            this.c = 0;
        }
    }
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        alm.a((TextView)CameraActivity.i(this.a), charSequence);
    }
}
