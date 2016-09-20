package rs.viewpager.poc.com.pagerapppoc;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

/**
 * Created by raul.striglio on 19/09/16.
 */
public class MonthViewClanedar extends RecyclerView {

    private GridLayoutManager gridLayoutManager;
    LayoutInflater mInflater;

    public MonthViewClanedar(Context context) {
        super(context);
        mInflater = LayoutInflater.from(context);
        init(context);
    }

    public MonthViewClanedar(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
        mInflater = LayoutInflater.from(context);
        init(context);
    }
    public MonthViewClanedar(Context context, AttributeSet attrs) {
        super(context, attrs);
        mInflater = LayoutInflater.from(context);
        init(context);
    }

    private void init(Context context) {
        gridLayoutManager = new GridLayoutManager(context, 7);
        gridLayoutManager.generateLayoutParams(
                new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT)
        );

        List<String> list = Arrays.asList(
                new String[]{"01","02","03","04","05","06","07","08","09","10",
                            "11","12","13","14","15","16","17","18","19","20",
                            "21","22","23","24","25","26","27","28","29","30",});
        this.setAdapter(new GridLayoutAdapter(list));
        this.setLayoutManager(gridLayoutManager);
    }

}
