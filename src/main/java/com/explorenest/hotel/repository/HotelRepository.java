package com.explorenest.hotel.repository;

import com.explorenest.hotel.domain.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {
    Hotel findOneByName(String name);
}
