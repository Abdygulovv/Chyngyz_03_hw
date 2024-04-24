package com.example.chyngyz_03_hw;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.chyngyz_03_hw.databinding.FragmentCarBinding;

import java.util.ArrayList;

public class CarFragment extends Fragment {

    private FragmentCarBinding binding;

    private ArrayList<Car> cars = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCarBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        CarAdapter adapter = new CarAdapter(cars);
        binding.rvCar.setAdapter(adapter);
    }

    private void loadData() {
        cars.add(new Car("https://www.pngall.com/wp-content/uploads/2016/05/Mercedes-Benz-PNG.png","Mercedes_Benz","W210"));
        cars.add(new Car("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZ5TtOoft1GDLEpsLyjPlPjNjpmRM9WgDqBdyGtTAS1Q&s","Ford","Focus"));
        cars.add(new Car("https://e7.pngegg.com/pngimages/265/559/png-clipart-car-2017-honda-accord-lx-2017-honda-accord-sedan-honda-compact-car-vehicle.png","Honda","ACCORD"));
        cars.add(new Car("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ3Aa2ZVejoBXOKgK0NgV8-sPfdmYvv3qtEipS3mnSglg&s","Toyota","RAV4"));
        cars.add(new Car("https://w7.pngwing.com/pngs/586/114/png-transparent-2018-hyundai-sonata-se-hyundai-motor-company-car-dealership-hyundai-compact-car-sedan-driving.png","Hyundai","Sonata"));
        cars.add(new Car("https://i.pinimg.com/564x/fb/c9/3c/fbc93cbc1483608498edbcc00c8dea55.jpg","BMW","E36"));
        cars.add(new Car("https://e7.pngegg.com/pngimages/276/944/png-clipart-2018-lexus-lx-car-2017-lexus-lx-lexus-nx-class-of-2018-car-automatic-transmission.png","Lexus","LX570"));
        cars.add(new Car("https://newsroom.porsche.com/.imaging/mte/porsche-templating-theme/image_1290x726/dam/pnr/2022/Company/Porsche-deliveries-2021/The-all-electric-Porsche-Taycan-saw-an-outstanding-increase-with-41,296-units.jpeg/jcr:content/The%20all-electric%20Porsche%20Taycan%20saw%20an%20outstanding%20increase%20with%2041,296%20units.jpeg","Porsche","_____"));
    }
}