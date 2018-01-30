package com.example.demo.Converter;

public interface Converter<Entity, DTO> {

    public Entity convertToEntity(DTO dto);

    public DTO convertToDTO(Entity entity);
}
