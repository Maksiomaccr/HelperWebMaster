package com.example.helperhtmlcss.favorite.html;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.helperhtmlcss.R;

import java.util.ArrayList;
import java.util.List;

import pl.droidsonroids.gif.GifImageView;


public class AtributeAdapter extends RecyclerView.Adapter<AtributeAdapter.ViewHolder> {

    private ArrayList<AtributeItem> atributeItems;
    private Context context;
    private DB favDB;



    public AtributeAdapter(ArrayList<AtributeItem> atributeItems, Context context) {
        this.atributeItems = atributeItems;
        this.context = context;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        favDB = new DB(context);
        //create table on first
        SharedPreferences preferences = context.getSharedPreferences("updateStart", Context.MODE_PRIVATE);
        boolean firstStart = preferences.getBoolean("firstStart", true);
        if (firstStart) {
            createTableOnFirstStart();
        }

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,
                parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull AtributeAdapter.ViewHolder holder, int position) {
        final AtributeItem atributeItem = atributeItems.get(position);
        readCursorData(atributeItem, holder);
        holder.TextView.setText(atributeItem.getText());
        holder.titleTextView.setText(atributeItem.getTitle());
        holder.itemImage.setImageResource(atributeItem.getItem_image());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMyDialog(atributeItem);
            }
        });
    }


    @Override
    public int getItemCount() {
        return atributeItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        TextView titleTextView, TextView, titleDialog, description;
        Button favBtn;
        ImageView itemImage;
        GifImageView example;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            titleDialog = itemView.findViewById(R.id.titledialog);
            description = itemView.findViewById(R.id.textdialog);
            example = itemView.findViewById(R.id.imagedialog);
            titleTextView = itemView.findViewById(R.id.title_html);
            favBtn = itemView.findViewById(R.id.favBtn);
            TextView = itemView.findViewById(R.id.text_html_directory);
            itemImage = itemView.findViewById(R.id.item_image);


            favBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    AtributeItem atributeItem = atributeItems.get(position);
                    if (atributeItem.getFavStatus().equals("0")) {
                        atributeItem.setFavStatus("1");
                        favDB.insertIntoTheDatabase(atributeItem.getTitle(), atributeItem.getText(), atributeItem.getItem_image(), atributeItem.getKey_id(), atributeItem.getFavStatus(), atributeItem.getDescription(), atributeItem.getExample());
                        favBtn.setBackgroundResource(R.drawable.fav_gold);
                        Toast.makeText(view.getContext(), "Элемент добавлен в избранное", Toast.LENGTH_SHORT).show();
                    } else {
                        atributeItem.setFavStatus("0");
                        favDB.remove_fav((atributeItem.getKey_id()));
                        favBtn.setBackgroundResource(R.drawable.fav_gray);
                        Toast.makeText(view.getContext(), "Элемент удалён из избранного", Toast.LENGTH_SHORT).show();
                    }

                }
            });

        }
    }

    private void createTableOnFirstStart() {
        favDB.insertEmpty();

        SharedPreferences preferences = context.getSharedPreferences("updateStart", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean("firstStart", false);
        editor.apply();
    }

    private void readCursorData(AtributeItem atributeItem, ViewHolder viewHolder) {
        Cursor cursor = favDB.read_all_data(atributeItem.getKey_id());
        SQLiteDatabase db = favDB.getReadableDatabase();
        try {
            while (cursor.moveToNext()) {
                @SuppressLint("Range") String item_fav_status = cursor.getString(cursor.getColumnIndex(DB.FAVORITE_STATUS));
                atributeItem.setFavStatus(item_fav_status);

                //check fav status
                if (item_fav_status != null && item_fav_status.equals("1")) {
                    viewHolder.favBtn.setBackgroundResource(R.drawable.fav_gold);
                } else if (item_fav_status != null && item_fav_status.equals("0")) {
                    viewHolder.favBtn.setBackgroundResource(R.drawable.fav_gray);
                }
            }
        } finally {
            if (cursor != null && cursor.isClosed())
                cursor.close();
            db.close();
        }

    }

    public void showMyDialog(AtributeItem atributeItem) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View v = layoutInflater.inflate(R.layout.dialog, null);

        TextView textdialog = (TextView) v.findViewById(R.id.textdialog);
        TextView title = (TextView) v.findViewById(R.id.titledialog);
        ImageView image = (ImageView) v.findViewById(R.id.imagedialog);
        ImageButton close = (ImageButton) v.findViewById(R.id.close);

        title.setText(atributeItem.getTitle());
        int dialog_id = context.getResources().getIdentifier(atributeItem.getExample(), "drawable", context.getPackageName());
        textdialog.setText(atributeItem.getDescription());
        image.setImageResource(dialog_id);


        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setView(v);
        AlertDialog dialog = builder.create();
        dialog.show();


        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });

    }



}
