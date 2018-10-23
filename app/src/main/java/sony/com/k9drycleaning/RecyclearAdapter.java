package sony.com.k9drycleaning;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclearAdapter extends RecyclerView.Adapter<RecyclearAdapter.RecyclearViewHolder> {

    private String[] data;
    public RecyclearAdapter(String[] data ){

        this.data=data;

    }

    @NonNull
    @Override
    public RecyclearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.activity_cart_view,parent,false);
        return new RecyclearViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclearViewHolder holder, int position) {

        String title=data[position];
        holder.txtName.setText(title);
        holder.txtQuantity.setText(title);
        holder.txtPrice.setText(title);


//       int image_id=data[position];
//       holder.imgIcon.setImageResource(Integer.parseInt(String.valueOf(image_id)));
//       holder.txtName.setText(position);


    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class RecyclearViewHolder extends RecyclerView.ViewHolder{

        ImageView imgIcon;
        TextView txtName,txtQuantity,txtPrice;


        public RecyclearViewHolder(View itemView) {
            super(itemView);
            imgIcon=itemView.findViewById(R.id.imageView);
            txtName=itemView.findViewById(R.id.shirt);
            txtQuantity=itemView.findViewById(R.id.quantityshirt);
            txtPrice=itemView.findViewById(R.id.totalpriceshirt);
        }
    }
}
