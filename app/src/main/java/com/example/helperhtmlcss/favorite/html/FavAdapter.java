package com.example.helperhtmlcss.favorite.html;

import android.app.AlertDialog;
import android.content.Context;
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



public class FavAdapter extends RecyclerView.Adapter<FavAdapter.ViewHolder> {

    private Context context;

    private List<FavItem> favItemList;
    private DB favDB;

    public FavAdapter(Context context, List<FavItem> favItemList) {
        this.context = context;
        this.favItemList = favItemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fav_item,
                parent, false);
        favDB = new DB(context);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final FavItem favItem = favItemList.get(position);
        holder.favTitle.setText(favItem.getItem_title());
        holder.favTextView.setText(favItem.getItem_text());
        holder.favitemImage.setImageResource(favItem.getItem_image());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMyDialog(favItem);
            }
        });
    }



    @Override
    public int getItemCount() {
        return favItemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView favTextView, favTitle;
        Button favBtn;
        ImageView favitemImage;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            favTextView = itemView.findViewById(R.id.text_fav);
            favBtn = itemView.findViewById(R.id.favBtn);
            favTitle = itemView.findViewById(R.id.title_fav);
            favitemImage = itemView.findViewById(R.id.fav_image);



            favBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    final FavItem favItem = favItemList.get(position);
                    favDB.remove_fav(favItem.getKey_id());
                    removeItem(position);
                    Toast.makeText(view.getContext(), "Элемент удалён из избранного", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    private void removeItem(int position) {
        favItemList.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position,favItemList.size());
    }
    public void showMyDialog(FavItem favItem) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View v = layoutInflater.inflate(R.layout.dialog, null);

        TextView textdialog = (TextView) v.findViewById(R.id.textdialog);
        TextView title = (TextView) v.findViewById(R.id.titledialog);
        ImageView image = (ImageView) v.findViewById(R.id.imagedialog);
        ImageButton close = (ImageButton) v.findViewById(R.id.close);

        title.setText(favItem.getItem_title());
        int dialog_id = context.getResources().getIdentifier(favItem.getItem_example(), "drawable", context.getPackageName());
        textdialog.setText(favItem.getItem_description());
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

