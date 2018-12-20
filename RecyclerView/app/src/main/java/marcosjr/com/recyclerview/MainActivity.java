package marcosjr.com.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import marcosjr.com.recyclerview.Adapter.ProgrammingAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView programmingList = (RecyclerView) findViewById(R.id.programmingList);
        programmingList.setLayoutManager(new LinearLayoutManager(this));

        String[] languages = {" Java "," JavaScript "," C# "," php "," C "," C++ ", "Python"," Java "," JavaScript "," C# "," php "," C "," C++ ", "Python"};

        programmingList.setAdapter(new ProgrammingAdapter(languages));
    }
}
