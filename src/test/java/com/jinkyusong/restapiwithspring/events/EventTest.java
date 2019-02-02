package com.jinkyusong.restapiwithspring.events;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * public 도메인의 요건
 * 1. builder로 생성 가능해야 함.
 * 2. 기본 생성자로 생성 가능해야 함.
 */
public class EventTest {

    @Test
    public void builder() {
        Event event = Event.builder()
                .name("inflearn spring REST API")
                .description("REST API devleopment")
                .build();
        assertThat(event).isNotNull();
    }

    @Test
    public void javaBean() {
        // Given
        String name = "Event";
        String description = "Spring";

        // When
        Event event = new Event();
        event.setName(name);
        event.setDescription(description);

        // Then
        assertThat(event.getName()).isEqualTo(name);
        assertThat(event.getDescription()).isEqualTo(description);
    }

}