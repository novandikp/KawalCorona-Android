package com.kevdocode.kawalkorona.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kevdocode.kawalkorona.Model.ModelAttributes;
import com.kevdocode.kawalkorona.Model.ModelObject;
import com.kevdocode.kawalkorona.R;

import java.util.List;

public class ProvinsiAdapter extends RecyclerView.Adapter<ProvinsiAdapter.ViewHolder> {
    Context context;
    List<ModelObject> objects;

    public ProvinsiAdapter(Context context, List<ModelObject> objects) {
        this.context = context;
        this.objects = objects;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_provinsi,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ModelAttributes attributes = objects.get(position).getAttributes();
        holder.t1.setText(attributes.getProvinsi());
        holder.t2.setText("Pasien Sembuh : "+attributes.getKasus_Semb());
        holder.t3.setText("Kasus Positif : "+attributes.getKasus_Posi());
        holder.t4.setText("Kasus Meninggal : "+attributes.getKasus_Meni());
    }

    @Override
    public int getItemCount() {
        return objects.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView t1,t2,t3,t4;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            t1 = itemView.findViewById(R.id.t1);
            t2 = itemView.findViewById(R.id.t2);
            t3 = itemView.findViewById(R.id.t3);
            t4 = itemView.findViewById(R.id.t4);


        }
    }
}
