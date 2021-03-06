package rs.viewpager.poc.com.pagerapppoc;

/**
 * Created by raul.striglio on 20/09/16.
 */
public enum ModelObject {

    RED(1, R.layout.custom_month_view),
    BLUE(2, R.layout.custom_month_view),
    GREEN(3, R.layout.custom_month_view);

    private int mTitleResId;
    private int mLayoutResId;

    ModelObject(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }

}