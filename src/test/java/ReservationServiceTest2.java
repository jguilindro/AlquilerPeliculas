import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.sql.Date;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;


public class ReservationServiceTest2 {
	@Rule 
	public MockitoRule mockitoRule = MockitoJUnit.rule();
	@Test
	 public void test()  {
		Date date1 = Mockito.mock(Date.class);
		Date date2 = Mockito.mock(Date.class);
		Movie pelicula  = spy(new Movie());
		pelicula.rentar(date1, date2);
		ReservationService rs= Mockito.mock(ReservationService.class);
		rs.isRentableUntil(pelicula, date1, date2);
		verify(rs, atLeastOnce()).isRentableUntil(pelicula, date1, date2);
	 }

}