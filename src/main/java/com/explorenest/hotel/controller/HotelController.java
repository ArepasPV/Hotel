package com.explorenest.hotel.controller;

import com.explorenest.hotel.domain.Hotel;
import com.explorenest.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/hotel")
public class HotelController {
    @Autowired
    private HotelService service;

    @GetMapping("list")
    public List<Hotel> getHotels(){
        return service.getHotels();
    }

    @GetMapping("get")
    public Hotel getHotel(@RequestParam("name") String name){
        return service.getHotel(name);
    }
}
