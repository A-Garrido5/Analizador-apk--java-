// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.animation.AnimatorSet;
import android.animation.Animator$AnimatorListener;
import android.view.ViewAnimationUtils;
import android.util.FloatMath;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.view.ViewGroup;
import android.view.View;
import android.graphics.Rect;
import android.transition.TransitionValues;
import android.transition.Transition;

public class ae extends Transition
{
    private static final String[] a;
    private static final String[] z;
    
    static {
        final String[] array = new String[6];
        String s = "Wl?\u0010_QQ?\u0012]Gl9\u001a\\Z?/\u001cFZa>";
        int n = -1;
        String[] array2 = array;
        String[] array3 = array;
        int n2 = 0;
        String intern = null;
    Label_0341:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '3';
                        break;
                    }
                    case 0: {
                        c2 = '4';
                        break;
                    }
                    case 1: {
                        c2 = '\u0005';
                        break;
                    }
                    case 2: {
                        c2 = 'M';
                        break;
                    }
                    case 3: {
                        c2 = 's';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array2[n2] = intern;
                    s = "Wl?\u0010_QQ?\u0012]Gl9\u001a\\Z?=\u001c@]q$\u001c]";
                    n2 = 1;
                    array2 = array3;
                    n = 0;
                    continue;
                }
                case 0: {
                    array2[n2] = intern;
                    s = "Wl?\u0010_QQ?\u0012]Gl9\u001a\\Z?/\u001cFZa>";
                    n2 = 2;
                    array2 = array3;
                    n = 1;
                    continue;
                }
                case 1: {
                    array2[n2] = intern;
                    s = "Wl?\u0010_QQ?\u0012]Gl9\u001a\\Z?=\u001c@]q$\u001c]";
                    n2 = 3;
                    array2 = array3;
                    n = 2;
                    continue;
                }
                case 2: {
                    array2[n2] = intern;
                    n2 = 4;
                    array2 = array3;
                    s = "Wl?\u0010_QQ?\u0012]Gl9\u001a\\Z?=\u001c@]q$\u001c]";
                    n = 3;
                    continue;
                }
                case 3: {
                    array2[n2] = intern;
                    s = "Wl?\u0010_QQ?\u0012]Gl9\u001a\\Z?/\u001cFZa>";
                    n = 4;
                    n2 = 5;
                    array2 = array3;
                    continue;
                }
                case 4: {
                    array2[n2] = intern;
                    z = array3;
                    array2 = (array3 = new String[2]);
                    s = "Wl?\u0010_QQ?\u0012]Gl9\u001a\\Z?/\u001cFZa>";
                    n = 5;
                    n2 = 0;
                    continue;
                }
                case 5: {
                    array2[n2] = intern;
                    s = "Wl?\u0010_QQ?\u0012]Gl9\u001a\\Z?=\u001c@]q$\u001c]";
                    n = 6;
                    n2 = 1;
                    array2 = array3;
                    continue;
                }
                case 6: {
                    break Label_0341;
                }
            }
        }
        array2[n2] = intern;
        a = array3;
    }
    
    private void a(final TransitionValues transitionValues) {
        final View view = transitionValues.view;
        transitionValues.values.put(ae.z[5], new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        final int[] array = new int[2];
        transitionValues.view.getLocationInWindow(array);
        transitionValues.values.put(ae.z[4], array);
    }
    
    public void captureEndValues(final TransitionValues transitionValues) {
        final View view = transitionValues.view;
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return;
        }
        this.a(transitionValues);
    }
    
    public void captureStartValues(final TransitionValues transitionValues) {
        final View view = transitionValues.view;
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return;
        }
        this.a(transitionValues);
    }
    
    public Animator createAnimator(final ViewGroup viewGroup, final TransitionValues transitionValues, final TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        final Rect rect = transitionValues.values.get(ae.z[0]);
        final Rect rect2 = transitionValues2.values.get(ae.z[2]);
        if (rect == null || rect2 == null || rect.equals((Object)rect2)) {
            return null;
        }
        viewGroup.getLocationInWindow(new int[2]);
        final int[] array = transitionValues.values.get(ae.z[1]);
        final int n = rect.left + rect.width() / 2 - rect2.width() / 2;
        final int n2 = rect.top + rect.height() / 2 - rect2.height() / 2;
        final int[] array2 = transitionValues2.values.get(ae.z[3]);
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)transitionValues2.view, View.TRANSLATION_X, View.TRANSLATION_Y, this.getPathMotion().getPath((float)n, (float)n2, (float)0, (float)0));
        transitionValues2.view.setTranslationX((float)n);
        transitionValues2.view.setTranslationY((float)n2);
        final float min = Math.min(rect.width() / rect2.width(), rect.height() / rect2.width());
        final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object)transitionValues2.view, View.SCALE_X, new float[] { min, 1.0f });
        final ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((Object)transitionValues2.view, View.SCALE_Y, new float[] { min, 1.0f });
        final oo oo = new oo(ViewAnimationUtils.createCircularReveal(transitionValues2.view, rect2.centerX(), rect2.centerY(), 0.0f, FloatMath.sqrt((float)(rect2.width() * rect2.width() + rect2.height() * rect2.height())) / 2.0f));
        transitionValues2.view.setAlpha(0.0f);
        oo.addListener((Animator$AnimatorListener)new asj(this, transitionValues2));
        final AnimatorSet set = new AnimatorSet();
        set.playTogether(new Animator[] { ofFloat, oo, ofFloat2, ofFloat3 });
        set.setInterpolator(this.getInterpolator());
        return (Animator)set;
    }
    
    public String[] getTransitionProperties() {
        return ae.a;
    }
}
