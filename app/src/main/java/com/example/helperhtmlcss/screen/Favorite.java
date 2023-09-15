package com.example.helperhtmlcss.screen;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.helperhtmlcss.R;
import com.example.helperhtmlcss.favorite.html.DB;
import com.example.helperhtmlcss.favorite.html.FavAdapter;
import com.example.helperhtmlcss.favorite.html.FavItem;

import java.util.ArrayList;
import java.util.List;


public class Favorite extends Fragment {


    private RecyclerView recyclerView;
    private DB favDB;

    private List<FavItem> favItemList = new ArrayList<>();

    private FavAdapter favAdapter;


    @SuppressLint("MissingInflatedId")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_favorite, container, false);

        favDB = new DB(getActivity());

        recyclerView = root.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        loadData();

        TextView no = (TextView) root.findViewById(R.id.not_found);
        if (favAdapter.getItemCount() > 0) {
            no.setVisibility(View.GONE);
        }

        return root;
    }

    private void loadData() {
        if (favItemList != null) {
            favItemList.clear();
        }
        SQLiteDatabase db = favDB.getReadableDatabase();
        Cursor cursor = favDB.select_all_favorite_list();
        try {
            while (cursor.moveToNext()) {
                @SuppressLint("Range") String title = cursor.getString(cursor.getColumnIndex(DB.ITEM_TITLE));
                @SuppressLint("Range") String text = cursor.getString(cursor.getColumnIndex(DB.ITEM_TEXT));
                @SuppressLint("Range") String id = cursor.getString(cursor.getColumnIndex(DB.KEY_ID));
                @SuppressLint("Range") int image = Integer.parseInt(cursor.getString(cursor.getColumnIndex(DB.ITEM_IMAGE)));
                @SuppressLint("Range") String description = cursor.getString(cursor.getColumnIndex(DB.DESCRIPTION));
                @SuppressLint("Range") String example = cursor.getString(cursor.getColumnIndex(DB.EXAMPLE));


                FavItem favItem = new FavItem(title, text, id, image, description, example);
                favItemList.add(favItem);
            }
        } finally {
            if (cursor != null && cursor.isClosed())
                cursor.close();
            db.close();
        }

        favAdapter = new FavAdapter(getActivity(), favItemList);

        recyclerView.setAdapter(favAdapter);

    }


}