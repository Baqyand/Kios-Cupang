package com.dicoding.picodiploma.kioscupang.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dicoding.picodiploma.kioscupang.R;
import com.dicoding.picodiploma.kioscupang.model.Hickey;

import java.util.ArrayList;

public class ListCupang extends RecyclerView.Adapter<ListCupang.ListViewHolder> implements Filterable {
    private ArrayList<Hickey> listHickey;
    private ArrayList<Hickey> search;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }


    public ListCupang(ArrayList<Hickey> list){
        this.listHickey = list;
        this.search = new ArrayList<>(listHickey);
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_ikan, viewGroup, false);
//        listHickey = (Hickey)view.findViewById(R.id.);
        return new ListViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Hickey hickey = listHickey.get(position);
        Glide.with(holder.itemView.getContext()).load(hickey.getPhoto()).apply(new RequestOptions().override(250,250)).into(holder.imgPhoto);
        holder.tvnama.setText(hickey.getName());
        holder.tvdetail.setText(hickey.getDetail());
        holder.tvharga.setText(hickey.getHarga());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              onItemClickCallback.onItemClicked(listHickey.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {

        return listHickey.size();
    }

    @Override
    public Filter getFilter() {
        return filter;
    }
    Filter filter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            return null;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {

        }
    };

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvnama,tvdetail,tvharga,tvpos;

        public ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_ikan_cupang);
            tvnama = itemView.findViewById(R.id.img_ikan_name);
            tvdetail = itemView.findViewById(R.id.img_ikan_detail);
            tvharga = itemView.findViewById(R.id.img_harga);
        }
    }
    public interface OnItemClickCallback {
        void onItemClicked(Hickey data);
    }
}
