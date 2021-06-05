package com.justvisit.justvisit.dashboard.booking;

import com.justvisit.justvisit.dashboard.category.Category;

import java.util.List;

public interface BookingService {

    List<Booking> findAll();

    Booking findById(int theId);

    void save(Booking booking);

    void deleteById(int theId);

}
