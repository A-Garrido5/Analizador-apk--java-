// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card;

import com.twitter.library.card.property.ImageSpec;
import com.twitter.library.card.element.Image;
import java.util.ArrayList;
import com.twitter.library.card.element.Element;
import com.twitter.library.card.element.d;

class b extends d
{
    final /* synthetic */ Element a;
    final /* synthetic */ int[] b;
    final /* synthetic */ ArrayList c;
    final /* synthetic */ Card d;
    
    b(final Card d, final Element a, final int[] b, final ArrayList c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void a(final Element element) {
        if (element.F() && element instanceof Image) {
            final Image image = (Image)element;
            if (element.D()) {
                ImageSpec imageSpec;
                if (image.specFullSize != null) {
                    imageSpec = image.specFullSize;
                }
                else {
                    imageSpec = image.spec;
                }
                if (imageSpec != null) {
                    if (element == this.a) {
                        this.b[0] = this.c.size();
                    }
                    this.c.add(imageSpec);
                }
            }
        }
    }
}
