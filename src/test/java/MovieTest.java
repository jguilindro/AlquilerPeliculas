import static org.mockito.Mockito.*;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;


public class MovieTest {
	@Mock
	Customer cliente;
	@Rule 
	public MockitoRule mockitoRule = MockitoJUnit.rule();
	
	 @Test
	 public void test()  {
		 Movie t  = spy(new Movie());
         boolean check = t.isRentableTo(cliente);
         when(check).thenReturn(true);
	 }
	

}