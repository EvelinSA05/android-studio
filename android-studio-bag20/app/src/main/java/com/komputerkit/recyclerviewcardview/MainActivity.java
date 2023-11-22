package com.komputerkit.recyclerviewcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    SiswaAdapter adapter;
    List<Siswa> siswaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        load();
        isiData();
    }

    public  void load(){
        recyclerView = findViewById(R.id.rcvSiswa);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void isiData(){
        siswaList = new ArrayList<Siswa>();
        siswaList.add(new Siswa("Joni", "Sidoarjo"));
        siswaList.add(new Siswa("Ino", "Sidoarjo"));
        siswaList.add(new Siswa("Teki", "Sidoarjo"));
        siswaList.add(new Siswa("Tema", "Sidoarjo"));
        siswaList.add(new Siswa("Onik", "Sidoarjo"));
        siswaList.add(new Siswa("Joni", "Sidoarjo"));
        siswaList.add(new Siswa("Joni", "Sidoarjo"));
        siswaList.add(new Siswa("Joni", "Sidoarjo"));
        siswaList.add(new Siswa("Joni", "Sidoarjo"));
        siswaList.add(new Siswa("Joni", "Sidoarjo"));
        siswaList.add(new Siswa("Joni", "Sidoarjo"));
        siswaList.add(new Siswa("Joni", "Sidoarjo"));
        siswaList.add(new Siswa("Joni", "Sidoarjo"));

        adapter = new SiswaAdapter(this, siswaList);
        recyclerView.setAdapter(adapter);
    }

    public void btnTambah(View view) {
        siswaList.add(new Siswa("JONI IKA", "JOMBANG"));
        adapter.notifyDataSetChanged();
    }
}