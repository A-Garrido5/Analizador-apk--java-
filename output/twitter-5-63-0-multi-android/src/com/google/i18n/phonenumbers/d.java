// 
// Decompiled by Procyon v0.5.30
// 

package com.google.i18n.phonenumbers;

import java.io.InputStream;

final class d implements c
{
    @Override
    public InputStream a(final String s) {
        return PhoneNumberUtil.class.getResourceAsStream(s);
    }
}
