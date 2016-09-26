package rs.viewpager.poc.com.pagerapppoc;

import android.os.Bundle;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/**
 * Created by raul.striglio on 23/09/16.
 */
public class MyAccessibilityDelegateCompat extends AccessibilityDelegateCompat {

    @Override
    public boolean onRequestSendAccessibilityEvent(ViewGroup host, View child, AccessibilityEvent event) {
        return super.onRequestSendAccessibilityEvent(host, child, event);
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.Action, "Next Page"));
        info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.Action1, "Prev Page"));
        info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.Action2, "Next Focus"));

        AccessibilityNodeInfoCompat.AccessibilityActionCompat action =
                new AccessibilityNodeInfoCompat.AccessibilityActionCompat(AccessibilityNodeInfo.ACTION_NEXT_AT_MOVEMENT_GRANULARITY,"next page 4.4");
        info.addAction(action);
    }

    @Override
    public void onPopulateAccessibilityEvent(View host, AccessibilityEvent event) {
        super.onPopulateAccessibilityEvent(host, event);
    }

    @Override
    public boolean dispatchPopulateAccessibilityEvent(View host, AccessibilityEvent event) {
        return super.dispatchPopulateAccessibilityEvent(host, event);
    }

    @Override
    public boolean performAccessibilityAction(View host, int action, Bundle args) {
        switch (action) {
            case R.id.Action:
                MainActivity.gotoNextPage();
                return true;
            case R.id.Action1:
                MainActivity.gotoPrevPage();
            case R.id.Action2:
            default:
                return super.performAccessibilityAction(host, action, args);
        }
    }

}
