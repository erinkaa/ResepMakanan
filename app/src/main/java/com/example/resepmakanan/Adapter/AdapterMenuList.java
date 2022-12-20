package com.example.resepmakanan.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.resepmakanan.R;
import com.example.resepmakanan.Resep;

import java.util.List;

public class AdapterMenuList extends RecyclerView.Adapter<AdapterMenuList.ViewHolder> {

    private Context context;
    private List<Menu> list;

    public AdapterMenuList(Context context, List<Menu> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public AdapterMenuList.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(context).inflate(R.layout.item_menu,null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterMenuList.ViewHolder holder, int position) {
        holder.namaMenu.setText(list.get(position).getNamaMenu());
        holder.buttonMenuCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Resep.class);
                intent.putExtra("NamaMenu",list.get(holder.getAdapterPosition()).getNamaMenu());
                intent.putExtra("Bahan",list.get(holder.getAdapterPosition()).getBahan());
                intent.putExtra("Tahapan",list.get(holder.getAdapterPosition()).getTahapan());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView namaMenu;
        private CardView buttonMenuCardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            namaMenu = itemView.findViewById(R.id.namaMenuTextView);
            buttonMenuCardView = itemView.findViewById(R.id.buttonMenuCardView);
        }
    }
}
