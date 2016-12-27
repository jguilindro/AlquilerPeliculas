import static org.mockito.Mockito.*;
import java.sql.Date;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;


public class RentalFrontendTest {
	@Rule 
	public MockitoRule mockitoRule = MockitoJUnit.rule();
	@Test
	 public void test()  {
		Date date1 = Mockito.mock(Date.class);
		Date date2 = Mockito.mock(Date.class);
		Movie pelicula  = Mockito.mock(Movie.class);
		Customer cliente = Mockito.mock(Customer.class);
		RentalFrontend rf = Mockito.mock(RentalFrontend.class);
		rf.isRentable(pelicula, cliente, date1, date2);
		verify(rf, atLeastOnce()).isRentable(pelicula, cliente, date1, date2);
	 }

}
