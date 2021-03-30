package be.technifutur.deploy.services;

import be.technifutur.deploy.dto.FlowerDTO;
import be.technifutur.deploy.entities.Flower;
import be.technifutur.deploy.mapper.Mapper;
import be.technifutur.deploy.repositories.FlowerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FlowerService {

    private final Mapper mapper;
    private final FlowerRepository flowerRepository;

    public FlowerService(Mapper mapper, FlowerRepository flowerRepository) {
        this.mapper = mapper;
        this.flowerRepository = flowerRepository;
    }

    public List<FlowerDTO> getAllFlowers() {
        return this.flowerRepository.findAll().stream()
                .map(mapper::toFlowerDTO)
                .collect(Collectors.toList());
    }
    public boolean insert(Flower flower) {
        if (flower != null) {
            Flower inserted =  this.flowerRepository.save(flower);
            return this.flowerRepository.existsById(inserted.getId());
        }

        return false;

    }
}
