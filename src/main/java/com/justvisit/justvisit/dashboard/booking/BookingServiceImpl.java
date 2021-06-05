package com.justvisit.justvisit.dashboard.booking;

import com.justvisit.justvisit.dashboard.category.Category;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class BookingServiceImpl implements BookingService{

    private final BookingRepository bookingRepository;

    @Autowired
    public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public List<Booking> findAll() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking findById(int theId) {
        Optional<Booking> result = bookingRepository.findById(theId);

        Booking booking= null;

        if (result.isPresent()) {
            booking = result.get();
        } else {
            // we didn't find the product
            throw new RuntimeException("Did not find booking id - " + theId);
        }

        return booking;
    }

    @Override
    public void save(Booking booking) {
        bookingRepository.save(booking);

    }

    @Override
    public void deleteById(int theId) {
    bookingRepository.deleteById(theId);
    }
}
