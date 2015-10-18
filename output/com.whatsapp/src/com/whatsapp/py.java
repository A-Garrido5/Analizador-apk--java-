// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.Editable;
import android.text.Editable$Factory;

final class py extends Editable$Factory
{
    public Editable newEditable(final CharSequence charSequence) {
        return (Editable)new xa(charSequence);
    }
}
