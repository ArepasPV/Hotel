package com.explorenest.hotel.service;

import com.explorenest.hotel.domain.Hotel;
import com.explorenest.hotel.repository.HotelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {
    private HotelRepository repository;
    public List<Hotel> getHotels(){
        return repository.findAll();
    }

    public Hotel getHotel(String name) {
        return repository.findOneByName(name);
    }
}
