// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.model;

@Deprecated
public class h
{
    public static WidgetViewModel a(final WidgetViewModel$ModelType widgetViewModel$ModelType) {
        switch (i.a[widgetViewModel$ModelType.ordinal()]) {
            default: {
                return null;
            }
            case 1: {
                return new c();
            }
            case 2: {
                return new d();
            }
            case 3: {
                return new f();
            }
            case 4: {
                return new a();
            }
            case 5: {
                return new b();
            }
            case 6: {
                return new e();
            }
        }
    }
}
