package in.exodia.exodia;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class UsersListAdapter extends RecyclerView.Adapter<UsersListAdapter.ViewHolder> {

    public List<Users> usersList;
    public UsersListAdapter(List<Users> usersList){
        this.usersList=usersList;
    }
    @NonNull
    @Override
    public UsersListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UsersListAdapter.ViewHolder viewHolder, int i) {
        viewHolder.mtextview1.setText(usersList.get(i).getName());
        viewHolder.mtextview2.setText(usersList.get(i).getStatus());
    }

    @Override
    public int getItemCount() {
        return usersList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        View mview;

        TextView mtextview1,mtextview2;
        public ViewHolder(View itemView){
            super(itemView);
            mview=itemView;

            mtextview1=mview.findViewById(R.id.name);
            mtextview2=mview.findViewById(R.id.status);
        }
    }
}

