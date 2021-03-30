package be.technifutur.deploy.mapper;

import be.technifutur.deploy.dto.FlowerDTO;
import be.technifutur.deploy.entities.Flower;
import org.springframework.stereotype.Service;

@Service
public class Mapper {

    public FlowerDTO toFlowerDTO (Flower flower) {
        return flower != null ? FlowerDTO.builder()
                .id(flower.getId())
                .name(flower.getName())
                .build() : null;
    }

    public Flower toFlowerEntity (Flower flower) {
        return flower != null ? Flower.builder()
                .id(flower.getId())
                .name(flower.getName())
                .build() : null;
    }
}
