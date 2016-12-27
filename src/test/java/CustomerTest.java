
import static org.mockito.Mockito.*;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;


public class CustomerTest {
	@Mock
	Customer cliente;
	@Rule 
	public MockitoRule mockitoRule = MockitoJUnit.rule();
	
	 @Test
	 public void test()  {
		 Customer t  = spy(new Customer());
         boolean check = t.isAdult();
         when(check).thenReturn(true);
 }
}
