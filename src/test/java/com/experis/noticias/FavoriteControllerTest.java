package com.experis.noticias;

import com.experis.noticias.controller.FavoriteController;
import com.experis.noticias.mock.FavoriteMock;
import com.experis.noticias.model.FavoriteModel;
import com.experis.noticias.service.FavoriteService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class FavoriteControllerTest {

    @InjectMocks
    private FavoriteController controller;

    @Mock
    private FavoriteService service;

    @Test
    public void listarGenerosMusicalesTest() {

        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

        when(service.listar()).thenReturn(FavoriteMock.mockListaFavoritos());
        ResponseEntity<List<FavoriteModel>> responseEntity = controller.listar();
        assertThat(responseEntity.getStatusCodeValue()).isEqualTo(200);
    }
}
