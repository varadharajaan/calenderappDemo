package com.example.CalenderAppDemo;

import static org.mockito.Mockito.when;

import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.CalenderAppDemo.Controller.CalenderAppController;
import com.example.CalenderAppDemo.DTO.CalenderAppDTO;
import com.example.CalenderAppDemo.DTO.IdDTO;
import com.example.CalenderAppDemo.Service.CalenderAppService;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class CalenderServiceTest {

	 	@InjectMocks
	    @Spy
	    private CalenderAppController CalenderAppController;
	 	
	 	@Mock
	 	private CalenderAppService clenderAppService;
	 	
	 	 @Test
	     public void  createEvent() {
	 		 
	 		 UUID id = UUID.randomUUID();
	 		 
	 		 IdDTO dto = new IdDTO(id);
	 		 CalenderAppDTO appDto =  new CalenderAppDTO();
	 		 appDto.setTitle("new event");
	     	
	     	when(clenderAppService.createEvent(appDto)).thenReturn(dto);
	     	clenderAppService.createEvent(appDto);	     	
	     	
	     	
	     }
}
