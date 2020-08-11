package com.dicoding.picodiploma.kioscupang;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.dicoding.picodiploma.kioscupang.adapter.ListCupang;
import com.dicoding.picodiploma.kioscupang.model.Detail;
import com.dicoding.picodiploma.kioscupang.model.Hickey;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView svHickey;
    private ArrayList<Hickey> list = new ArrayList<>();
    private String title = "Kios Cupang";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        svHickey = findViewById(R.id.show_ikan);
        svHickey.setHasFixedSize(true);

        list.addAll(Detail.getListData());
        showlist();

//        Button btnDialPhone = findViewById(R.id.btn_dial);
//        btnDialPhone.setOnClickListener(this);
    }
    private void showlist(){
        svHickey.setLayoutManager(new LinearLayoutManager(this));
        ListCupang listCupang = new ListCupang(list);
        svHickey.setAdapter(listCupang);

        listCupang.setOnItemClickCallback(new ListCupang.OnItemClickCallback() {
            @Override
            public void onItemClicked(Hickey data) {
                showSelectedHickey(data);
            }
        });
    }
    private void showSelectedHickey(Hickey hickey) {
        Intent detail = new Intent(MainActivity.this, ListActivity.class);
        detail.putExtra("photo", hickey.getPhoto());
        detail.putExtra(ListActivity.EXTRA_NAME, hickey.getName());
        detail.putExtra(ListActivity.EXTRA_DETAIL, hickey.getDetail());
        detail.putExtra(ListActivity.EXTRA_HARGA, hickey.getHarga());
        startActivity(detail);
        //Toast.makeText(this, "Kamu memilih " + hickey.getName(), Toast.LENGTH_SHORT).show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
//        MenuItem item = menu.findItem(R.id.action_search);
//        SearchView searchView = (SearchView) item.getActionView();
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//                return false;
//            }
//        });
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                break;

            case R.id.action_about:
                Intent about = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(about);
                title = "About Me";
                break;

        }
    }

//    @Override
//    public void onClick(View v) {
//        switch (v.getId()) {
////            case R.id.btn_dial:
////                String phoneNumber = "085708339519";
////                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
////                startActivity(dialPhoneIntent);
////                break;
////        }
////    }
}
