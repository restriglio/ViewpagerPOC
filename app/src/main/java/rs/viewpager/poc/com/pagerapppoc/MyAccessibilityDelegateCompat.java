package rs.viewpager.poc.com.pagerapppoc;

import android.os.Bundle;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;

/**
 * Created by raul.striglio on 23/09/16.
 */
public class MyAccessibilityDelegateCompat extends AccessibilityDelegateCompat {

    @Override
    public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.Action, "Next Page"));
        info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.Action1, "Prev Page"));
        info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.Action2, "Next Focus"));
    }


    @Override
    public boolean performAccessibilityAction(View host, int action, Bundle args) {
        switch (action) {
            case R.id.Action:
                MainActivity.GotoNextPage();
                return true;
            case R.id.Action1:
                MainActivity.GotoPrevPage();
            case R.id.Action2:
            default:
                return super.performAccessibilityAction(host, action, args);
        }
    }

}
