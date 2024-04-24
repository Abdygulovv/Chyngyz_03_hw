package com.example.chyngyz_03_hw;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.chyngyz_03_hw.databinding.ItemCarBinding;

import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter<ViewHolder> {

    private ArrayList<Car> cars;

    public CarAdapter(ArrayList<Car> cars){
        this.cars = cars;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemCarBinding.inflate(
                LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(cars.get(position));

    }

    @Override
    public int getItemCount() {
        return cars.size();
    }
}

class ViewHolder extends RecyclerView.ViewHolder {
    private ItemCarBinding binding;

    public ViewHolder(@NonNull ItemCarBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void onBind(Car car) {
        binding.tvName.setText(car.getName());
        Glide.with(binding.imgCar).load(car.getImage()).into(binding.imgCar);
    }
}