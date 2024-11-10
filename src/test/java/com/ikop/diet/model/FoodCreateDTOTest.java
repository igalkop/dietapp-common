package com.ikop.diet.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.assertj.core.api.Assertions.assertThat;

class FoodCreateDTOTest {

    private FoodCreateDTO foodCreateDTO;

    @BeforeEach
    public void setup() {
        foodCreateDTO = new FoodCreateDTO("name1", 2.5d, "desc1");
    }

    @Test
    void getName() {
        assertThat(foodCreateDTO.getName()).isEqualTo("name1");
    }

    @Test
    void getPoints() {
        assertThat(foodCreateDTO.getPoints()).isEqualTo(2.5d);
    }

    @Test
    void getDescription() {
        assertThat(foodCreateDTO.getDescription()).isEqualTo("desc1");
    }

    @Test
    void setName() throws NoSuchFieldException, IllegalAccessException {
        foodCreateDTO.setName("name2");
        Field declaredField = foodCreateDTO.getClass().getDeclaredField("name");
        declaredField.setAccessible(true);
        String newName = (String) declaredField.get(foodCreateDTO);

        assertThat(newName).isEqualTo("name2");

    }

    @Test
    void setPoints() throws NoSuchFieldException, IllegalAccessException {
        foodCreateDTO.setPoints(4.5d);
        Field declaredField = foodCreateDTO.getClass().getDeclaredField("points");
        declaredField.setAccessible(true);
        Double newName = (Double) declaredField.get(foodCreateDTO);

        assertThat(newName).isEqualTo(4.5d);
    }

    @Test
    void setDescription() throws NoSuchFieldException, IllegalAccessException {
        foodCreateDTO.setDescription("desc2");
        Field declaredField = foodCreateDTO.getClass().getDeclaredField("description");
        declaredField.setAccessible(true);
        String newName = (String) declaredField.get(foodCreateDTO);

        assertThat(newName).isEqualTo("desc2");
    }
}