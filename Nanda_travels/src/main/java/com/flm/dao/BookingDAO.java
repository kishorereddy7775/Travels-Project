package com.flm.dao;

import com.flm.model.Booking;
import com.flm.model.Route;

public interface BookingDAO {
	Route getRoute(Booking book);
	Booking bookticket(Booking book);
}