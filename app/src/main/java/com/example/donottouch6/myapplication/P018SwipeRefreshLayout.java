package com.example.donottouch6.myapplication;


import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class P018SwipeRefreshLayout extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p018swiperefreshlayout);

        final ListView listViewP018=(ListView) findViewById(R.id.listViewP018);

        final ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1);
        listViewP018.setAdapter(arrayAdapter);
        String[] itemDizi= getResources().getStringArray(R.array.string_array_p018);
        arrayAdapter.addAll(itemDizi);

        final SwipeRefreshLayout swipeRefreshLayoutP018=
                (SwipeRefreshLayout)findViewById(R.id.swipeRefreshLayoutP018);
        swipeRefreshLayoutP018.setOnRefreshListener(
                new SwipeRefreshLayout.OnRefreshListener() {
                    @Override
                    public void onRefresh() {
                        Toast.makeText(P018SwipeRefreshLayout.this,"Hello from swipeRefreshLayout",
                                Toast.LENGTH_LONG).show();
                        arrayAdapter.add("new item");
                        arrayAdapter.notifyDataSetInvalidated();
                        try {
                            Thread.sleep(2000);
                            swipeRefreshLayoutP018.setRefreshing(false);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
        );
    }
}
