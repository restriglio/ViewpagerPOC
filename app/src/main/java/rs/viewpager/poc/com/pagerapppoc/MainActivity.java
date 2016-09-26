package rs.viewpager.poc.com.pagerapppoc;

import android.os.Bundle;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static RecyclerView recyclerView;
    private List<String> monthsList = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto");
    private static LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new CustomAdapter(this, monthsList));
        ViewCompat.setAccessibilityDelegate(recyclerView, new MyAccessibilityDelegateCompat());

    }

    public static void GotoNextPage() {
        recyclerView.getLayoutManager().scrollToPosition(linearLayoutManager.findLastVisibleItemPosition() + 1);
    }

    public static void GotoPrevPage() {
        recyclerView.getLayoutManager().scrollToPosition(linearLayoutManager.findFirstVisibleItemPosition() - 1);
    }

}
