package rs.viewpager.poc.com.pagerapppoc;

import android.os.Bundle;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new CustomPagerAdapter(this));
        //viewPager.setAccessibilityDelegate(new MyAccessibilityDelegate(this));
        ViewCompat.setAccessibilityDelegate(viewPager, new MyAccessibilityDelegateCompat());

    }

    public static void GotoNextPage() {
        int page = viewPager.getCurrentItem();
        if (page <= viewPager.getChildCount()) {
            viewPager.setCurrentItem(page + 1, true);
        }
    }

    public static void GotoPrevPage() {
        int page = viewPager.getCurrentItem();
        if (page > 0) {
            viewPager.setCurrentItem(page - 1, true);
        }
    }

}
