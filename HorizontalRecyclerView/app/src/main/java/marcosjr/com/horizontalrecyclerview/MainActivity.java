package marcosjr.com.horizontalrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

import marcosjr.com.horizontalrecyclerview.Adapter.RecyclerViewAdapter;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //Variaveis
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getImages();
    }

    private void getImages(){
        Log.d(TAG,"initImageBitmaps: preparing bitmaps. ");

        mImageUrls.add("https://cdn.getyourguide.com/img/tour_img-381789-145.jpg");
        mNames.add("Lisboa: a Sintra, Azenhas do Mar e Cascais");

        mImageUrls.add("https://cdn.getyourguide.com/img/tour_img-381789-145.jpg");
        mNames.add("Lisboa: a Sintra, Azenhas do Mar e Cascais");

        mImageUrls.add("https://cdn.getyourguide.com/img/tour_img-381789-145.jpg");
        mNames.add("Lisboa: a Sintra, Azenhas do Mar e Cascais");

        mImageUrls.add("https://cdn.getyourguide.com/img/tour_img-381789-145.jpg");
        mNames.add("Lisboa: a Sintra, Azenhas do Mar e Cascais");

        mImageUrls.add("https://cdn.getyourguide.com/img/tour_img-381789-145.jpg");
        mNames.add("Lisboa: a Sintra, Azenhas do Mar e Cascais");

        mImageUrls.add("https://cdn.getyourguide.com/img/tour_img-381789-145.jpg");
        mNames.add("Lisboa: a Sintra, Azenhas do Mar e Cascais");

        mImageUrls.add("https://cdn.getyourguide.com/img/tour_img-381789-145.jpg");
        mNames.add("Lisboa: a Sintra, Azenhas do Mar e Cascais");

        mImageUrls.add("https://cdn.getyourguide.com/img/tour_img-381789-145.jpg");
        mNames.add("Lisboa: a Sintra, Azenhas do Mar e Cascais");

        mImageUrls.add("https://cdn.getyourguide.com/img/tour_img-381789-145.jpg");
        mNames.add("Lisboa: a Sintra, Azenhas do Mar e Cascais");

        mImageUrls.add("https://cdn.getyourguide.com/img/tour_img-381789-145.jpg");
        mNames.add("Lisboa: a Sintra, Azenhas do Mar e Cascais");

        initRecyclerView();
    }

    private void initRecyclerView(){

        Log.d(TAG,"initRecyclerView; init recyclerview ");

        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,mNames,mImageUrls);
        recyclerView.setAdapter(adapter);

    }
}
