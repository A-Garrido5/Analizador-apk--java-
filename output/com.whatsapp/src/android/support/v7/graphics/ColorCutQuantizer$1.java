// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.graphics;

import java.util.Comparator;

final class ColorCutQuantizer$1 implements Comparator
{
    public int compare(final ColorCutQuantizer$Vbox colorCutQuantizer$Vbox, final ColorCutQuantizer$Vbox colorCutQuantizer$Vbox2) {
        return colorCutQuantizer$Vbox2.getVolume() - colorCutQuantizer$Vbox.getVolume();
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.compare((ColorCutQuantizer$Vbox)o, (ColorCutQuantizer$Vbox)o2);
    }
}
