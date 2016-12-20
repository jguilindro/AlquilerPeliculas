import java.util.Date;

public class ReservationService {
	public boolean isRentableUntil(Movie pelicula, Date fRenta, Date fRetorno){
		if (pelicula.isRented)
		{
			if(fRenta.after(pelicula.fecha_retorno))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
}
