// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.cq;
import android.text.Editable;
import android.widget.TextView;
import android.text.TextWatcher;

class aaz implements TextWatcher
{
    final TextView a;
    private int b;
    final VideoPreviewActivity c;
    
    aaz(final VideoPreviewActivity c, final TextView a) {
        this.c = c;
        this.a = a;
    }
    
    public void afterTextChanged(final Editable editable) {
        final boolean i = App.I;
        final String string = editable.toString();
        cq.a(editable, VideoPreviewActivity.f(this.c).getContext());
        final int codePointCount = string.codePointCount(0, string.length());
        Label_0082: {
            if (160 - codePointCount < 30) {
                this.a.setVisibility(0);
                this.a.setText((CharSequence)Integer.toString(160 - codePointCount));
                if (!i) {
                    break Label_0082;
                }
            }
            this.a.setVisibility(8);
        }
        if (codePointCount >= 160 && this.b == 0) {
            this.b = VideoPreviewActivity.f(this.c).getInputType();
            if (this.b == 0) {
                return;
            }
            VideoPreviewActivity.f(this.c).setInputType(0x80000 | this.b);
            VideoPreviewActivity.f(this.c).setText((CharSequence)string);
            VideoPreviewActivity.f(this.c).setSelection(string.length());
            if (!i) {
                return;
            }
        }
        if (this.b != 0) {
            VideoPreviewActivity.f(this.c).setInputType(this.b);
            this.b = 0;
        }
    }
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        alm.a((TextView)VideoPreviewActivity.f(this.c), charSequence);
    }
}
