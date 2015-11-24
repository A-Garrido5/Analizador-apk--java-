// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.element;

import android.view.View;
import java.io.ObjectOutput;
import java.io.ObjectInput;
import android.view.ViewGroup;
import com.twitter.library.card.Card;
import com.twitter.library.media.manager.ao;
import com.twitter.library.media.manager.h;
import com.twitter.library.card.CardView;
import android.content.Context;
import android.graphics.PointF;
import java.util.Iterator;
import com.twitter.library.card.property.Border;
import com.twitter.library.card.property.Vector2F;
import com.twitter.library.card.property.Spacing;
import java.util.ArrayList;
import com.twitter.library.card.property.Vector2;
import java.io.Externalizable;

public class Container extends Box implements Externalizable
{
    private static final long serialVersionUID = 2357534849452014336L;
    public Vector2 alignmentMode;
    public ArrayList children;
    public int layoutMode;
    public int overflowMode;
    public Spacing padding;
    public int visibleChildIndex;
    
    public Container() {
        this.children = new ArrayList();
        this.visibleChildIndex = -1;
    }
    
    private float a(final float n) {
        final Border border = this.mComputedStyle.border;
        final Spacing padding = this.mComputedStyle.padding;
        final float width = border.width;
        final Vector2F vector2F = new Vector2F(padding.start);
        vector2F.a(width);
        final Vector2F vector2F2 = new Vector2F(padding.end);
        vector2F2.a(width);
        final Vector2F vector2F3 = new Vector2F(vector2F);
        final Iterator<Element> iterator = (Iterator<Element>)this.children.iterator();
        float n2 = 0.0f;
        while (iterator.hasNext()) {
            final Element element = iterator.next();
            float max;
            if (element.G()) {
                final Spacing margin = element.mComputedStyle.margin;
                final float a = this.a(element, Vector2F.a);
                final float b = this.b(element, Vector2F.a);
                if (n - vector2F.x - vector2F2.x - vector2F3.x < a + margin.start.x + margin.end.x) {
                    vector2F3.x = 0.0f;
                    vector2F3.y += n2;
                    n2 = 0.0f;
                }
                max = Math.max(n2, b + margin.start.y + margin.end.y);
                vector2F3.x += a + margin.start.x + margin.end.x;
            }
            else {
                max = n2;
            }
            n2 = max;
        }
        return n2 + vector2F3.y + vector2F2.y;
    }
    
    private float a(final int n, final int n2, final Vector2F vector2F) {
        final Border border = this.mComputedStyle.border;
        final Spacing padding = this.mComputedStyle.padding;
        final int n3 = n2 ^ 0x1;
        final float a = vector2F.a(n ^ 0x1);
        final float width = border.width;
        final Vector2F vector2F2 = new Vector2F(padding.start);
        vector2F2.a(width);
        final Vector2F vector2F3 = new Vector2F(padding.end);
        vector2F3.a(width);
        float n6;
        if (n == n2) {
            final float n4 = vector2F2.a(n2) + vector2F3.a(n2);
            final float n5 = a - (vector2F2.a(n3) + vector2F3.a(n3));
            final Iterator<Element> iterator = (Iterator<Element>)this.children.iterator();
            n6 = n4;
            while (iterator.hasNext()) {
                final Element element = iterator.next();
                float n7;
                if (element.G()) {
                    final Spacing margin = element.mComputedStyle.margin;
                    n7 = n6 + (this.a(element, n, n2, 0.0f, n5 - margin.start.a(n3) - margin.end.a(n3)) + margin.start.a(n2) + margin.end.a(n2));
                }
                else {
                    n7 = n6;
                }
                n6 = n7;
            }
        }
        else {
            final Iterator<Element> iterator2 = (Iterator<Element>)this.children.iterator();
            float n8 = 0.0f;
            float n9 = 0.0f;
            while (iterator2.hasNext()) {
                final Element element2 = iterator2.next();
                float n11;
                float n12;
                if (element2.G()) {
                    final Spacing margin2 = element2.mComputedStyle.margin;
                    final int a2 = element2.sizeMode.a(n2);
                    final float n10 = n8 + (margin2.start.a(n2) + margin2.end.a(n2));
                    if (a2 == 2) {
                        float a3 = element2.mComputedStyle.a(n2);
                        if (a3 <= 0.0f) {
                            a3 = 1.0f;
                        }
                        n11 = n9 + a3;
                        n12 = n10;
                    }
                    else {
                        final float n13 = n10 + element2.b(n2, vector2F);
                        n11 = n9;
                        n12 = n13;
                    }
                }
                else {
                    n11 = n9;
                    n12 = n8;
                }
                n8 = n12;
                n9 = n11;
            }
            final float max = Math.max(0.0f, a - n8 - vector2F2.a(n2) - vector2F3.a(n2));
            float n14 = 0.0f;
            float n15;
            if (n9 == 0.0f) {
                n15 = 1.0f;
            }
            else {
                final float n16 = 1.0f / n9;
                final Iterator<Element> iterator3 = (Iterator<Element>)this.children.iterator();
                float n17 = 0.0f;
                while (iterator3.hasNext()) {
                    final Element element3 = iterator3.next();
                    float n19;
                    if (element3.G() && element3.sizeMode.a(n2) == 2) {
                        final float a4 = element3.mComputedStyle.a(n2);
                        double n18;
                        if (a4 > 0.0f) {
                            n18 = a4;
                        }
                        else {
                            n18 = 1.0;
                        }
                        n19 = n17 + (float)Math.floor(n18 * n16 * max);
                    }
                    else {
                        n19 = n17;
                    }
                    n17 = n19;
                }
                n15 = n16;
                n14 = n17;
            }
            float n20 = max - n14;
            final Iterator<Element> iterator4 = (Iterator<Element>)this.children.iterator();
            float n21 = 0.0f;
            while (iterator4.hasNext()) {
                final Element element4 = iterator4.next();
                float max2;
                if (element4.G()) {
                    float a5 = element4.mComputedStyle.a(n2);
                    if (a5 <= 0.0f) {
                        a5 = 1.0f;
                    }
                    float n22 = n15 * (a5 * max);
                    float n23;
                    if (n20 >= 1.0f) {
                        n22 = (float)Math.ceil(n22);
                        n23 = n20 - 1.0f;
                    }
                    else {
                        n23 = n20;
                    }
                    final float a6 = this.a(element4, n3, n2, n22, 0.0f);
                    final Spacing margin3 = element4.mComputedStyle.margin;
                    max2 = Math.max(n21, a6 + vector2F2.a(n3) + vector2F3.a(n3) + margin3.start.a(n3) + margin3.end.a(n3));
                    n20 = n23;
                }
                else {
                    max2 = n21;
                }
                n21 = max2;
            }
            n6 = n21;
        }
        return n6;
    }
    
    private float a(final Element element, final int n, final int n2, final float n3, float n4) {
        float n5;
        if (n2 == 0) {
            n5 = n3;
        }
        else {
            n5 = n4;
        }
        if (n2 != 0) {
            n4 = n3;
        }
        final Vector2F vector2F = new Vector2F(n5, n4);
        if (n == 0) {
            return this.a(element, vector2F);
        }
        return this.b(element, vector2F);
    }
    
    private float a(final Element element, final Vector2F vector2F) {
        final int t = element.t();
        float n;
        if (element.sizeMode.x == 2) {
            n = vector2F.x;
        }
        else if (t == 2) {
            float n2;
            if (element.sizeMode.y == 2) {
                n2 = vector2F.y;
            }
            else {
                n2 = element.b(1, vector2F);
            }
            n = element.b(0, new Vector2F(0.0f, this.c(element, n2, vector2F.y)));
        }
        else if (t == 4) {
            final float b = element.b(0, vector2F);
            final float b2 = element.b(1, vector2F);
            n = this.a(this.b(element, b, vector2F.x), this.c(element, b2, vector2F.y), b, b2).x;
        }
        else {
            n = element.b(0, vector2F);
        }
        return this.b(element, n, vector2F.x);
    }
    
    private int a() {
        final Iterator<Element> iterator = (Iterator<Element>)this.children.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            int n2;
            if (iterator.next().G()) {
                n2 = n + 1;
            }
            else {
                n2 = n;
            }
            n = n2;
        }
        return n;
    }
    
    private PointF a(final float n, final float n2, final float n3, final float n4) {
        final PointF pointF = new PointF(n, n2);
        if (n != n3 || n2 != n4) {
            final float n5 = n3 / n4;
            if (n5 <= n / n2) {
                pointF.x = (float)Math.floor(n5 * n2);
                pointF.y = (float)Math.floor(n2);
                return pointF;
            }
            pointF.x = (float)Math.floor(n);
            pointF.y = (float)Math.floor(n / n5);
        }
        return pointF;
    }
    
    private void a(final float n, final float n2, final int n3) {
        final Border border = this.mComputedStyle.border;
        final Spacing padding = this.mComputedStyle.padding;
        final Vector2F vector2F = new Vector2F(n, n2);
        final int n4 = n3 ^ 0x1;
        final float width = border.width;
        final Vector2F vector2F2 = new Vector2F(padding.start);
        vector2F2.a(width);
        final Vector2F vector2F3 = new Vector2F(padding.end);
        vector2F3.a(width);
        if (this.a() > 0) {
            final float n5 = vector2F.a(n4) - vector2F2.a(n4) - vector2F3.a(n4);
            final Iterator<Element> iterator = (Iterator<Element>)this.children.iterator();
            float n6 = 0.0f;
            int n7 = 0;
            float n8 = 0.0f;
            while (iterator.hasNext()) {
                final Element element = iterator.next();
                final Spacing margin = element.mComputedStyle.margin;
                float n9;
                float n10;
                int n11;
                if (element.G()) {
                    if (element.sizeMode.a(n3) != 2) {
                        n9 = n8 + (this.a(element, n3, n3, 0.0f, n5 - (margin.start.a(n4) + margin.end.a(n4))) + margin.start.a(n3) + margin.end.a(n3));
                        n10 = n6;
                        n11 = n7;
                    }
                    else {
                        n9 = n8 + (margin.start.a(n3) + margin.end.a(n3));
                        final int n12 = n7 + 1;
                        float a = element.mComputedStyle.a(n3);
                        if (a <= 0.0f) {
                            a = 1.0f;
                        }
                        n10 = n6 + a;
                        n11 = n12;
                    }
                }
                else {
                    n10 = n6;
                    n11 = n7;
                    n9 = n8;
                }
                n6 = n10;
                n7 = n11;
                n8 = n9;
            }
            float n20;
            float n21;
            if (n7 > 0) {
                final float n13 = vector2F.a(n3) - n8 - vector2F2.a(n3) - vector2F3.a(n3);
                final float n14 = 1.0f / n6;
                final Iterator<Element> iterator2 = (Iterator<Element>)this.children.iterator();
                float n15 = 0.0f;
                while (iterator2.hasNext()) {
                    final Element element2 = iterator2.next();
                    float n17;
                    if (element2.G() && element2.sizeMode.y == 2) {
                        float a2 = element2.mComputedStyle.a(n3);
                        final double n16 = n15;
                        if (a2 <= 0.0f) {
                            a2 = 1.0f;
                        }
                        n17 = (float)(n16 + Math.floor(n13 * (a2 * n14)));
                    }
                    else {
                        n17 = n15;
                    }
                    n15 = n17;
                }
                final float n18 = n13 - n15;
                final float n19 = n13 * n14;
                n20 = n18;
                n21 = n19;
            }
            else {
                n20 = 0.0f;
                n21 = 0.0f;
            }
            final float a3 = vector2F2.a(n3);
            while (true) {
                Label_1248: {
                    if (n7 != 0) {
                        break Label_1248;
                    }
                    final int a4 = this.alignmentMode.a(n3);
                    if (a4 != 3 && a4 != 2) {
                        break Label_1248;
                    }
                    final Iterator<Element> iterator3 = (Iterator<Element>)this.children.iterator();
                    float n22 = 0.0f;
                    while (iterator3.hasNext()) {
                        final Element element3 = iterator3.next();
                        float n23;
                        if (element3.G()) {
                            final Spacing margin2 = element3.mComputedStyle.margin;
                            n23 = n22 + (this.a(element3, n3, n3, 0.0f, n5 - (margin2.start.a(n4) + margin2.end.a(n4))) + margin2.start.a(n3) + margin2.end.a(n3));
                        }
                        else {
                            n23 = n22;
                        }
                        n22 = n23;
                    }
                    float max;
                    if (a4 == 3) {
                        max = vector2F.a(n3) - n22 - vector2F3.a(n3);
                    }
                    else {
                        if (a4 != 2) {
                            break Label_1248;
                        }
                        max = Math.max(0.0f, (float)Math.floor(0.5f * (vector2F.a(n3) - n22)));
                    }
                    final Iterator<Element> iterator4 = (Iterator<Element>)this.children.iterator();
                    final float n24 = max;
                    float n25 = n20;
                    float n26 = n24;
                    while (iterator4.hasNext()) {
                        final Element element4 = iterator4.next();
                        float n30;
                        float n31;
                        if (element4.G()) {
                            final Spacing margin3 = element4.mComputedStyle.margin;
                            final Vector2F vector2F4 = new Vector2F();
                            final Vector2F vector2F5 = new Vector2F();
                            float a5 = element4.mComputedStyle.a(n3);
                            if (a5 <= 0.0f) {
                                a5 = 1.0f;
                            }
                            float n27 = n21 * a5;
                            float n28;
                            if (n25 >= 1.0f) {
                                n27 = (float)Math.ceil(n27);
                                n28 = n25 - 1.0f;
                            }
                            else {
                                n28 = n25;
                            }
                            final float n29 = n5 - margin3.start.a(n4) - margin3.end.a(n4);
                            final float a6 = this.a(element4, n4, n3, n27, n29);
                            vector2F4.a(n4, a6);
                            if (element4.sizeMode.a(n4) == 2) {
                                vector2F5.a(n4, vector2F2.a(n4) + margin3.start.a(n4));
                                vector2F4.a(n4, a6);
                            }
                            else {
                                final int a7 = this.alignmentMode.a(n4);
                                if (a7 == 1) {
                                    vector2F5.a(n4, vector2F2.a(n4) + margin3.start.a(n4));
                                }
                                else if (a7 == 2) {
                                    vector2F5.a(n4, Math.max(margin3.start.a(n4), (float)Math.floor(0.5f * (margin3.start.a(n4) - margin3.end.a(n4) + (vector2F.a(n4) - a6)))));
                                }
                                else if (a7 == 3) {
                                    vector2F5.a(n4, vector2F.a(n4) - (a6 + margin3.start.a(n4) + margin3.end.a(n4)) - vector2F3.a(n4));
                                }
                                vector2F4.a(n4, a6);
                            }
                            final float a8 = this.a(element4, n3, n3, n27, n29);
                            vector2F5.a(n3, n26 + margin3.start.a(n3));
                            vector2F4.a(n3, a8);
                            element4.a(vector2F5, vector2F4);
                            n30 = n26 + (vector2F4.a(n3) + margin3.start.a(n3) + margin3.end.a(n3));
                            n31 = n28;
                        }
                        else {
                            final float n32 = n26;
                            n31 = n25;
                            n30 = n32;
                        }
                        final float n33 = n30;
                        n25 = n31;
                        n26 = n33;
                    }
                    return;
                }
                float max = a3;
                continue;
            }
        }
    }
    
    private void a(final Element element, final float n, final float n2) {
        final float width = this.mComputedStyle.border.width;
        final Spacing margin = element.mComputedStyle.margin;
        float floatValue = element.mComputedStyle.positionX;
        float floatValue2 = element.mComputedStyle.positionY;
        final Vector2F vector2F = new Vector2F(margin.start);
        vector2F.a(width);
        final Vector2F vector2F2 = new Vector2F(margin.end);
        vector2F2.a(width);
        final Vector2F vector2F3 = new Vector2F(n, n2);
        vector2F3.a(vector2F);
        vector2F3.a(vector2F2);
        float a = this.a(element, vector2F3);
        if (element.sizeMode.x == 2) {
            floatValue += vector2F.x;
            a = n - floatValue - vector2F2.x;
        }
        float b = this.b(element, vector2F3);
        if (element.sizeMode.y == 2) {
            floatValue2 += vector2F.y;
            b = n2 - floatValue2 - vector2F2.y;
        }
        element.a(new Vector2F(floatValue, floatValue2), new Vector2F(a, b));
    }
    
    private float b(final Element element, final float n, final float n2) {
        if (element.maxSizeMode.x != 5) {
            float floatValue = element.mComputedStyle.maxSizeX;
            if (element.maxSizeMode.x == 2) {
                if (floatValue <= 0.0f) {
                    floatValue = 1.0f;
                }
                floatValue *= n2;
            }
            else if (element.maxSizeMode.x == 3) {
                floatValue = n;
            }
            if (n > floatValue) {
                return (float)Math.floor(floatValue);
            }
        }
        return (float)Math.floor(n);
    }
    
    private float b(final Element element, final Vector2F vector2F) {
        final int t = element.t();
        float n;
        if (element.sizeMode.y == 2) {
            n = vector2F.y;
        }
        else if (t == 3) {
            float n2;
            if (element.sizeMode.x == 2) {
                n2 = vector2F.x;
            }
            else {
                n2 = element.b(0, vector2F);
            }
            n = element.b(1, new Vector2F(this.b(element, n2, vector2F.x), 0.0f));
        }
        else if (t == 4) {
            final float b = element.b(0, vector2F);
            final float b2 = element.b(1, vector2F);
            n = this.a(this.b(element, b, vector2F.x), this.c(element, b2, vector2F.y), b, b2).y;
        }
        else {
            n = element.b(1, vector2F);
        }
        return this.c(element, n, vector2F.y);
    }
    
    private void b(final float n) {
        final Border border = this.mComputedStyle.border;
        final Spacing padding = this.mComputedStyle.padding;
        final float width = border.width;
        final Vector2F vector2F = new Vector2F(padding.start);
        vector2F.a(width);
        final Vector2F vector2F2 = new Vector2F(padding.end);
        vector2F2.a(width);
        final Vector2F vector2F3 = new Vector2F(vector2F);
        final Iterator<Element> iterator = this.children.iterator();
        float max = 0.0f;
        while (iterator.hasNext()) {
            final Element element = iterator.next();
            if (element.G()) {
                final Spacing margin = element.mComputedStyle.margin;
                final Vector2F vector2F4 = new Vector2F(this.a(element, Vector2F.a), this.b(element, Vector2F.a));
                if (n - vector2F.x - vector2F2.x - vector2F3.x < vector2F4.x + margin.start.x + margin.end.x) {
                    vector2F3.x = 0.0f;
                    vector2F3.y += max;
                    max = 0.0f;
                }
                max = Math.max(max, vector2F4.y + margin.start.y + margin.end.y);
                vector2F3.x += margin.start.x;
                element.a(vector2F3, vector2F4);
                vector2F3.x += vector2F4.x + margin.end.x;
            }
        }
    }
    
    private float c(final Element element, final float n, final float n2) {
        if (element.maxSizeMode.y != 5) {
            float floatValue = element.mComputedStyle.maxSizeY;
            if (element.maxSizeMode.y == 2) {
                if (floatValue <= 0.0f) {
                    floatValue = 1.0f;
                }
                floatValue *= n2;
            }
            else if (element.maxSizeMode.y == 3) {
                floatValue = n;
            }
            if (n > floatValue) {
                return (float)Math.floor(floatValue);
            }
        }
        return (float)Math.floor(n);
    }
    
    @Override
    protected float a(final int n, final Vector2F vector2F) {
        switch (this.layoutMode) {
            case 1: {
                return this.a(n, 0, vector2F);
            }
            case 2: {
                return this.a(n, 1, vector2F);
            }
            case 3: {
                if (n == 1) {
                    return this.a(vector2F.x);
                }
                break;
            }
        }
        return super.a(n, vector2F);
    }
    
    @Override
    public void a(final Context context) {
        this.mView = (View)new ContainerElementView(context, this);
        this.d(context);
    }
    
    @Override
    protected void a(final CardView cardView) {
        super.a(cardView);
        final Iterator<Element> iterator = this.children.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(cardView);
        }
    }
    
    public void a(final Element element) {
        if (element == this) {
            return;
        }
        element.mParent = this;
        this.children.add(element);
    }
    
    @Override
    public void a(final d d) {
        super.a(d);
        d.a();
        final Iterator<Element> iterator = this.children.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(d);
        }
        d.b();
    }
    
    @Override
    public void a(final Vector2F vector2F, final Vector2F vector2F2) {
        super.a(vector2F, vector2F2);
        for (final Element element : this.children) {
            if (element.H()) {
                this.a(element, vector2F2.x, vector2F2.y);
            }
        }
        switch (this.layoutMode) {
            default: {}
            case 1: {
                this.a(vector2F2.x, vector2F2.y, 0);
            }
            case 2: {
                this.a(vector2F2.x, vector2F2.y, 1);
            }
            case 3: {
                this.b(vector2F2.x);
            }
        }
    }
    
    @Override
    public void a(final h h, final ao ao) {
        super.a(h, ao);
        final Iterator<Element> iterator = this.children.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(h, ao);
        }
    }
    
    @Override
    public void a(final int[] array) {
        super.a(array);
        final Iterator<Element> iterator = this.children.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(array);
        }
    }
    
    @Override
    protected void a_(final Card card) {
        super.a_(card);
        final Iterator<Element> iterator = this.children.iterator();
        while (iterator.hasNext()) {
            iterator.next().a_(card);
        }
    }
    
    @Override
    protected void b(final Context context) {
        super.b(context);
        final Iterator<Element> iterator = this.children.iterator();
        while (iterator.hasNext()) {
            iterator.next().b(context);
        }
    }
    
    public void b(final boolean b) {
        super.b(b);
        final Iterator<Element> iterator = this.children.iterator();
        while (iterator.hasNext()) {
            iterator.next().b(b);
        }
    }
    
    @Override
    public void c(final Context context) {
        super.c(context);
        final Iterator<Element> iterator = this.children.iterator();
        while (iterator.hasNext()) {
            iterator.next().c(context);
        }
    }
    
    @Override
    protected void d() {
        super.d();
        final Iterator<Element> iterator = this.children.iterator();
        while (iterator.hasNext()) {
            iterator.next().d();
        }
    }
    
    protected void d(final Context context) {
        for (final Element element : this.children) {
            element.a(context);
            ((ViewGroup)this.mView).addView(element.z());
        }
    }
    
    @Override
    public void d(final boolean b) {
        super.d(b);
        final Iterator<Element> iterator = this.children.iterator();
        while (iterator.hasNext()) {
            iterator.next().d(b);
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof Container)) {
                return false;
            }
            if (!super.equals(o)) {
                return false;
            }
            final Container container = (Container)o;
            if (Float.compare(container.cornerRadius, this.cornerRadius) != 0) {
                return false;
            }
            if (this.layoutMode != container.layoutMode) {
                return false;
            }
            if (this.overflowMode != container.overflowMode) {
                return false;
            }
            if (this.visibleChildIndex != container.visibleChildIndex) {
                return false;
            }
            Label_0116: {
                if (this.alignmentMode != null) {
                    if (this.alignmentMode.equals(container.alignmentMode)) {
                        break Label_0116;
                    }
                }
                else if (container.alignmentMode == null) {
                    break Label_0116;
                }
                return false;
            }
            Label_0146: {
                if (this.background != null) {
                    if (this.background.equals(container.background)) {
                        break Label_0146;
                    }
                }
                else if (container.background == null) {
                    break Label_0146;
                }
                return false;
            }
            Label_0176: {
                if (this.border != null) {
                    if (this.border.equals(container.border)) {
                        break Label_0176;
                    }
                }
                else if (container.border == null) {
                    break Label_0176;
                }
                return false;
            }
            Label_0206: {
                if (this.children != null) {
                    if (this.children.equals(container.children)) {
                        break Label_0206;
                    }
                }
                else if (container.children == null) {
                    break Label_0206;
                }
                return false;
            }
            if (this.padding != null) {
                if (this.padding.equals(container.padding)) {
                    return true;
                }
            }
            else if (container.padding == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public void f() {
        super.f();
        final Iterator<Element> iterator = this.children.iterator();
        while (iterator.hasNext()) {
            iterator.next().f();
        }
    }
    
    @Override
    public void g() {
        super.g();
        final Iterator<Element> iterator = this.children.iterator();
        while (iterator.hasNext()) {
            iterator.next().g();
        }
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * (31 * super.hashCode() + this.layoutMode);
        int hashCode;
        if (this.background != null) {
            hashCode = this.background.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n2 = 31 * (hashCode + n);
        int hashCode2;
        if (this.border != null) {
            hashCode2 = this.border.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int n3 = 31 * (hashCode2 + n2);
        int hashCode3;
        if (this.alignmentMode != null) {
            hashCode3 = this.alignmentMode.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final int n4 = 31 * (hashCode3 + n3);
        int hashCode4;
        if (this.padding != null) {
            hashCode4 = this.padding.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final int n5 = 31 * (31 * (hashCode4 + n4) + this.overflowMode);
        int floatToIntBits;
        if (this.cornerRadius != 0.0f) {
            floatToIntBits = Float.floatToIntBits(this.cornerRadius);
        }
        else {
            floatToIntBits = 0;
        }
        final int n6 = 31 * (floatToIntBits + n5);
        final ArrayList children = this.children;
        int hashCode5 = 0;
        if (children != null) {
            hashCode5 = this.children.hashCode();
        }
        return 31 * (n6 + hashCode5) + this.visibleChildIndex;
    }
    
    @Override
    protected void q() {
        super.q();
        this.mComputedStyle.padding = this.padding;
        this.mComputedStyle.visibleChildIndex = this.visibleChildIndex;
    }
    
    @Override
    public void r() {
        super.r();
        final Iterator<Element> iterator = this.children.iterator();
        while (iterator.hasNext()) {
            iterator.next().r();
        }
        final int intValue = this.mComputedStyle.visibleChildIndex;
        if (intValue == -1) {
            final Iterator<Element> iterator2 = this.children.iterator();
            while (iterator2.hasNext()) {
                iterator2.next().g(true);
            }
        }
        else {
            final Iterator<Element> iterator3 = this.children.iterator();
            int n = 0;
            while (iterator3.hasNext()) {
                iterator3.next().g(n == intValue);
                ++n;
            }
        }
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        super.readExternal(objectInput);
        this.layoutMode = objectInput.readInt();
        this.alignmentMode = (Vector2)objectInput.readObject();
        this.overflowMode = objectInput.readInt();
        this.padding = (Spacing)objectInput.readObject();
        final int int1 = objectInput.readInt();
        if (int1 > 0) {
            for (int i = 0; i < int1; ++i) {
                this.a((Element)objectInput.readObject());
            }
        }
        this.visibleChildIndex = objectInput.readInt();
    }
    
    @Override
    protected void s() {
        super.s();
        final Iterator<Element> iterator = this.children.iterator();
        while (iterator.hasNext()) {
            iterator.next().s();
        }
    }
    
    @Override
    protected int t() {
        int n = 3;
        if (this.sizeMode.y == 1 && this.sizeMode.x == n) {
            if (this.maxSizeMode.x != 5 && this.maxSizeMode.y != 5) {
                n = 4;
            }
            else if (this.maxSizeMode.x == 5) {
                if (this.maxSizeMode.y != 5) {
                    return 2;
                }
                return 1;
            }
            return n;
        }
        return super.t();
    }
    
    @Override
    public void u() {
        super.u();
        final Iterator<Element> iterator = this.children.iterator();
        while (iterator.hasNext()) {
            iterator.next().u();
        }
    }
    
    @Override
    public void v() {
        final Iterator<Element> iterator = this.children.iterator();
        while (iterator.hasNext()) {
            iterator.next().v();
        }
        super.v();
    }
    
    @Override
    public void w() {
        super.w();
        final Iterator<Element> iterator = this.children.iterator();
        while (iterator.hasNext()) {
            iterator.next().w();
        }
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        super.writeExternal(objectOutput);
        objectOutput.writeInt(this.layoutMode);
        objectOutput.writeObject(this.alignmentMode);
        objectOutput.writeInt(this.overflowMode);
        objectOutput.writeObject(this.padding);
        objectOutput.writeInt(this.children.size());
        final Iterator<Element> iterator = this.children.iterator();
        while (iterator.hasNext()) {
            objectOutput.writeObject(iterator.next());
        }
        objectOutput.writeInt(this.visibleChildIndex);
    }
}
