package com.example.recyclerview.smt;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.recyclerview.Item;
import com.example.recyclerview.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

//public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> implements Filterable {
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private static final String TAG = "RecyclerAdapter";
    Context mContext;
    ArrayList<Service> serviceList;

    public RecyclerViewAdapter(Context mContext, ArrayList<Service> serviceList) {
        this.mContext = mContext;
        this.serviceList = serviceList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_booking, parent, false);
        RecyclerViewAdapter.ViewHolder viewHolder = new RecyclerViewAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        if(!serviceList.get(position).getUrl().isEmpty()){
            Glide.with(mContext)
                    .asBitmap()
                    .load(serviceList.get(position).getUrl())
                    .into(holder.circleImageView);
        }
        holder.textView1.setText(serviceList.get(position).getService());
        holder.textView2.setText("₹"+serviceList.get(position).getRate());
        holder.textView4.setText(serviceList.get(position).getCategory());
        holder.textView5.setText(serviceList.get(position).getProvider());
        holder.textView6.setText(serviceList.get(position).getRating());
        holder.textView7.setText(serviceList.get(position).getDistance()+" KM Away");
    }

    @Override
    public int getItemCount() {
        return serviceList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView circleImageView;
        TextView textView1, textView2, textView4, textView5, textView6, textView7;
        CardView parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            circleImageView = itemView.findViewById(R.id.image);
            textView1 = itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);
            textView4 = itemView.findViewById(R.id.textView4);
            textView5 = itemView.findViewById(R.id.textView5);
            textView6 = itemView.findViewById(R.id.textView6);
            textView7 = itemView.findViewById(R.id.textView7);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }


//  TODO: Uncomment below code to implement search using SearchView

//    @Override
//    public Filter getFilter() {
//        return exampleFilter;
//    }
//
//    private Filter exampleFilter = new Filter() {
//        @Override
//        protected FilterResults performFiltering(CharSequence charSequence) {
//            ArrayList<Item> filteredList = new ArrayList<>();
//
//            if(charSequence.toString().isEmpty()){
//                filteredList.addAll(itemsListAll);
//            }else{
//                String filterPattern = charSequence.toString().toLowerCase().trim();
//                for(Item item : itemsListAll){
//                    if(item.getmImageName().toLowerCase().contains(filterPattern)){
//                        filteredList.add(item);
//                    }
//                }
//            }
//            FilterResults results = new FilterResults();
//            results.values = filteredList;
//            return results;
//        }
//
//        @Override
//        protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
//            itemList.clear();
//            itemList.addAll((Collection<? extends Item>) filterResults.values);
//            notifyDataSetChanged();
//        }
//    };

//    TODO: Below function is to be used while searching with editText
//    There's no need of itemListAll in such case

//    public void filterList(ArrayList<Item> filteredList){
//        itemList = filteredList;
//        notifyDataSetChanged();
//    }
}
