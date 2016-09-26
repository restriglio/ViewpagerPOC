package rs.viewpager.poc.com.pagerapppoc;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by raul.striglio on 20/09/16.
 */
public class CustomAdapter extends RecyclerView.Adapter {

    private Context context;
    private List<String> mothsList;

    public CustomAdapter(Context context, List<String> mothsList) {
        this.context = context;
        this.mothsList = mothsList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_month_view, parent, false);
        return new MonthViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        String month = mothsList.get(position);
        ((MonthViewHolder) holder).titleTxt.setText(month);
    }

    @Override
    public int getItemCount() {
        return mothsList.size();
    }

    public static class MonthViewHolder extends RecyclerView.ViewHolder {
        public TextView titleTxt;
        public MonthViewClanedar monthView;

        public MonthViewHolder(View v) {
            super(v);
            this.titleTxt = (TextView) v.findViewById(R.id.titleTxt);
            this.monthView = (MonthViewClanedar) v.findViewById(R.id.monthView);
        }
    }
}
