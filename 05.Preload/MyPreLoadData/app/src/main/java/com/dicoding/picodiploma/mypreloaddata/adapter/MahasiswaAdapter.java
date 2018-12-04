package com.dicoding.picodiploma.mypreloaddata.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dicoding.picodiploma.mypreloaddata.R;
import com.dicoding.picodiploma.mypreloaddata.model.MahasiswaModel;

import java.util.ArrayList;

/**
 * Created by dicoding on 12/6/2016.
 */
public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaHolder> {
    private ArrayList<MahasiswaModel> mData = new ArrayList<>();

    public MahasiswaAdapter() {
    }

    @Override
    public MahasiswaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mahasiswa_row, parent, false);
        return new MahasiswaHolder(view);
    }

    public void addItem(ArrayList<MahasiswaModel> mData) {

        this.mData = mData;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(MahasiswaHolder holder, int position) {
        holder.textViewNim.setText(mData.get(position).getNim());
        holder.textViewNama.setText(mData.get(position).getName());

    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MahasiswaHolder extends RecyclerView.ViewHolder {
        private TextView textViewNim;
        private TextView textViewNama;

        public MahasiswaHolder(View itemView) {
            super(itemView);

            textViewNim = (TextView) itemView.findViewById(R.id.txt_nim);
            textViewNama = (TextView) itemView.findViewById(R.id.txt_nama);
        }

    }
}