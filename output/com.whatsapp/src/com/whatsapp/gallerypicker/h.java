// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import com.whatsapp.alm;
import android.text.TextUtils;
import com.whatsapp.util.cq;
import android.text.Editable;
import android.widget.TextView;
import com.whatsapp.ConversationTextEntry;
import android.net.Uri;
import android.text.TextWatcher;

class h implements TextWatcher
{
    final a5 a;
    final Uri b;
    final ConversationTextEntry c;
    final TextView d;
    private int e;
    
    h(final a5 a, final ConversationTextEntry c, final TextView d, final Uri b) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    public void afterTextChanged(final Editable editable) {
        final int v = MediaGalleryBase.v;
        final String string = editable.toString();
        cq.a(editable, this.c.getContext());
        final int codePointCount = string.codePointCount(0, string.length());
        Label_0079: {
            if (160 - codePointCount < 30) {
                this.d.setVisibility(0);
                this.d.setText((CharSequence)Integer.toString(160 - codePointCount));
                if (v == 0) {
                    break Label_0079;
                }
            }
            this.d.setVisibility(8);
        }
        Label_0172: {
            if (codePointCount >= 160 && this.e == 0) {
                this.e = this.c.getInputType();
                if (this.e == 0) {
                    break Label_0172;
                }
                this.c.setInputType(0x80000 | this.e);
                this.c.setText((CharSequence)string);
                this.c.setSelection(string.length());
                if (v == 0) {
                    break Label_0172;
                }
            }
            if (this.e != 0) {
                this.c.setInputType(this.e);
                this.e = 0;
            }
        }
        if (TextUtils.isEmpty((CharSequence)string)) {
            ImagePreview.e(this.a.a).remove(this.b);
            if (v == 0) {
                return;
            }
        }
        ImagePreview.e(this.a.a).put(this.b, string.toString());
    }
    
    public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        alm.a((TextView)this.c, charSequence);
    }
}
