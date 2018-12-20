package marcosjr.com.ebviewpager.Adapter;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hold1.pagertabsindicator.TabViewProvider;

import java.util.List;

import marcosjr.com.ebviewpager.Model.Model;
import marcosjr.com.ebviewpager.R;
import marcosjr.com.ebviewpager.TabView.TabViewItem;

public class CustomViewPagerAdapter extends PagerAdapter implements TabViewProvider.CustomView {

    List<Model> models;
    Context context;

    public CustomViewPagerAdapter(List<Model> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return "Page "+ (position+ 1);
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ((ViewGroup)container).removeView((View)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View itemView = inflater.inflate(R.layout.layout_item,container,false);

        TextView textView = (TextView)itemView.findViewById(R.id.txtTextView);
        textView.setText(models.get(position).getTitle());

        container.addView(itemView);
        return itemView;
    }

//    @Override
//    public Uri getImageUri(int i) {
//        //aqui você pode retornar links da internet
//        return null;
//    }

//    @Override
//    public int getImageResourceId(int i) {
//        //retorno de recursos
//        return models.get(i).getId();
//    }

    @Override
    public View getView(int i) {
        return new TabViewItem(context,
                models.get(i).getTitle(),
                models.get(i).getId(),
                0xFF363636,
                0xFFFF0000);
    }
}
