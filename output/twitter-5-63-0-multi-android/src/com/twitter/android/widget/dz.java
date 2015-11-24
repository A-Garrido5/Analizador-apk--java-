// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.graphics.Canvas;
import android.text.method.MovementMethod;
import android.text.TextWatcher;
import com.twitter.ui.widget.ag;
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import android.widget.EditText;
import android.text.Editable;
import com.twitter.library.util.h;

class dz extends h
{
    final /* synthetic */ PinEntryEditText a;
    
    dz(final PinEntryEditText a) {
        this.a = a;
    }
    
    @Override
    public void afterTextChanged(final Editable editable) {
        if (editable.length() == 6 && this.a.h != null) {
            this.a.h.a(this.a.getText().toString());
        }
    }
}
