import java.util.Date;



public class RentalFrontend {
	
	private ReservationService reservationService;
	public RentalFrontend(ReservationService reservationService)
	{
		this.reservationService = reservationService;
	}
	public boolean isRentable(Movie movie, Customer customer, Date date)
	{
		return movie.isRentableTo(customer) && reservationService.isRentableUntil(movie, date); 
	}

}
