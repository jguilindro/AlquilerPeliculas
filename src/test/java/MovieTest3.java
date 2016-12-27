import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.sql.Date;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;


public class MovieTest3 {
	@Rule 
	public MockitoRule mockitoRule = MockitoJUnit.rule();
	@Test
	 public void test()  {
		Movie pelicula  = spy(new Movie());
        pelicula.devolver();
        assertFalse(pelicula.isRented);
	 }

}
