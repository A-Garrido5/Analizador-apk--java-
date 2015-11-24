// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.transition.Transition$EpicenterCallback;
import java.util.Collection;
import java.util.List;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import android.view.ViewTreeObserver$OnPreDrawListener;
import java.util.Map;
import android.transition.TransitionSet;
import android.transition.Transition;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;

class FragmentTransitionCompat21
{
    static void access$000(final ArrayList list, final View view) {
        captureTransitioningViews(list, view);
    }
    
    static Rect access$100(final View view) {
        return getBoundsOnScreen(view);
    }
    
    public static void addTargets(final Object o, final ArrayList list) {
        int i = 0;
        final int a = NotificationCompatBase$Action.a;
        final Transition transition = (Transition)o;
        if (transition instanceof TransitionSet) {
            final TransitionSet set = (TransitionSet)transition;
            final int transitionCount = set.getTransitionCount();
            int j = 0;
            while (j < transitionCount) {
                addTargets(set.getTransitionAt(j), list);
                ++j;
                if (a != 0) {
                    break;
                }
            }
            if (a == 0) {
                return;
            }
        }
        if (!hasSimpleTarget(transition) && isNullOrEmpty(transition.getTargets())) {
            while (i < list.size()) {
                transition.addTarget((View)list.get(i));
                final int n = i + 1;
                if (a != 0) {
                    break;
                }
                i = n;
            }
        }
    }
    
    public static void addTransitionTargets(final Object o, final Object o2, final View view, final FragmentTransitionCompat21$ViewRetriever fragmentTransitionCompat21$ViewRetriever, final View view2, final FragmentTransitionCompat21$EpicenterView fragmentTransitionCompat21$EpicenterView, final Map map, final ArrayList list, final Map map2, final ArrayList list2) {
        if (o != null || o2 != null) {
            final Transition transition = (Transition)o;
            if (transition != null) {
                transition.addTarget(view2);
            }
            if (o2 != null) {
                addTargets(o2, list2);
            }
            if (fragmentTransitionCompat21$ViewRetriever != null) {
                view.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new FragmentTransitionCompat21$2(view, fragmentTransitionCompat21$ViewRetriever, map, map2, transition, list, view2));
            }
            setSharedElementEpicenter(transition, fragmentTransitionCompat21$EpicenterView);
        }
    }
    
    public static void beginDelayedTransition(final ViewGroup viewGroup, final Object o) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition)o);
    }
    
    public static Object captureExitingViews(Object o, final View view, final ArrayList list, final Map map, final View view2) {
        if (o != null) {
            captureTransitioningViews(list, view);
            if (map != null) {
                list.removeAll(map.values());
            }
            if (!list.isEmpty()) {
                list.add(view2);
                addTargets(o, list);
                return o;
            }
            o = null;
        }
        return o;
    }
    
    private static void captureTransitioningViews(final ArrayList list, final View view) {
        final int a = NotificationCompatBase$Action.a;
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                final ViewGroup viewGroup = (ViewGroup)view;
                Label_0078: {
                    if (viewGroup.isTransitionGroup()) {
                        list.add(viewGroup);
                        if (a == 0) {
                            break Label_0078;
                        }
                    }
                    final int childCount = viewGroup.getChildCount();
                    int i = 0;
                    while (i < childCount) {
                        captureTransitioningViews(list, viewGroup.getChildAt(i));
                        ++i;
                        if (a != 0) {
                            break;
                        }
                    }
                }
                if (a == 0) {
                    return;
                }
            }
            list.add(view);
        }
    }
    
    public static void cleanupTransitions(final View view, final View view2, final Object o, final ArrayList list, final Object o2, final ArrayList list2, final Object o3, final ArrayList list3, final Object o4, final ArrayList list4, final Map map) {
        final Transition transition = (Transition)o;
        final Transition transition2 = (Transition)o2;
        final Transition transition3 = (Transition)o3;
        final Transition transition4 = (Transition)o4;
        if (transition4 != null) {
            view.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new FragmentTransitionCompat21$4(view, transition, view2, list, transition2, list2, transition3, list3, map, list4, transition4));
        }
    }
    
    public static Object cloneTransition(Object clone) {
        if (clone != null) {
            clone = ((Transition)clone).clone();
        }
        return clone;
    }
    
    public static void excludeTarget(final Object o, final View view, final boolean b) {
        ((Transition)o).excludeTarget(view, b);
    }
    
    public static void findNamedViews(final Map map, final View view) {
        final int a = NotificationCompatBase$Action.a;
        if (view.getVisibility() == 0) {
            final String transitionName = view.getTransitionName();
            if (transitionName != null) {
                map.put(transitionName, view);
            }
            if (view instanceof ViewGroup) {
                final ViewGroup viewGroup = (ViewGroup)view;
                final int childCount = viewGroup.getChildCount();
                int i = 0;
                while (i < childCount) {
                    findNamedViews(map, viewGroup.getChildAt(i));
                    ++i;
                    if (a != 0) {
                        break;
                    }
                }
            }
        }
    }
    
    private static Rect getBoundsOnScreen(final View view) {
        final Rect rect = new Rect();
        final int[] array = new int[2];
        view.getLocationOnScreen(array);
        rect.set(array[0], array[1], array[0] + view.getWidth(), array[1] + view.getHeight());
        return rect;
    }
    
    public static String getTransitionName(final View view) {
        return view.getTransitionName();
    }
    
    private static boolean hasSimpleTarget(final Transition transition) {
        return !isNullOrEmpty(transition.getTargetIds()) || !isNullOrEmpty(transition.getTargetNames()) || !isNullOrEmpty(transition.getTargetTypes());
    }
    
    private static boolean isNullOrEmpty(final List list) {
        return list == null || list.isEmpty();
    }
    
    public static Object mergeTransitions(final Object o, final Object o2, final Object o3, boolean b) {
        final int a = NotificationCompatBase$Action.a;
        final Transition transition = (Transition)o;
        final Transition transition2 = (Transition)o2;
        final Transition transition3 = (Transition)o3;
        if (transition == null || transition2 == null) {
            b = true;
        }
        if (b) {
            final TransitionSet set = new TransitionSet();
            if (transition != null) {
                set.addTransition(transition);
            }
            if (transition2 != null) {
                set.addTransition(transition2);
            }
            if (transition3 != null) {
                set.addTransition(transition3);
            }
            if (a == 0) {
                return set;
            }
        }
        Object setOrdering;
        if (transition2 != null && transition != null) {
            setOrdering = new TransitionSet().addTransition(transition2).addTransition(transition).setOrdering(1);
        }
        else if (transition2 != null) {
            setOrdering = transition2;
        }
        else {
            setOrdering = null;
            if (transition != null) {
                setOrdering = transition;
            }
        }
        if (transition3 != null) {
            final TransitionSet set = new TransitionSet();
            if (setOrdering != null) {
                set.addTransition((Transition)setOrdering);
            }
            set.addTransition(transition3);
            if (a == 0) {
                return set;
            }
        }
        return (TransitionSet)setOrdering;
    }
    
    public static void removeTargets(final Object o, final ArrayList list) {
        final int a = NotificationCompatBase$Action.a;
        final Transition transition = (Transition)o;
        if (transition instanceof TransitionSet) {
            final TransitionSet set = (TransitionSet)transition;
            final int transitionCount = set.getTransitionCount();
            int i = 0;
            while (i < transitionCount) {
                removeTargets(set.getTransitionAt(i), list);
                ++i;
                if (a != 0) {
                    break;
                }
            }
            if (a == 0) {
                return;
            }
        }
        if (!hasSimpleTarget(transition)) {
            final List targets = transition.getTargets();
            if (targets != null && targets.size() == list.size() && targets.containsAll(list)) {
                int n;
                for (int j = -1 + list.size(); j >= 0; j = n) {
                    transition.removeTarget((View)list.get(j));
                    n = j - 1;
                    if (a != 0) {
                        break;
                    }
                }
            }
        }
    }
    
    public static void setEpicenter(final Object o, final View view) {
        ((Transition)o).setEpicenterCallback((Transition$EpicenterCallback)new FragmentTransitionCompat21$1(getBoundsOnScreen(view)));
    }
    
    private static void setSharedElementEpicenter(final Transition transition, final FragmentTransitionCompat21$EpicenterView fragmentTransitionCompat21$EpicenterView) {
        if (transition != null) {
            transition.setEpicenterCallback((Transition$EpicenterCallback)new FragmentTransitionCompat21$3(fragmentTransitionCompat21$EpicenterView));
        }
    }
}
