package rs.viewpager.poc.com.pagerapppoc;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by raul.striglio on 19/09/16.
 */
public class GridLayoutAdapter extends RecyclerView.Adapter {

    List<String> dataSet = new ArrayList<>();

    public GridLayoutAdapter(List<String> dataSet) {
        this.dataSet = dataSet;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_item, parent, false);
        return new GridViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        String s = dataSet.get(position);
        ((GridViewHolder) holder).dayNumber.setText(s);
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }


    public static class GridViewHolder extends RecyclerView.ViewHolder {
        public TextView dayNumber;
        public TextView detailTxt;

        public GridViewHolder(View v) {
            super(v);
            this.dayNumber = (TextView) v.findViewById(R.id.dayNumber);
            this.detailTxt = (TextView) v.findViewById(R.id.detailTxt);
        }
    }


}
