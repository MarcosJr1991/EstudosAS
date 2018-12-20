package marcosjr.com.ebviewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hold1.pagertabsindicator.PagerTabsIndicator;

import java.util.ArrayList;
import java.util.List;

import marcosjr.com.ebviewpager.Adapter.CustomViewPagerAdapter;
import marcosjr.com.ebviewpager.Model.Model;

public class MainActivity extends AppCompatActivity {

    List<Model> models = new ArrayList<>();

    ViewPager viewPager;
    PagerTabsIndicator tabsIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initModel();
        viewPager = (ViewPager)findViewById(R.id.view_pager);
        tabsIndicator = (PagerTabsIndicator)findViewById(R.id.tbs_indicator);
        viewPager.setAdapter(new CustomViewPagerAdapter(models,this));
        tabsIndicator.setViewPager(viewPager);
    }

    private void initModel() {
     //   for (int i=0;i<5;i++)
     //       models.add(new Model("Page"+(i+1),0));
      Model model = new Model("Page 1",R.drawable.ic_audiotrack_black_24dp);
      models.add(model);
        model = new Model("Page 2",R.drawable.ic_brightness_3_black_24dp);
        models.add(model);
        model = new Model("Page 3",R.drawable.ic_brush_black_24dp);
        models.add(model);
        model = new Model("Page 4",R.drawable.ic_call_end_black_24dp);
        models.add(model);
        model = new Model("Page 5",R.drawable.ic_clear_black_24dp);
        models.add(model);
    }
}
