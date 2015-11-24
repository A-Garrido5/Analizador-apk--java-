// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import com.whatsapp.App;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ae extends GregorianCalendar
{
    public int a;
    public int b;
    
    public ae(final int a, final Calendar calendar) {
        this.a = a;
        this.setTime(calendar.getTime());
    }
    
    public ae(final ae ae) {
        this.a = ae.a;
        this.b = ae.b;
        this.setTime(ae.getTime());
    }
    
    @Override
    public String toString() {
        switch (this.a) {
            default: {
                return Integer.toString(this.get(1));
            }
            case 1: {
                return App.aq.getString(2131231512);
            }
            case 2: {
                return App.aq.getString(2131231964);
            }
            case 3: {
                return App.aq.getString(2131231337);
            }
            case 4: {
                return ac.a().format(this.getTime());
            }
        }
    }
}
