// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.element;

import java.io.ObjectOutput;
import java.io.ObjectInput;
import com.twitter.library.util.bj;
import android.view.MotionEvent;
import com.twitter.library.media.manager.ao;
import com.twitter.library.media.manager.h;
import android.graphics.Canvas;
import android.os.Looper;
import java.util.Iterator;
import com.twitter.library.card.property.Vector2;
import com.twitter.library.card.property.Spacing;
import android.view.View;
import java.util.ArrayList;
import android.graphics.RectF;
import com.twitter.library.card.property.Vector2F;
import android.support.v4.view.GestureDetectorCompat;
import android.content.Context;
import com.twitter.library.card.property.Style;
import com.twitter.library.card.CardView;
import com.twitter.library.card.Card;
import android.graphics.Paint;
import java.io.Externalizable;
import android.view.View$OnTouchListener;
import android.view.GestureDetector$OnGestureListener;

public abstract class Element implements GestureDetector$OnGestureListener, View$OnTouchListener, Externalizable
{
    protected static final Paint a;
    protected static b b;
    private static final long serialVersionUID = -3521307029522429944L;
    public String debugId;
    public int id;
    public int longPressActionId;
    protected Card mCard;
    protected CardView mCardView;
    protected Style mComputedStyle;
    private Context mContext;
    private GestureDetectorCompat mGestureDetector;
    protected Vector2F mLayoutPosition;
    protected final RectF mLayoutRect;
    protected Vector2F mLayoutSize;
    protected Vector2F mMeasuredConstraint;
    protected Vector2F mMeasuredSize;
    protected Container mParent;
    protected boolean mPressed;
    protected float mPressedX;
    protected float mPressedY;
    protected int mSerialId;
    private ArrayList mStyleStack;
    protected View mView;
    private boolean mVisible;
    private boolean mVisibleChild;
    public Spacing margin;
    public Vector2F maxSize;
    public Vector2 maxSizeMode;
    public float opacity;
    public Vector2F position;
    public int positionMode;
    public int pressDownActionId;
    public int pressUpActionId;
    public Vector2F size;
    public Vector2 sizeMode;
    public int tapActionId;
    
    static {
        a = new Paint(3);
    }
    
    public Element() {
        this.mMeasuredSize = Vector2F.b();
        this.mMeasuredConstraint = Vector2F.b();
        this.mLayoutPosition = new Vector2F();
        this.mLayoutSize = new Vector2F();
        this.mLayoutRect = new RectF();
        this.mComputedStyle = new Style();
        this.mStyleStack = new ArrayList();
        this.mVisible = true;
        this.mVisibleChild = true;
    }
    
    private void a() {
        this.J();
        final View mView = this.mView;
        int visibility;
        if (this.F()) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        mView.setVisibility(visibility);
        this.mView.requestLayout();
        this.mView.invalidate();
    }
    
    public static void a(final b b) {
        Element.b = b;
    }
    
    public Vector2F A() {
        return this.mLayoutSize;
    }
    
    protected Context B() {
        return this.mContext;
    }
    
    public ElementState C() {
        final ElementState elementState = new ElementState(this.mStyleStack.size());
        final Iterator<Style> iterator = (Iterator<Style>)this.mStyleStack.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Style style = iterator.next();
            final int[] a = elementState.a;
            final int n2 = n + 1;
            a[n] = style.id;
            n = n2;
        }
        return elementState;
    }
    
    public boolean D() {
        return this.pressDownActionId != 0 || this.pressUpActionId != 0 || this.tapActionId != 0 || this.longPressActionId != 0;
    }
    
    protected void E() {
        if (this.mGestureDetector == null) {
            (this.mGestureDetector = new GestureDetectorCompat(this.mContext, (GestureDetector$OnGestureListener)this)).setIsLongpressEnabled(true);
            this.mView.setOnTouchListener((View$OnTouchListener)this);
        }
    }
    
    public boolean F() {
        return this.mComputedStyle.visible && this.mVisibleChild;
    }
    
    public boolean G() {
        return this.mComputedStyle.visible && this.mVisibleChild && this.positionMode == 1;
    }
    
    public boolean H() {
        return this.mComputedStyle.visible && this.mVisibleChild && this.positionMode == 2;
    }
    
    public final void I() {
        this.u();
        if (this.mView != null) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                this.mView.post((Runnable)new a(this));
                return;
            }
            this.a();
        }
    }
    
    protected void J() {
    }
    
    public void K() {
        Container mParent = null;
        do {
            mParent.I();
            mParent = mParent.mParent;
        } while (mParent != null);
    }
    
    protected float a(final int n, final Vector2F vector2F) {
        return 0.0f;
    }
    
    public Element a(final int n) {
        if (this.id == n) {
            return this;
        }
        return null;
    }
    
    protected void a(final int n, final int n2) {
        if (this.mCard != null) {
            this.mCard.b(this, n, n2);
        }
    }
    
    public void a(final Context context) {
        this.mView = new ElementView(context, this);
    }
    
    public void a(final Canvas canvas) {
        if (this.mPressed && this.pressDownActionId == 0) {
            this.d(canvas);
        }
    }
    
    public void a(final Card card, final ElementState elementState) {
        final int[] a = elementState.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            final Style style = (Style)card.styles.get(a[i]);
            if (style != null) {
                this.a(style);
            }
        }
    }
    
    protected void a(final CardView mCardView) {
        this.mCardView = mCardView;
    }
    
    public void a(final d d) {
        d.a(this);
    }
    
    public void a(final Style style) {
        this.b(style);
        this.mStyleStack.add(style);
    }
    
    public void a(final Vector2F vector2F, final Vector2F mLayoutSize) {
        this.mLayoutPosition.set((float)Math.floor(vector2F.x), (float)Math.floor(vector2F.y));
        this.mLayoutSize = mLayoutSize;
        this.mLayoutRect.set(0.0f, 0.0f, mLayoutSize.x, mLayoutSize.y);
    }
    
    public void a(final h h, final ao ao) {
    }
    
    public void a(final int[] array) {
    }
    
    protected void a_(final Card card) {
    }
    
    public float b(final int n, final Vector2F vector2F) {
        final float a = this.mMeasuredSize.a(n);
        final float a2 = this.mMeasuredConstraint.a(n);
        final float a3 = vector2F.a(n);
        if (!Float.isNaN(a) && a3 == a2) {
            return a;
        }
        final int a4 = this.sizeMode.a(n);
        float n2 = new Vector2F(this.mComputedStyle.sizeX, this.mComputedStyle.sizeY).a(n);
        Label_0123: {
            switch (a4) {
                default: {
                    n2 = 0.0f;
                    break Label_0123;
                }
                case 4: {
                    final float a5 = vector2F.a(n ^ 0x1);
                    if (n2 <= 0.0f) {
                        n2 = 1.0f;
                    }
                    n2 *= a5;
                    break Label_0123;
                }
                case 3: {
                    n2 = this.a(n, vector2F);
                    break Label_0123;
                }
                case 2: {
                    n2 = a3;
                }
                case 1: {
                    this.mMeasuredSize.a(n, n2);
                    this.mMeasuredConstraint.a(n, a3);
                    return n2;
                }
            }
        }
    }
    
    protected void b(final Context mContext) {
        this.mContext = mContext;
    }
    
    public void b(final Canvas canvas) {
    }
    
    public void b(final Style style) {
        final int index = this.mStyleStack.indexOf(style);
        if (index != -1) {
            this.mStyleStack.remove(index);
        }
    }
    
    protected void b(final boolean b) {
    }
    
    public void c(final Context context) {
    }
    
    public void c(final Canvas canvas) {
        final float floatValue = this.mComputedStyle.opacity;
        if (floatValue != 1.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, (float)canvas.getWidth(), (float)canvas.getHeight(), (int)(floatValue * 255.0f), 4);
        }
    }
    
    protected void d() {
        if (this.D()) {
            this.E();
        }
    }
    
    public void d(final Canvas canvas) {
        final int color = Element.a.getColor();
        Element.a.setColor(this.mCardView.a.b);
        canvas.drawRect(this.mLayoutRect, Element.a);
        Element.a.setColor(color);
    }
    
    public void d(final boolean b) {
    }
    
    public void e() {
    }
    
    public void e(final Card mCard) {
        this.mCard = mCard;
    }
    
    public void e(final boolean mPressed) {
        this.mPressed = mPressed;
        if (this.mPressed) {
            this.mCardView.a();
        }
        else {
            this.mCardView.b();
        }
        this.K();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof Element)) {
                return false;
            }
            final Element element = (Element)o;
            if (this.id != element.id) {
                return false;
            }
            if (this.longPressActionId != element.longPressActionId) {
                return false;
            }
            if (this.mVisible != element.mVisible) {
                return false;
            }
            if (Float.compare(element.opacity, this.opacity) != 0) {
                return false;
            }
            if (this.positionMode != element.positionMode) {
                return false;
            }
            if (this.pressDownActionId != element.pressDownActionId) {
                return false;
            }
            if (this.pressUpActionId != element.pressUpActionId) {
                return false;
            }
            if (this.tapActionId != element.tapActionId) {
                return false;
            }
            Label_0158: {
                if (this.debugId != null) {
                    if (this.debugId.equals(element.debugId)) {
                        break Label_0158;
                    }
                }
                else if (element.debugId == null) {
                    break Label_0158;
                }
                return false;
            }
            Label_0188: {
                if (this.margin != null) {
                    if (this.margin.equals(element.margin)) {
                        break Label_0188;
                    }
                }
                else if (element.margin == null) {
                    break Label_0188;
                }
                return false;
            }
            Label_0218: {
                if (this.maxSize != null) {
                    if (this.maxSize.equals(element.maxSize)) {
                        break Label_0218;
                    }
                }
                else if (element.maxSize == null) {
                    break Label_0218;
                }
                return false;
            }
            Label_0248: {
                if (this.maxSizeMode != null) {
                    if (this.maxSizeMode.equals(element.maxSizeMode)) {
                        break Label_0248;
                    }
                }
                else if (element.maxSizeMode == null) {
                    break Label_0248;
                }
                return false;
            }
            Label_0278: {
                if (this.position != null) {
                    if (this.position.equals(element.position)) {
                        break Label_0278;
                    }
                }
                else if (element.position == null) {
                    break Label_0278;
                }
                return false;
            }
            Label_0308: {
                if (this.size != null) {
                    if (this.size.equals(element.size)) {
                        break Label_0308;
                    }
                }
                else if (element.size == null) {
                    break Label_0308;
                }
                return false;
            }
            if (this.sizeMode != null) {
                if (this.sizeMode.equals(element.sizeMode)) {
                    return true;
                }
            }
            else if (element.sizeMode == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    public void f() {
    }
    
    public void f(final int mSerialId) {
        this.mSerialId = mSerialId;
    }
    
    public void f(final boolean mVisible) {
        this.mVisible = mVisible;
    }
    
    public void g() {
    }
    
    public void g(final boolean mVisibleChild) {
        this.mVisibleChild = mVisibleChild;
        this.I();
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * (31 * this.id + this.positionMode);
        int hashCode;
        if (this.sizeMode != null) {
            hashCode = this.sizeMode.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n2 = 31 * (hashCode + n);
        int hashCode2;
        if (this.maxSizeMode != null) {
            hashCode2 = this.maxSizeMode.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int n3 = 31 * (hashCode2 + n2);
        int hashCode3;
        if (this.position != null) {
            hashCode3 = this.position.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final int n4 = 31 * (hashCode3 + n3);
        int hashCode4;
        if (this.size != null) {
            hashCode4 = this.size.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final int n5 = 31 * (hashCode4 + n4);
        int hashCode5;
        if (this.maxSize != null) {
            hashCode5 = this.maxSize.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final int n6 = 31 * (hashCode5 + n5);
        int hashCode6;
        if (this.margin != null) {
            hashCode6 = this.margin.hashCode();
        }
        else {
            hashCode6 = 0;
        }
        final int n7 = 31 * (hashCode6 + n6);
        int floatToIntBits;
        if (this.opacity != 0.0f) {
            floatToIntBits = Float.floatToIntBits(this.opacity);
        }
        else {
            floatToIntBits = 0;
        }
        final int n8 = 31 * (31 * (31 * (31 * (31 * (floatToIntBits + n7) + this.pressDownActionId) + this.pressUpActionId) + this.tapActionId) + this.longPressActionId);
        int hashCode7;
        if (this.debugId != null) {
            hashCode7 = this.debugId.hashCode();
        }
        else {
            hashCode7 = 0;
        }
        final int n9 = 31 * (hashCode7 + n8);
        final boolean mVisible = this.mVisible;
        int n10 = 0;
        if (mVisible) {
            n10 = 1;
        }
        return n9 + n10;
    }
    
    public boolean onDown(final MotionEvent motionEvent) {
        this.a(2, this.pressDownActionId);
        return true;
    }
    
    public boolean onFling(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
        return false;
    }
    
    public void onLongPress(final MotionEvent motionEvent) {
        this.a(5, this.longPressActionId);
    }
    
    public boolean onScroll(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
        return false;
    }
    
    public void onShowPress(final MotionEvent motionEvent) {
    }
    
    public boolean onSingleTapUp(final MotionEvent motionEvent) {
        this.a(4, this.tapActionId);
        return false;
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        final int n = 0xFF & motionEvent.getAction();
        final float x = motionEvent.getX();
        final float y = motionEvent.getY();
        switch (n) {
            case 0: {
                this.mPressedX = x;
                this.mPressedY = y;
                this.e(true);
                break;
            }
            case 1: {
                this.a(3, this.pressUpActionId);
                this.e(false);
                break;
            }
            case 2: {
                final float n2 = x - this.mPressedX;
                final float n3 = y - this.mPressedY;
                if (n2 * n2 + n3 * n3 > bj.d) {
                    this.a(3, this.pressUpActionId);
                    this.e(false);
                    break;
                }
                break;
            }
            case 3: {
                this.a(3, this.pressUpActionId);
                this.e(false);
                break;
            }
        }
        return this.mGestureDetector.onTouchEvent(motionEvent);
    }
    
    protected void q() {
        this.mComputedStyle.a();
        this.mComputedStyle.positionX = this.position.x;
        this.mComputedStyle.positionY = this.position.y;
        this.mComputedStyle.sizeX = this.size.x;
        this.mComputedStyle.sizeY = this.size.y;
        this.mComputedStyle.maxSizeX = this.maxSize.x;
        this.mComputedStyle.maxSizeY = this.maxSize.y;
        this.mComputedStyle.margin = this.margin;
        this.mComputedStyle.opacity = this.opacity;
        this.mComputedStyle.visible = this.mVisible;
    }
    
    public void r() {
        this.q();
        final Iterator<Style> iterator = this.mStyleStack.iterator();
        while (iterator.hasNext()) {
            this.mComputedStyle.a(iterator.next());
        }
    }
    
    public void readExternal(final ObjectInput objectInput) {
        this.id = objectInput.readInt();
        this.positionMode = objectInput.readInt();
        this.sizeMode = (Vector2)objectInput.readObject();
        this.maxSizeMode = (Vector2)objectInput.readObject();
        this.position = (Vector2F)objectInput.readObject();
        this.size = (Vector2F)objectInput.readObject();
        this.maxSize = (Vector2F)objectInput.readObject();
        this.margin = (Spacing)objectInput.readObject();
        this.opacity = objectInput.readFloat();
        this.pressDownActionId = objectInput.readInt();
        this.pressUpActionId = objectInput.readInt();
        this.tapActionId = objectInput.readInt();
        this.longPressActionId = objectInput.readInt();
        this.debugId = (String)objectInput.readObject();
        this.mVisible = objectInput.readBoolean();
    }
    
    protected void s() {
    }
    
    protected int t() {
        if (this.sizeMode.x == 4) {
            return 2;
        }
        if (this.sizeMode.y == 4) {
            return 3;
        }
        return 1;
    }
    
    public void u() {
        this.mMeasuredSize.set(Float.NaN, Float.NaN);
    }
    
    public void v() {
        this.I();
    }
    
    public void w() {
    }
    
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeInt(this.id);
        objectOutput.writeInt(this.positionMode);
        objectOutput.writeObject(this.sizeMode);
        objectOutput.writeObject(this.maxSizeMode);
        objectOutput.writeObject(this.position);
        objectOutput.writeObject(this.size);
        objectOutput.writeObject(this.maxSize);
        objectOutput.writeObject(this.margin);
        objectOutput.writeFloat(this.opacity);
        objectOutput.writeInt(this.pressDownActionId);
        objectOutput.writeInt(this.pressUpActionId);
        objectOutput.writeInt(this.tapActionId);
        objectOutput.writeInt(this.longPressActionId);
        objectOutput.writeObject(this.debugId);
        objectOutput.writeBoolean(this.mVisible);
    }
    
    public int x() {
        return this.mSerialId;
    }
    
    public Card y() {
        return this.mCard;
    }
    
    public View z() {
        return this.mView;
    }
}
